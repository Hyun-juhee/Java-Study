package reflection.src;

public class Book {
    private String a;
    private static String b;
    public static String c = "BOOK";
    public String d;
    protected String e;

    public Book() {
    }

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println('F');
    }
    public void g() {
        System.out.println('G');
    }
    public int h() {
        return 1;
    }
}
