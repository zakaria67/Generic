package be.intecbrussel;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
       // Predicate condition =element->element != null;
        Predicate<String> condition = element-> element != null;
        Predicate<String> condition2 = element->  !element.isEmpty();

        String[] strArr= {"Hello", "world", "Yes",null, "Generic"};
        //System.out.println(Arrays.toString(strArr));

        Stream.of(strArr)
                //.peek(System.out::println)
                .filter(condition)
                .filter(condition2)
                .forEach(word-> System.out.println("Filterd"+ word));
    }
}
