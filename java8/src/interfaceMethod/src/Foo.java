package interfaceMethod.src;

public interface Foo {
    void printName();
    String getName();

    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }
    public static void printFoo() {
        System.out.println("Foo"); // 가능
//        System.out.println(getName()); // 에러
    }
}