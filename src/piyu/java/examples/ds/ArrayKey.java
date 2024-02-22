package piyu.java.examples.ds;

import java.util.*;

public class ArrayKey {
    int a[] = new int[10];
    int key;
    int i;


    void getdata() {

        Scanner sc = new Scanner(System.in);
        //int i;
        for ( i = 0; i < 10; i++) {
            System.out.println("Enter the number: ");
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the no you want to search: ");
          key = sc.nextInt();
    }

    void Search() {
        int flag = 0;
        int pos = 0;

        for (i = 0; i < 10 && flag == 0; i++) {


            if (a[i] == key) {
                flag = 1;
                pos = i+1;
            }
        }
            if (flag == 1)
                System.out.println("We found the numer !! "+ pos);

             else
                System.out.println("Number not  found");



        }

    }