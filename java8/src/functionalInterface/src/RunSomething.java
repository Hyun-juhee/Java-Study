package functionalInterface.src;
/**
* 함수형 인터페이스
*/
@FunctionalInterface
public interface RunSomething {
    void printNumber(int number);
    static void printName() {
        System.out.println("Juhi");
    }
    default void printAge() {
        System.out.println(21);
    }
}
