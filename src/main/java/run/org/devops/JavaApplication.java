package run.org.devops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class JavaApplication {

    public static void main(String[] args) {
        List<String> objList = new ArrayList<>();
        objList.add("Peter");
        objList.add("James");
        objList.add("Bart");

        IntStream.range(0, objList.size())
                .mapToObj(i -> (i > 0 ? "," : "") + objList.get(i))
                .forEach(System.out::println);

        objList.stream()
                .skip(1)
                .map(s -> "," + s)
                .forEach(System.out::println);
    }
}
