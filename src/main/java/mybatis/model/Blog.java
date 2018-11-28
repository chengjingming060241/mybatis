package mybatis.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Blog {
    private int id ;
    private String title;
    private int  author_id;
    private Author author;
    private List<post> posts;

    public List<post> getPosts() {
        return posts;
    }

    public void setPosts(List<post> posts) {
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Blog{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", blog_author='").append(author_id).append('\'');
        sb.append(", author=").append(author);
        sb.append(", post=").append(posts);
        sb.append('}');
        return sb.toString();
    }
}
