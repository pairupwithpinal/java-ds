package piyu.java.examples.ds;

import java.util.*;

public class ArrayKey {
    private int a[] = new int[10];
    private int key;


    public void getdata() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the no you want to search: ");
        key = sc.nextInt();
    }


    public void search() {

        int flag = 0;
        int pos = 0;

        for (int i = 0; flag==0 && i < 10; i++) {
            if (a[i] == key) {
                flag = 1;
                pos = i + 1;
            }
        }
        if (flag == 1) {
            int i;
            System.out.println("We found the number at::" + pos);
        } else {
            System.out.println("Number not  found");
        }
    }

}