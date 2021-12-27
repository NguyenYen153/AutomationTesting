package lesson12;

public class Article implements Slugs{
    private String articleUrl;

    public Article(String articleUrl) {
        this.articleUrl = articleUrl;
    }
    public String lesson1FullPath(){
        return articleUrl.concat(lesson_1);
    }

    public static void main(String[] args) {
        String baseUrl = "https://sdetpro.com";
        String articleUrl = "/selenium-tutorial";
        Article seleniumTut = new Article(baseUrl + articleUrl);
    }
}
