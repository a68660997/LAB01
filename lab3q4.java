import java.util.Vector;
import java.util.Iterator;

public class lab3q4 {       //2022F-BSE-290
    public static void main(String[] args) {
        
        Vector<Integer> numbers = new Vector<Integer>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("INTEGERS IN THE VECTOR : ");
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSUM OF THE INTEGERS: " + sum);
    }
}
