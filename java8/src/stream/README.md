# Stream
### Stream의 특징
- 데이터를 담고 있는 저장소(collection)이 아니며 그냥 처리해주는 역할이다.
- stream 처리가 소스를 변경하지 않는다.
- stream으로 처리하는 데이터는 오직 한 번만 처리한다.
- intermediate operation이라 lazy하다.
- parallelStream을 이요해서 병렬처리를 할 수 있다.
- 그냥 stream만 사용하면 return타입 = Stream<>
- terminal operation : collect, allMatch, anyMatch, forEach, count, min, max

### Stream pipeline
- intermediate operation과 한개의 terminal operation으로 구성한다. 
- stream은 terminal operation를 실행할 때에만 처리한다. 

### Stream API
- filter(<조건문>) : 조건에 맞는 원소만 반환
- map : 입력으로 들어오는 인자의 타입을 바꿔서 리턴
- flatMap : 원소만 리스트로 
- skip(n) : 앞에 n개 제외
- limit(n) : 최대 n개
- anyMatch(<조건문>) : 종료 오퍼레이션, 하나라도 조건에 맞으면 true
- allMatch(<조건문>) : 종료 오퍼레이션, 모두가 조건에 맞으면 true

### Collectors
- .collect(Collectors.toList())
- .collect(Collectors.toSet())
- .collect(Collectors.toMap()) 