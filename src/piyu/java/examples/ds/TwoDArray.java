package piyu.java.examples.ds;

import java.util.*;

public class TwoDArray {

    private int a[][] = new int[4][4];

    void getdeta() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter the number: ");
                a[i][j] = sc.nextInt();

            }

        }

    }

    public void setdata() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] +" ___ ");
            }
            System.out.println();
        }


    }
}