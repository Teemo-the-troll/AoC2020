
/*
 * 1-3 a: abcd
 * splice it into 1, 3, a, abcd
 * then use those as arguments
 *
 * use arraylist to store the
 *
 *
 * TODO: make a method which will count how many times a char is present in a string
 * TODO: make an Password class with (min, max, passChar, password, isValid)
 * */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        ArrayList<Password> passes = new ArrayList<Password>();
        File rawPasses = new File("C:/Users/Kiku/Documents/GitHub/AoC2020/2/src/main/passes.txt");
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(rawPasses);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String tempPass;
        String[] x;
        while (sc.hasNextLine()) {
            tempPass = sc.nextLine();
            x = tempPass.split("([ -]|: )");
            passes.add(new Password(Integer.parseInt(x[0]) , Integer.parseInt(x[1]), x[2].charAt(0), x[3]));
        }
        System.out.println(passes.stream().filter(Password::isValid).count());
    }
}
