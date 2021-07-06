# Optional
### optional이 필요한 이유
- null을 리턴할 수 있는 함 수 에대해 if문으로 예외처리 해줘야 했다. 
- nullPoint 에러가 발생할 가능성이 크다. 
- null일 수도 있는 값에 대한 타입을 Optional을 이용해서 준다. 
- optional은 리턴 타입으로만 사용하는 것을 권장한다. 
```java
public Optional<Progress> getProgress() {
    return Optional.ofNullable(progress);
}
```
```java
Optional<Progress> progress = spring_boot.getProgress();
progress.ifPresent(p-> System.out.println(p.getStudyDuration()));
```
### optional API
- Optional 타입 
    - Optional.ofNullable() : null일 수 있음
    - Optional.of() : 항상 값이 있어야 한다.
    - Optional.empty() : 비어있는 객체 
- 메소드
    - .isPresent() : 값이 있으면 true
    - .isEmpty() : null이면 true
    - .get() : 값이 없을 때 에러가 나기 때문에 사용 지양
    - .ifPresent() : 값이 있는 경우에 동작 지정
    - .orElse() : 값이 있으면 가져오고 없는 경우 괄호 안을 리턴 
    ```java
    optional.ifPresent(oc -> System.out.println(oc.getTitle()));
    OnlineClass onlineClass1 = optional.orElse(createNewClass());
    ```