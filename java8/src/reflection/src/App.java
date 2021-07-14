package reflection.src;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 리플렉션을 이용해 임의의 클래스에 접근하기
         */
        Class<Book> bookClass = Book.class;

        Book book = new Book();
        Class<? extends Book> bookClass1 = book.getClass();

        Class<?> bookClass2 = Class.forName("reflection.src.Book");

        // 필드
        Arrays.stream(bookClass.getFields()).forEach(System.out::println); // public만 리턴
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f->{
            int modifier = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate((modifier)));
            System.out.println(Modifier.isStatic((modifier)));
        });

        // 메소드
        Arrays.stream(bookClass.getMethods()).forEach(System.out::println);

        // 생성자
        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

        // 상위 클래스
        System.out.println(MyBook.class.getSuperclass());

        // 인터페이스
        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
    }
}
