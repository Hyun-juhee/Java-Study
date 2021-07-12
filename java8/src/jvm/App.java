package jvm;

public class App {
    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println(classLoader); // 애플리케이션 클래스 로더
        System.out.println(classLoader.getParent()); // 플랫폼 클래스 로더
        System.out.println(classLoader.getParent().getParent()); // 부트 스트랩 클래스 로더 - 네이티브로 구현되어 있어서 출력할 수 없다.
    }
}
