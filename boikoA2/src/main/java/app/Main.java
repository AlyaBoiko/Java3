package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("Do your parents know? You should enter Yes or No");
            String know = input.next();
            if (know.equals("Yes")) {
                System.out.println("Ok, you can take the cradit");
            } else System.out.println("Sorry, Lets try later");

        } else System.out.println("Ok, you can take the cradit");

        switch (age) {
            case 0:
                System.out.println("You was born right now");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Your age so good");
                break;
            case 4:
                System.out.println("You are grow up!");
                break;
            default:
                System.out.println("IDK");
        }
        //int sum = 0;
// напишем калькулятор
        for (int i = 2; i < 10; i++) {
            for (int k = 2; k < 10; k = k + 2) {
                /*System.out.print(i);
                System.out.print(" * ");
                System.out.print(k);
                System.out.print(" = ");
                System.out.println(i*k);*/
                System.out.println(String.format("%2d * %2d = %2d", i, k, i * k));

            }

            System.out.println("--------------");
            System.out.println("--------------");
        }
// и еще один калькулятор, но в один цикл
        int m = 2;

        for (int l = 2; l < 10; l = (m == 9) ? l + 1 : l, m = (m < 9) ? m + 1 : 2) {
            System.out.println(String.format("%2d * %2d = %2d", l, m, l * m));
            if (m == 9) {
                System.out.println("--------------");
                System.out.println("--------------");
            }
        }
// do->while
        String value;
        do {
            System.out.println("Are you happy with your salary?");
            value = input.next();

        } while (!value.equalsIgnoreCase("yes"));

//while
        String value2 = "";
        System.out.println("Сколько еще раз тебе лет?");
        int age2 = input.nextInt();
        int counter = 0;
        while ((age2 >= 18) && !value2.equalsIgnoreCase("yes")) {
            System.out.println("Are you happy with your salary?");
            value2 = input.next();
            counter++;
            if (counter == 3)
                break;
        }

        for (int b = 0; b<=10; b++){
            if (b == 5)
                continue; //break;
            System.out.println(b);

        }

        System.out.println("Ваш возраст?");
        int age3 = input.nextInt();

        String[] shopList = {"Cake", "Sweet", "Milk", "Sour", "Pasta", "Beer", "Tomato"};
        String[] megaShopList = shopList.clone(); // создание нового массива с помощью клонирования
        String[] shopList2 = shopList; // новый массив не создается, а сохраняется ссылка на старый массив
        shopList[3] = "DRILL!!!";
        Arrays.sort(shopList); // сортировка массива в порядке возрастания

        Integer[] number = {2,85,469,-741, -5};
        Arrays.sort(number, Collections.reverseOrder()); // отсортировать в порядке убывания
        System.out.println(number[0]);

        for (String item : megaShopList){
            if ((age3<18) && (item.equalsIgnoreCase("Beer")))
                continue;
            System.out.println(item.toUpperCase());// System.out.println(item);
        }

        boolean haveList = Arrays.asList(shopList).contains("sausages");
        System.out.println(haveList);

        Random random = new Random();
        for (int a = 0; a < 100; a++){
            String item = shopList[random.nextInt(5)];
            System.out.print("Random item = ");
            if (item.equalsIgnoreCase("Beer")||item.equalsIgnoreCase("Wine")){
                System.out.println("CENSORED");
            } else {
                System.out.println(item);
        }
        }

        // Задачка, угадать какое следующее число
        System.out.println("What is the next number? ");
        int num = -1;
        for(int b = 0; b<3; b++){
            num += 3;
            System.out.print(num);
            System.out.print(" ");
            num *= 2;
            System.out.print(num);
            System.out.print(" ");
        }

        int answer = input.nextInt();
        if (answer == 37){
            System.out.println("correct");
        }else {
            System.out.println("It is wrong answer, try again");
        }

        System.out.println("Bye");
    }
}

