package interfaceMethod.src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /***
         * default, static method
         */
        Foo.printFoo(); // static method

        FooImplement foo = new FooImplement("Test");
        foo.printName();

        /**
         * forEach, removeIf, sort
         */
        List<String> names = new ArrayList<>();
        names.add("juhi");
        names.add("juhe");
        names.add("juhui");

        names.forEach(System.out::println);

        names.removeIf(s -> s.endsWith("e"));

        names.sort(String::compareTo);
        Comparator<String> comparator = String::compareTo;
        names.sort(comparator.reversed());
    }
}
