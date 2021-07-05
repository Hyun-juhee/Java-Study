package interfaceMethod.src;

public class FooImplement implements Foo {
    String name;

    public FooImplement(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return name;
    }

    /*
    * printNameUpperCase는 default method로 구현하지 않아도 된다.
    * 아래처럼 재정의해서 사용할 수 있다.
    * */
    public void printNameUpperCase() {
        System.out.println(name.toUpperCase());
    }
}
