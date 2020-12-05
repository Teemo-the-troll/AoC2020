package cz.educanet.aoc.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Passport {

    static List<String> validEcl = Arrays.asList("amb", "blu", "brn", "gry", "grn", "hzl", "oth");

    public static ArrayList<ArrayList<String>> toPassport(ArrayList<String> raw) {
        String x = "";
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (String value : raw) {
            if (!value.equals(""))
                x = x.concat(" " + value).trim();
            else {
                ArrayList<String> tempPass = Arrays.stream(x.split("([ ])")).filter(s -> !s.contains("cid")).collect(Collectors.toCollection(ArrayList::new));
                x = "";
                if (tempPass.size() == 7)
                    temp.add(tempPass);
            }
        }
        return temp;
    }

    public static String removeIdent(String raw) {
        return raw.substring(4);
    }


    private static boolean isInbetween(int min, int max, int val) {
        return ((min <= val) && (val <= max));
    }

    public static boolean validify(ArrayList<String> passport) {
        Collections.sort(passport);
        ArrayList<String> temp = new ArrayList<String>();
        passport.forEach(i -> temp.add(removeIdent(i)));
        if (!isInbetween(1920, 2002, Integer.parseInt(temp.get(0))))
            return false;
        if (!validEcl.contains(temp.get(1)))
            return false;
        if (!isInbetween(2020, 2030, Integer.parseInt(temp.get(2))))
            return false;
        if (!temp.get(3).matches("(#[0-9a-f]{6})"))
            return false;
        String hgt = temp.get(4);
        int hgtVal = Integer.parseInt(hgt.substring(0, hgt.length() - 2));
        if ((hgt.contains("cm") && !isInbetween(150, 193, hgtVal)))
            return false;
        else if ((hgt.contains("in") && !isInbetween(59, 76, hgtVal)))
            return false;
        if (!isInbetween(2010, 2020, Integer.parseInt(temp.get(5))))
            return false;
        return temp.get(6).matches("([0-9]{9})");
    }


}

