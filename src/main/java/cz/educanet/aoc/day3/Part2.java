package cz.educanet.aoc.day3;

public class Part2 {
    public static void main(String[] args) {
        System.out.println(TreeFinder.treeAmount(1, 1) * TreeFinder.treeAmount(3, 1) * TreeFinder.treeAmount(5, 1) * TreeFinder.treeAmount(7, 1) * TreeFinder.treeAmount(1, 2));
    }
}
