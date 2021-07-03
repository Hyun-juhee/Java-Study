package FunctionalInterface;

import java.util.function.Consumer;

/**
 * 람다 표현의 특징
 */
public class Lambda {
    private void run() {
        int baseNumber = 10; // 변수가 캡쳐된다.

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11 - 쉐도윙
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        };

        // 람다 - 쉐도윙이 안된다. : run과 scope이 같다.
        Consumer<Integer> printT = (i) -> {
//            int baseNumber = 11; // 에러! 같은 scope안에 같은 변수명을 사용할 수 없다.
            System.out.println(i);
        };
    }
}
