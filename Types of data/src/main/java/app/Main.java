package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stakan;
        double ddd = 6.34;
        char j = 'j'; //only one simbol
        String name;
        name = "Rjgdfrj";
        var variative = "fgsd";
        var variative2 = 9;
        stakan = 5;
        stakan = 6;
        final String FOO = "young"; //постоянная переменная, изменить нельзя
        boolean type = !true;
        boolean type2 = true || false;
        boolean type3 = true && false;
        boolean type4 = stakan > 6;
        boolean type5 = (stakan > 6) && (name == "Rjgdfrj");
        stakan = stakan + 8;
        stakan -= 5;
        stakan = type ? 8 : 33; // если тип равно true, то стакану присовится 8, если false, то  33

        System.out.println(name);
        System.out.println(stakan);
        System.out.println(type);
        System.out.println(type2);
        System.out.println(type3);
        System.out.println(type4);
        System.out.println(type5);

        Scanner input = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        int age = input.nextInt();
        String result = (age >= 18) ? "You can take the credit" : "Lets try later";

        System.out.println(result);
        //System.out.println("Your age is " + age);
    }
}