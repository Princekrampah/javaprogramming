import java.time.LocalDate;
import java.util.*;

public class Part_01 {
    public static void main(String[] args) {
        // by default all non decimal numbers are treated as int, to tell the compiler
        // its not an int you must add a letter to specify the data type.
        int age = 90;
        long myData = 4_224_678_980L;
        float myFloat = 6.809F;
        System.out.println("Hello world");
        Date now = new Date();
        System.out.println(now);

        int data = (10 > 20) ? 10 : 20;

        System.out.println(data);

        int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
        Integer[] arr2 = new Integer[5];

        arr2[0] = 20;
        System.out.println(arr2[0]);

        for (int num : arr) {
            System.out.println(num);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Advanced for loop");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Math module");
        System.out.println((int) Math.sqrt(25));

        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username);

        int years = LocalDate.now().minusYears(24).getYear();
        System.out.println(years);
    }
}