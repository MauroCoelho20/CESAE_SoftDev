import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { ;

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            ArrayList<String> list = new ArrayList<>();

            list.add(String.valueOf(123));

            list.add("Hello");
            System.out.println(list.get(0) + list.get(1));


        }
    }
}