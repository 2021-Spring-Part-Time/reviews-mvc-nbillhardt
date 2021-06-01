package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String imageURL;

    private String category;

    private String content;
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public Review(Long id, String title, String imageURL, String category, String content) {
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
        this.category = category;
        this.content = content;
    }
}
