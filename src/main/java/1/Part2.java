import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        File numsers = new File("C:/Users/Kiku/Documents/GitHub/AoC2020/1/src/main/java/nums.txt");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        try {
            sc = new Scanner(numsers);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }

        for (int i = 0; i < nums.size(); i++) {
            int find1 = nums.get(i);
            for (int j = i; j < nums.size(); j++) {
                int find2 = nums.get(j);
                for (int k = j; k < nums.size(); k++) {
                    int find3 = nums.get(k);
                    if (find1 + find2 + find3 == 2020) {
                        System.out.println(find1*find2*find3);
                        System.out.println(find1);
                        System.out.println(find2);
                        System.out.println(find3);
                        return;
                    }

                }

            }
        }
    }
}
