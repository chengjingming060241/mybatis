package mybatis.model;

public class post {
    private int post_id;
    private int blog_id;
    private int post_author_id;
    private String created_on;

    public int getId() {
        return post_id;
    }

    public void setId(int id) {
        this.post_id = id;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public int getAuthor_id() {
        return post_author_id;
    }

    public void setAuthor_id(int author_id) {
        this.post_author_id = author_id;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("post{");
        sb.append("id=").append(post_id);
        sb.append(", blog_id=").append(blog_id);
        sb.append(", author_id=").append(post_author_id);
        sb.append(", created_on='").append(created_on).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
