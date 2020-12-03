package cz.educanet.aoc.day1;

import cz.educanet.aoc.resources.Resources;

import java.io.File;
import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        File numsers = new File("C:/Users/Kiku/Documents/GitHub/AoC2020v1/src/main/java/cz/educanet/aoc/resources/1.txt");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String s : Resources.inputToArraylist(numsers))
            nums.add(Integer.parseInt(s));
        for (int i = 0; i < nums.size(); i++) {
            int find1 = nums.get(i);
            for (int j = i; j < nums.size(); j++) {
                int find2 = nums.get(j);
                for (int k = j; k < nums.size(); k++) {
                    int find3 = nums.get(k);
                    if (find1 + find2 + find3 == 2020) {
                        System.out.println(find1 * find2 * find3);
                        return;
                    }

                }

            }
        }
    }
}
