package json.parser;

public class News {
    private String source, author, title, description, urlLink, urlToImage, publishedAt, content;

    public News() {}

    public News (String source, String author, String title, String description, String urlLink, String urlToImage, String publishedAt, String content) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.urlLink = urlLink;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {this.publishedAt = publishedAt; }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

