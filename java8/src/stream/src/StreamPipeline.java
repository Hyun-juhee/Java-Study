package stream.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("juhi");
        names.add("hyun");

        /**
         * 종료 오퍼레이션 없이 stream만 사용하면
         * -> 내부 동작이 실행되지 않는다.
         * -> Stream으로 반환한다.
         */
        Stream<String> stringStream = names.stream().map(s -> {
            System.out.println("stream " + s); // 실행 X
            return s.toUpperCase();
        });
        List<String> stringList = names.stream().map(s -> {
            System.out.println("stream+collect " + s); // 실행
            return s.toUpperCase();
        }).collect(Collectors.toList());

    }
}
