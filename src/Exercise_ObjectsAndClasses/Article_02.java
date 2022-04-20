package Exercise_ObjectsAndClasses;

import java.util.Scanner;

public class Article_02 {
    public static class Article {
        //полета
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String newTitle) {
            this.title = newTitle;
        }

        public void setContent(String newContent) {
            this.content = newContent;
        }

        public void setAuthor(String newAuthor) {
            this.author = newAuthor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articlesParts = scanner.nextLine().split(" ");


        String title = articlesParts[0];
        String content = articlesParts[1];
        String author = articlesParts[2];

        Article article = new Article(title, content, author);
        int commandCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= commandCount; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(":")[0];
            String commandValue = command.split(": ")[1];

        }
    }
}
