package piyu.java.examples.ds;

public class ArrayExample {
    public static void main(String[] args) {
        int a=0;
        System.out.println(a);

        int[] primeNumber = new int[5];

        primeNumber[0] = 9;
        primeNumber[1] = 90;
        primeNumber[2] = 94;
        primeNumber[3] = 92;
        primeNumber[4] = 97;

        for (int i = 0; i < primeNumber.length; i++) {
            System.out.println("Element at:" + i + " is:" + primeNumber[i]);
        }

        String[] fruitNames = new String[10];
        fruitNames[0] = "Apple";
        fruitNames[1] = "Mango";

        for (int i = 0; i < fruitNames.length; i++) {
            System.out.println(i+".."+fruitNames[i]);
            System.out.println(i+".."+fruitNames[i].length());
            System.out.println(i+".."+fruitNames[i].charAt(3));
            System.out.println(i+".."+fruitNames[i].indexOf("p"));
            System.out.println(i+".."+fruitNames[i].toLowerCase());
            System.out.println(i+".."+fruitNames[i].toUpperCase());
            System.out.println(i+".."+fruitNames[i].equals("Apple"));
        }


    }
}
