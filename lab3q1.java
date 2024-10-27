import java.util.Arrays;
public class lab3q1 {       // 2022F-BSE-290
    public static void main(String[] args) {
        
        int [] array1 = {1,2,3,4};
        int [] array2 = {5,6,7,8};

        for (int i=0; i<array1.length; i++) {
            int array3 = array1[i];
            array1[i] = array2[i];
            array2[i] = array3;
        }
        System.out.println("ARRAY 01 IS: ");

        for (int j=0; j<array1.length; j++) {
            System.out.print(array1[j]+" ");
        }
        System.out.println("\nARRAY 02 IS: ");
        //make changes in any file
        for (int k=0; k<array2.length; k++) {
            System.out.print(array2[k]+" ");
        }
    }
}

