package cz.educanet.aoc.day2;

import java.util.ArrayList;

public class Password {
    int min;
    int max;
    char passChar;
    String password;
    boolean isValid;

    public Password(int min, int max, char passChar, String password, int validationMeth) {
        this.min = min;
        this.max = max;
        this.passChar = passChar;
        this.password = password;
        if (validationMeth == 1)
            this.isValid = validate(this.min, this.max, this.passChar, this.password);
        else
            this.isValid = validateNew(this.min, this.max, this.passChar, this.password);
    }

    public static ArrayList<Password> arrayToPass(ArrayList<String> arrayList, int valMeth) {
        ArrayList<Password> temp = new ArrayList<Password>(arrayList.size());
        for (String pass : arrayList) {
            String[] x = pass.split("([ -]|: )");
            temp.add(new Password(Integer.parseInt(x[0]), Integer.parseInt(x[1]), x[2].charAt(0), x[3], valMeth));
        }
        return temp;
    }

    private boolean validateNew(int min, int max, char passChar, String password) {
        return ((password.charAt(min - 1) == passChar) ^ (password.charAt(max - 1) == passChar));
    }

    private boolean validate(int min, int max, char passChar, String pass) {
        int count = (int) pass.chars().filter(ch -> ch == passChar).count();
        //int count = pass.length() - pass.replace(passChar, (char) 0).length();
        return (count <= max && count >= min);
    }

    public boolean isValid() {
        return isValid;
    }
}
