import java.util.ArrayList;

public class lab3q2 {                   // 2022F-BSE-290
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {5,6,7,8};

        ArrayList<Integer> array3 = new ArrayList<Integer>();

        for (int i=0; i<array1.length; i++) {
            array3.add(array1[i]);
        }

        for (int j=0; j<array2.length; j++) {
            array3.add(array2[j]);
        }
        System.out.println("MERGED LIST IS: ");

        for (Integer k : array3) {
            System.out.print(k +" ");
        }
    }
}
