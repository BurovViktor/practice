package collection;

import java.util.function.Function;
import java.util.function.IntFunction;

public class javaCollectionAQA {

    public static  <T,R>R[] arrayMapping(
            T[] array,
            Function<T, R> mapper,
            IntFunction<R[]> generator
    ){
        R[] result = generator.apply(array.length);

        for (int i = 0; i < array.length; i++) {
            result[i] = mapper.apply(array[i]);
        }

        return result;
    }
}
