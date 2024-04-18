package Construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayinfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayinfo();

        Book book3 = new Book("JPA 프로그래밍", "Kim",700);
        book3.displayinfo();

    }

}
