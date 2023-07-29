package Recursion;

import java.util.ArrayList;

public class Recursion3 {
    // print all permutations of a string
    // time complexity is => O(n!)
    public static void permutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            permutations(newString, permutation + currChar);
        }
    }

    // count total paths in a maze to move from (0,0) to (n,m)
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;
        // move downwards
        int downPaths = countPaths(i + 1, j, n, m);
        // move right
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    // place tiles of size 1xm in a floor of size nxm
    public static int placeTiles(int n, int m) {
        if (n == m)
            return 2;
        if (n < m)
            return 1;
        // vertically
        int verticalPlacement = placeTiles(n - m, m);
        // horizontally
        int horizontalPlacement = placeTiles(n - 1, m);
        return verticalPlacement + horizontalPlacement;
    }

    // find the number of ways in which you cam invite n people to your party,
    // single or in pairs
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int singleCount = callGuests(n - 1);
        // pairs
        int pairsCount = (n - 1) * callGuests(n - 2);
        return singleCount + pairsCount;
    }

    // print all the subsets of a set of first 'n' natural numbers
    // time complexity is => O(2^n)
    public static void findSubsets(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            System.out.println(subsets.toString());
            return;
        }
        // add hoga
        subsets.add(n);
        findSubsets(n - 1, subsets);
        // add nahi hoga
        subsets.remove(subsets.size() - 1);
        findSubsets(n - 1, subsets);
    }

    public static void main(String[] args) {
        // String str1 = "abc";
        // permutations(str1, "");

        // int n1 = 3, m1 = 3;
        // System.out.println(countPaths(0, 0, n1, m1));

        // int n2 = 40, m2 = 12;
        // System.out.println(placeTiles(n2, m2));

        // int n3 = 4;
        // System.out.println(callGuests(n3));

        int n4 = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n4, subset);
    }
}
