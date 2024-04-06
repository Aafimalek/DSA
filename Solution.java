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
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }

    public static void nForest8(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void nForest9(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.print("\n");
        }
    }

    public static void nForest10(int n) {
        int space = 2 * (n - 1);
        for (int i = 0; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("\n");
            space -= 2;
        }
    }

    public static void nForest11(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }

            System.out.print("\n");

        }
    }

    public static void nForest12(int n) {

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.print("\n");

        }
    }

    public static void nForest13(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.print("\n");

        }
    }

    public static void nForest14(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.print("\n");
        }
    }

    public static void nForest15(int n) {

        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }

    public static void nForest16(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.print("\n");
        }
    }

    public static void nForest17(int n) {
        char ch = 'C';
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch - j));
            }
            System.out.println();
        }

    }

    public static void nForest18(int n) {
        int initial = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < initial; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            initial += 2;
            System.out.println();
        }
        initial = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < initial; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            initial -= 2;
            System.out.println();
        }
    }

    public static void nForest19(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int n = 5;
        s1.nForest19(n);

    }
}
