import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {



    public static void main(String[] args) {
        File numsers = new File("C:/Users/Kiku/Documents/GitHub/AoC2020/1/src/main/java/nums.txt");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        try {
             sc = new Scanner(numsers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }
        for (int i = 0; i < nums.size(); i++) {
            int toFind =nums.get(i);
            for (int j = i; j < nums.size(); j++) {
                int found = nums.get(j);
                if (toFind + found == 2020) {
                    System.out.println(toFind*found);
                    System.out.println(toFind);
                    System.out.println(found);
                    return;
                }
            }
        }
    }
}
