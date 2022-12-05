// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 

import java.util.LinkedList;
import java.util.Random;

public class prog01 {

    public static void main(String[] args) {

        // Генерация случайных чисел
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            Random r = new Random(); 
            ll.add(i, r.nextInt(100));
        }

        System.out.println(ll);
        
        LinkedList<Integer> nll = new LinkedList<>();
        for (int i = ll.size()-1; i >=0; i--) {
            nll.add(ll.get(i));
        }
        System.out.println(nll);

    }
}