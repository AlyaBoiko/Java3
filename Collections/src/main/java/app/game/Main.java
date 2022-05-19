package app.game;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 1, 2, 3));
        ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));
        array.add(8); //добавляет значние в конец списка
        array.add(3, 5); // добавляет на позицию 3 число 5
        array.add(0, 7); // добавляет число 5 в начало списка
        array.remove(2); // удаляет значение с индексом 2
        array.set(5, 9); // замена 5 элемента на 9
        System.out.println(array.indexOf(1)); // показывает на каком месте стоит элемент
        System.out.println(array);
        Collections.sort(array); //сортирует список
        System.out.println(array);
        System.out.println(array.get(6)); // показывает какое значение в 6 индексе
        Collections.reverse(array); //Collection.sort(array, Comparator.reversOrder()); -такое написание более java-way
        Collections.rotate(array, 2);
        Collections.swap(array, 2, 5); //поменять метсами элемент 2 и 5
        Collections.shuffle(array); //перемешивае массив
        System.out.println(array);
        System.out.println(Collections.max(array));
        System.out.println(Collections.min(array));
        System.out.println(Collections.disjoint(array, array2)); // показывает нет ли повторяющихся элементов


        LinkedList<Integer> linked = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 6, 1, 2, 3));
        linked.add(0);
        linked.addAll(linked);
        System.out.println(linked);

// упорядочивает элементы по значению
        TreeSet<Integer> wow = new TreeSet<>();
        wow.add(48);
        wow.add(15);
        wow.add(56);
        wow.add(100);
        wow.add(0);
        System.out.println(wow);

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            wow.add(rand.nextInt(10000));
        }
        System.out.println(wow.contains(77));
        System.out.println(wow);

// упорядочивает элементы по хешу
        HashSet<Integer> wow2 = new HashSet<>();
        wow2.add(48);
        wow2.add(15);
        wow2.add(56);
        wow2.add(100);
        wow2.add(0);
        System.out.println(wow2);

        Random rand2 = new Random();
        for (int i = 0; i < 100; i++) {
            wow2.add(rand.nextInt(10000));
        }
        System.out.println(wow2.contains(77));
        System.out.println(wow2);

// упорядочивает элементы по первому значению

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(15, "John");
        map.put(3, "Olga");
        map.put(0, "Ivan");
        map.put(8, "Andrey");
        map.put(8, "Mark"); // Mark перезапишет АНдрея
        map.keySet();

        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.get(8));

        class MyPanel extends JPanel{
            ArrayList<Point>points = new ArrayList<>();
            Random random = new Random();
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                if(points.size()==0){
                    points.add(new Point(random.nextInt(300),random.nextInt(300)));
                }
                points.add(new Point(random.nextInt(300),random.nextInt(300)));
                g.setColor(Color.MAGENTA);
                g.drawRect(random.nextInt(200),
                        random.nextInt(200),
                        random.nextInt(200),
                        random.nextInt(200));
            }
        }
        JPanel panel = new MyPanel();
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        while (true){
            panel.repaint();
        }



    }

}
