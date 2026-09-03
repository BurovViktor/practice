package collection;


import java.util.Arrays;

public class Demo   {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        String[] strings = javaCollectionAQA.arrayMapping(
                numbers,
                number -> "Число: " + number,
                String[]::new
        );

        System.out.println(Arrays.toString(strings));
    }
}

