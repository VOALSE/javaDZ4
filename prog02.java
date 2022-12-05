// Реализуйте очередь с помощью LinkedList со следующими методами: 
// - enqueue() - помещает элемент в конец очереди, 
// - dequeue() - возвращает первый элемент из очереди и удаляет его, 
// - first() - возвращает первый элемент из очереди, не удаляя. 

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class prog02 {
    public static void main(String[] args) {
        // Генерация случайных чисел
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random(); 
            ll.add(i, r.nextInt(100));
        }
        System.out.println("Исходный список:\n" + ll);


        Scanner iScanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            
            System.out.printf("Введите команду: ");
            String nString = iScanner.nextLine();
            
            if (nString.equals("")) {
                break;
            }
            nString = nString.replace(")", "");
            String[] sArr = nString.split("\\(");


            if (sArr[0].equals("enqueue")) {
                ll.add(Integer.parseInt(sArr[1]));
                System.out.println(ll);
            }
            
            else if (sArr[0].equals("dequeue")) {
                System.out.println("Удаленный элемент - " + ll.remove(0));
                System.out.println(ll);
            } 

            else if (sArr[0].equals("first")) {
                System.out.println("Первый элемент - " + ll.getFirst());
            } else { 
                System.out.println("Введена неверная команда!");
            }
        }
        iScanner.close();
    }
}
