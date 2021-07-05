# 인터페이스의 변화
### default method
- interface에 default키워드를 통해서 이미 구현된 메소드를 제공할 수 있다.
- default로 미리 구현해두고, 필요한 것만 상속받아서 구현할 수 있다.
- default 메소드도 재정의할 수 있다.
- 두 가지 interface를 상속받아서 구현할 때, 같은 이름을 가진 default메소드가 양 interface에 모두 있다면 어떤걸 상속 받아야 하는지 몰라서 컴파일 에러가 발생한다.
```java
// interface
public interface Foo {
    void printName();
    String getName();

    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }
}
```
### static method
- static 메소드는 객체를 선언하지 않고 바로 클래스에서 가져와서 사용할 수 있다.
- 이때 static 메소드 내에는 멤버 변수가 포함되면 안된다.
```java
public interface Foo {
    void printName();
    String getName();
    static void printAnything() {
        System.out.println(getName()); // 에러 
    }
}
```
### 자바 API의 메소드 
1. forEach
    ```java
   List<String> names = new ArrayList<>();
   ...
    names.forEach(s-> System.out.println(s)); // 각 element 순회
    names.forEach(System.out::println); // 메소드 참조
    ```
2. removeIf : 조건에 맞으면 배열에서 제거
    ```java
    names.removeIf(s->s.startsWith("k"));
    ```
3. sort
    ```java
   // 오름차순
    List<String> names = new ArrayList<>();
    names.sort(String::compareToIgnoreCase);
   
   // 내림차순
   Comparator<String> comparatorToIgnoreCase = String::compareToIgnoreCase;
    names.sort(comparatorToIgnoreCase.reversed());
    ```