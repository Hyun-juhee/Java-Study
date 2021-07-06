package optional.src;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        OnlineClass onlineClass = new OnlineClass(1, "Java", true);
        Optional<Progress> progress = onlineClass.getProgress();

        // Optional에 값이 있는지 없는지 확인
        boolean present = progress.isPresent();
        boolean empty = progress.isEmpty();

        progress.ifPresent(oc -> System.out.println(oc.getStudyDuration()));
    }
}
