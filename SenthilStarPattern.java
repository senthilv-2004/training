/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class SenthilStarPattern {
    public static void main(String[] args) {
        int n = 7; // Pattern size

        for (int i = 0; i < n; i++) {
            // S
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n / 2 || i == n - 1 ||
                    (j == 0 && i < n / 2) ||
                    (j == n - 1 && i > n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            // T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            // I
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == n - 1 )) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next row
        }
    }
}
