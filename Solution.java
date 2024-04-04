import java.util.*;

public class Solution {
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }

    public static void nForest1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void nForest2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void nForest3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public static void nForest4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void nForest5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void nForest6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }

    public static void nForest7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*n-(2*i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int n = 5;
        s1.nForest6(n);
        s1.nForest7(n);
    }
}
