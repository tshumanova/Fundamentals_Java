package Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Articles2 {


    public static class Article1 {
        private final String title;
        private final String content;
        private final String author;

        public Article1(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }


        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Article1> books = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String com = scanner.nextLine();
            String title = com.split(",\\s")[0];
            String content = com.split(",\\s")[1];
            String author = com.split(",\\s")[2];
            Article1 tmp = new Article1(title, content, author);
            books.add(tmp);
        }

        String searchCriteria = scanner.nextLine();
        for (Article1 book : books) {
            System.out.printf("%s - %s: %s%n", book.getTitle(), book.getContent(), book.getAuthor());
        }
    }
}


