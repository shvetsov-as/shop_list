/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoplistvararg;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class ShopListVarArg {

    private static void shoppingList(String... items) {
        System.out.println("-----Shopping list-----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        shoppingList("milk", "potato", "again milk", "coca-cola", "bread", "corn flakes");

        // QUEUE
        Queue<Integer> q
                = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue.
        System.out.println("Elements of queue "
                + q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-"
                + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-"
                + head);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-"
                + size);

        ///////////////////////////////////////////////Lambda
        Lambda greeting = new Lambda() {//Anonimnyi klass
            @Override
            public void hello(String name) {
                System.out.println();
                System.out.println("---ANONIM---");
                System.out.println("Hello, dear " + name);
            }
        };

        Lambda greeting2 = (String name) -> {
            System.out.println();
            System.out.println("---LAMBDA---");
            System.out.println("Hello, dear " + name);
        };

        greeting.hello("John");
        greeting2.hello("John");

        System.out.println();
        System.out.println("!-----! LAMBDA 2 !-----!");

        Square s = new Square(4);

//        Shapes shapes = (Square square) ->{
//            return square.calculateArea();
//        };

        Shapes shapes = Square::calculateArea;/* Sokrashenie lambdbI 
        В интерфейсе метод getArea @override как реализация метода calculateArea из класса Square*/

        System.out.println("Area: " + shapes.getArea(s));

    }

}
