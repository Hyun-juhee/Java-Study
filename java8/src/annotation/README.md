# Annotation
### annotation 개념

- 프로그래미의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것
- 주석처럼 프로그래밍 언어에 영향을 미치지 않으면서도 다른 프로그램에게 유용한 정보를 제공할 수 있음

### 표준 annotation

- @Override : 컴파일러에게 오버라이딩하는 메서드라는 것을 알린다.
    - 컴파일러가 같은 이름의 메서드가 조상에 있는지 확인하고 없으면 에러
- @Deprecated : 앞으로 사용하지 않을 것을 권장하는 대상에 붙인다. 강제성은 없음
- @FunctionalInterface : 함수형 인터페이스라는 것을 알린다.
    - 함수형 인터페이스를 올바르게 선언했는지 확인하고 잘못된 경우 에러
- @SuppressWarning : 컴파일러가 보여주는 경고메세지가 나타나지 않게 억제
- @SafeVarargs : 메서드에 선언된 가변인자(정해지지 않은 개수의 인자를 받아야할 때)의 타입이 non-reifiable(런타임에 타입을 구체화하지 않는 타입)타입일 경우 해당 메서드를 선언하는 부분과 호출하는 부분에서 "unchecked"경고가 발생한다. → 이 경고 억제
- @Native : native 메서드에서 참조되는 상수 앞에

### 표준 meta annotation

meta annotation : 애너테이션을 정의하기 위한 애너테이션

- @Target : 애너테이션이 적용가능한 대상을 지정하는데 사용. 애너테이션이 적용될 수 있는 위치 결정
    - TYPE : class, interface, enum에 적용된다.
    - FIELD : 클래스 필드 변수
    - METHOD : 메서드
    - PARAMETER : 메서드 인자
    - CONSTRUCTOR : 생성자
    - LOCAL_VARIABLE : 로컬 변수
    - ANNOTATION_TYPE : 어노테이션 타입에만 적용된다
    - PACKAGE : 패키지
    - TYPE_PARAMETER : 자바8부터 추가. 제네릭 타입 변수에 적용된다. (ex. MyClass<T>)
    - TYPE_USE : 자바8부터 추가. 어떤 타입에도 적용된다 (ex. extends, implements, 객체 생성시등등)
- @Documented : 애너테이션 정보가 javadoc으로 작성된 문서에 포함되게 한다.
- @Inherited : 애너테이션이 자손 클래스에 상속되도록 한다.
- @Retention : 애너테이션이 유지되는 범위를 지정하는데 사용한다.
    - SOURCE : 자바 컴파일에 의해서 어노테이션은 삭제된다
    - CLASS : 어노테이션은 .class 파일에 남아 있지만, runtime에는 제공되지 않는 어노테이션으로 Retention policy의 기본 값이다
    - RUNTIME : runtime에도 어노테이션이 제공되어 자바 reflection으로 선언한 어노테이션에 접근할 수 있다
- @Repeatable : 애너테이션을 반복해서 적용할 수 있게 한다.

### annotation 요소

annotation내에서 선언되는 메소드

- 요소의 타입은 기본형, String, enum, annotation, Class만 허용된다.
- 매개변수를 선언할 수 없다.
- 예외를 선언할 수 없다.
- 요소를 타입 매개변수로 정의할 수 없다. → List<T> list(); 불가능