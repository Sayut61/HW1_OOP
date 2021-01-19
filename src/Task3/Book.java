package Task3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию автора: ");
        Autor autor = new Autor(in.nextLine());
        System.out.println("Введите название книги: ");
        Title title = new Title(in.nextLine());
        System.out.println("Введите содержание: ");
        Content content = new Content(in.nextLine());

        autor.show();
        title.show();
        content.show();
    }
}
