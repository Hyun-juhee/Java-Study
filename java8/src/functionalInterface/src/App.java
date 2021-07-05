package functionalInterface.src;

import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        /**
         * 람다 표현식을 이용해서 함수 형 인터페이스 구현하기
         */
        RunSomething runSomething = new RunSomething() {
            @Override
            public void printNumber(int number) {
                System.out.println(number);
            }
        };
        runSomething.printNumber(0);

        RunSomething runSomething1 = (number) -> System.out.println(number);
        runSomething1.printNumber(1);

        RunSomething runSomething2 = (number) -> {
            System.out.println(number);
            System.out.println(number);
        };
        runSomething2.printNumber(2);


        /**
         * 순수함수 : 외부에 있는 값에 의존하거나, 그 값을 변경하지 않는 함수
         */
        int baseNumber = 20;
        RunSomething runSomething3 = (number) -> {
            System.out.println(number + baseNumber); // 순수함수가 아니다.
        };
        runSomething3.printNumber(10);
    }

    /**
     * 람다 표현의 특징
     */
    public static class Lambda {
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
}
