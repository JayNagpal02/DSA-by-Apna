package Recursion;

import java.util.Arrays;
import java.util.HashSet;

public class Recursion2 {

    // Tower of Hanoi
    // time complexity is => O(2^n - 1) ~= O(2^n)
    // recursive equation is : T(n) = 2T(n - 1) + 1
    // where T(1) = 1

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    // print a string in reverse
    // time complexity is => O(n)
    public static void printInReverse(String src, int index) {
        if (index == -1)
            return;
        System.out.print(src.charAt(index));
        printInReverse(src, index - 1);
    }

    // find the ist and last occurrence of an element in string
    // time complexity is => O(n)
    public static void firstAndLastOccurrences(String src, char element, int index, int first, int last) {
        if (index == src.length()) {
            System.out.println("First Occurrences of " + element + " is at index : " + first);
            System.out.println("Last Occurrences of " + element + " is at index : " + last);
            return;
        }
        if (src.charAt(index) == element) {
            if (first == -1) {
                first = index;
            }
            last = index;
        }
        firstAndLastOccurrences(src, element, index + 1, first, last);
    }

    // check if an array is sorted (Strictly increasing)
    // time complexity is => O(n)
    // my method
    public static void checkingIsSorted(int[] arr, int index) {
        if (arr.length <= 0) {
            System.out.println("Invalid input | Array is empty");
            return;
        } else if (index == arr.length - 1) {
            System.out.println(Arrays.toString(arr) + " is sorted");
            return;
        } else if (arr[index] >= arr[index + 1]) {
            System.out.println(Arrays.toString(arr) + " is not sorted");
            return;
        } else {
            // array is sorted till now
            checkingIsSorted(arr, index + 1);
        }
    }

    // move all 'x' elements to the end of the string
    // time complexity is => O(n)
    // my method
    public static void movingAtEnd(StringBuilder src, char element, int index, int count) {
        if (index == src.length() - 1) {
            for (int i = 0; i < count; i++) {
                src.append(element);
            }
            System.out.println(src);
            return;
        } else if (src.charAt(index) == element) {
            src.delete(index, index + 1);
            count++;
            movingAtEnd(src, element, index, count);
        } else {
            movingAtEnd(src, element, index + 1, count);
        }
    }

    // video method
    public static void moveAllX(String src, int idx, int count, String newString) {
        if (idx == src.length()) {
            for (int i = 0; i < count; i++) {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = src.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(src, idx + 1, count, newString);
        } else {
            newString += currChar;
            moveAllX(src, idx + 1, count, newString);
        }
    }

    // remove duplicates in a string
    // time complexity is => O(n)
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    // print all the subsequences of a string
    // time complexity is => O(2^n)
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, newString + currChar);
        // or not to be
        subsequences(str, idx + 1, newString);
    }

    // print all the unique subsequences of a string
    // time complexity is => O(2^n)
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        uniqueSubsequences(str, idx + 1, newString + currChar, set);
        // or not to be
        uniqueSubsequences(str, idx + 1, newString, set);
    }

    // print keypad combination
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeypadCombination(String str, int idx, String combination) {

    }

    public static void main(String[] args) {
        // int n = 4;
        // towerOfHanoi(n, "S", "H", "D");

        // String src1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // printInReverse(src1, src1.length() - 1);
        // System.out.println();

        // String src2 = "abaahcdaefaah";
        // char element1 = 'a';
        // firstAndLastOccurrences(src2, element1, 0, -1, -1);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // checkingIsSorted(arr, 0);

        // StringBuilder sb1 = new StringBuilder("axbcxxd");
        // char element2 = 'x';
        // movingAtEnd(sb1, element2, 0, 0);
        // String src3 = "axbcxxd";
        // moveAllX(src3, 0, 0, "");

        // String src4 = "abbccda";
        // removeDuplicates(src4, 0, "");

        // String src5 = "abc";
        // subsequences(src5, 0, "");

        String src6 = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(src6, 0, "", set);
    }
}
