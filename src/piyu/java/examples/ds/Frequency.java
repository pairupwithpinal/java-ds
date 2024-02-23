package piyu.java.examples.ds;

import java.util.*;

public class Frequency {

  private   int a []= new int[8];
   private int key;
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {


            System.out.println("Enter the number: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to get freq:");
        key = sc.nextInt();
    }
        public void Count()
        {
            int count = 0;
            int freq = 0;
            for (int i = 0; i < 8; i++) {
                if (a[i] == key) {

                    count = count + 1;
                }
                System.out.println("Frequency of given number is: " + count);

            }

        }

        }