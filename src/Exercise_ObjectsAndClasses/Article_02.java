package Exercise_ObjectsAndClasses;

public class Article_02 {

    //полета
    private String title;
    private String content;
    private String author;

    public Article_02(String title, String content, String author) {
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
