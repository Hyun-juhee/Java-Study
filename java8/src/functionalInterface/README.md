# 함수형 인터페이스 
### 함수형 인터페이스의 개념
- 인터페이스에 추상 메소드가 하나만 있으면 함수형 인터페이스 라고 한다.
- `@functionalInterface` 를 붙여서 보장할 수 있다.
- 다른 형태의 메소드가 있더라도 추상 메소드만 하나면 무조건 functional interface
- `static`메소드나 `default`메소드(나중에 나옴)은 추가할 수 있다.
- static메소드 앞에 public은 생략할 수 있다.
- interface의 모든 메소드는 `abstract`키워드 생략 가능 → 전부 추상 메소드

### 람다 표현식
- 람다 표현식으로 함수형 인터페이스의 함수를 구현할 수 있다. 
- 아래 두 코드는 내부적으로 같은 구현이다. 
- (함수형 인터페이스는 구현해야할 메소드가 하나뿐)
```java
RunSomething runSomething = new RunSomething() { 
    @Override
    public void printNumber(int number) {
        System.out.println(number);
    }
};
```
```java
RunSomething runSomething = (number) -> System.out.println(number);
```
### 람다 표현식의 특징
쉐도윙이 일어나지 않는다 : 람다 표현식은 바로 바깥과 같은 scope를 갖는다.
```java
private void run() {
    int baseNumber = 10; // 변수가 캡쳐된다.

    // 쉐도윙이 안된다. : run과 scope이 같다.
        Consumer<Integer> printT = (i) -> {
            int baseNumber = 11; // 에러! 같은 scope안에 같은 변수명을 사용할 수 없다.
        };
}
```