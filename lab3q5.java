import java.util.ArrayList;
import java.util.Scanner;

public class lab3q5 {       //2022F-BSE-290
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. ADD A STRING TO THE LIST.");
            System.out.println("2. DISPLAY ALL ELEMENTS.");
            System.out.println("3. DISPLAY THE LARGEST STRING.");
            System.out.println("4. EXIT.");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("ENTER A STRING: ");
                    String inputString = scanner.nextLine();
                    stringList.add(inputString);
                    break;
                case 2:
                    System.out.println("ALL ELEMENTS IN THE ARRAYLIST: ");
                    for (String str : stringList) {
                        System.out.println(str);
                    }
                    break;
                case 3:
                    if (stringList.isEmpty()) {
                        System.out.println("THE LIST IS EMPTY.");
                    } else {
                        String largestString = findLargestString(stringList);
                        System.out.println("THE LARGEST STRING IS: " + largestString); }
                    break;
                case 4:
                    System.out.println("EXITING THE PROGRAM.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE. PLEASE ENTER A VALID OPTION.");
                    break;
            }
        }                                   //2022F-BSE-290
    }
    public static String findLargestString(ArrayList<String> list) {
        String largestString = list.get(0);
        for (String str : list) {
            if (str.length() > largestString.length()) {
                largestString = str; }
        }
        return largestString;
    }
}
