package FunctionalInterface;

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
}
