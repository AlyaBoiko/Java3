package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        Integer[] numbers = {-8, -25, 13, 0, 11, -55, 822, 1, 42};

        /*System.out.println(numbers[2]);
        boolean isPresent = true;
        for (Integer item: numbers){
            if (item.equals(0)){
                isPresent = true;
            }
        }
        System.out.println("В массиве имеется 0");*/

        Arrays.sort(numbers);
        // Реализуем Бинарный поиск:
        // 1. находим число посередине
        // 2. сравниваем - если 11>0,то будет искать 0 слева,
        // если число<0, то ищет справа

        boolean isPresent = false;
        boolean finished = false;
        int startIndex = 0;
        int finishIndex = numbers.length - 1;
        int toFind = 0;

        do {
            int index = (startIndex + finishIndex) / 2;
            if (startIndex >= finishIndex) {
                finished = true;
            }
            if (numbers[index].equals(toFind)) {
                isPresent = true;
                break;
            } else if (numbers[index] > toFind) {
                finishIndex = index - 1;
            } else {
                startIndex = index + 1;
            }

        } while (!finished);
        System.out.println(isPresent);
//распределим количесто секунт по трем потокам равномерно
        Integer[] testTimes = {20, 34, 55, 22, 345, 33, 55, 44, 77, 789, 543, 100, 101, 62, 23, 43, 56, 78, 34};
        Integer[] threadSums = {0, 0, 0}; // seconds per thread
        String[] threads = {"", "", ""};
        Arrays.sort(testTimes, Collections.reverseOrder());
        for (Integer time : testTimes) {
            int min = threadSums[0];
            int minIndex = 0;
            for (int i = 0; i < threadSums.length; i++) {
                if (min > threadSums[i]) {
                    minIndex = i;
                }
            }
            threadSums[minIndex] += time;
            threads[minIndex] += time.toString() + ", ";
        }
        for (int k = 0; k < threadSums.length; k++) {
            System.out.println("Thread " + k + ":" + threads[k]);
            System.out.println("Thread sum " + threadSums[k]);
        }
//вывести наиболее подходящую строку к test
        String test = "John-17654-active-14";
        String[] array = {"John-17654-active-15", "Alan-15442-active-18", "Tracy-55678-closed", "Anthon-4567894-active-22"};
        int similarity = Math.abs(array[0].compareToIgnoreCase(test));
        String result = "";
        String result2 = "";
        for (String item : array) {
            int realSimilarity = Math.abs(item.compareToIgnoreCase(test));
            if (realSimilarity <= similarity) {
                result = item;
                similarity = realSimilarity;
            }
        }
        System.out.println(result);
//вывести только те, что начинаются на Tracy
        for (String item : array) {
            if (item.startsWith("Tracy")) {
                System.out.println(item);
            }
        }
//вывести только те, что не заканчиаются на closed
        for (String item : array) {
            if (!item.endsWith("closed")) {
                System.out.println(item);
            }
        }
//вывести только id
        for (String item : array) {
            int index = item.indexOf("-");
            //System.out.println(item.substring(index+1,index+6));
            String temp = item.substring(index + 1); //17654-active-15
            index = temp.indexOf("-");
            System.out.println(temp.substring(0, index));
        }
//заменить 15 на 10 (replace)
        for (String item : array) {
            // System.out.println(item.replace("15", "10")); таким образов везде изменится 15 на 10, что нехорошо
            if (item.endsWith("15")) {
                System.out.println(item.replace("15", "10")); // replacefirst - изменит первое попавшиееся 15
            }
        }
//выведем только имена из строки
        for (String item : array) {
            System.out.println(item.substring(0, item.indexOf("-")).toUpperCase());
        }
// уберем пробелы вначале и в конце
        String[] array2 = {"   John-17654-active-15  ", " Alan-15442-active-18   ", "    Tracy-55678-closed", "Anthon-4567894-active-22     "};
        for (String item : array2) {
            System.out.println(item.trim().substring(0, item.trim().indexOf("-")).toUpperCase()); //.trim() убирает пробелы
        }
//разделим строки в массиве по данным
        for (String item : array) {
            String[] parts = item.split("-"); // parts = ["Alen", "123", "active","age"]
            System.out.println("Name   = " + parts[0]);
            System.out.println("ID     = " + parts[1]);
            System.out.println("Status = " + parts[2]);
            if (parts.length == 4) {
                System.out.println("Age    = " + parts[3]);
            }
            System.out.println("----------------");
        }
//напишем проверку регулярного выражения
        String test2 = "hedghjkjhgfdxcvbno";
        System.out.println(test2.matches("he.*o")); //. - какой то символ, *- некоторое количество символов

//будем выводить только верные строки
        String[] array3 = {"John-17654-active-15", "Alan-15442-active-18", "fghsrh-sfhfr-sfnf-sfhnj", "Tracy-55678-closed", "Anthon-4567894-active-22"};
        for (String item : array3){
            if (item.matches("[A-Z][a-z]*-[0-9]*-[a-z]*.*")){
                System.out.println(item);
            }
        }

    }
}
