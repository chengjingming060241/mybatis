package mybatisTest;

import mybatis.model.Blog;
import org.junit.Test;

import java.util.List;

public class mybatisTest extends AbstractMapperTest {
    @Test
    public void getBlog(){
        Blog blog = this.blogMapper.getBlog(1);

    }

    @Test
    public void insertBlog(){
        Blog blog = new Blog();
        blog.setId(3);
        blog.setTitle("周杰伦结婚了");
        blog.setAuthor_id(1);
        blogMapper.insertBlog(blog);
    }

    @Test
    public void getAll(){
        List<Blog> blogList = blogMapper.getAll();
        for (Blog blog:blogList) {
            System.out.print(blog);
        }
    }

    @Test
    public void  selectBlog(){
        Blog blog = blogMapper.selectBlog(1);
        System.out.println(blog);
    }
    @Test
    public void findActiveBlogLike(){
        List<Blog>blogList = blogMapper.findActiveBlogLike("%杰%");
        for (Blog b: blogList) {
            System.out.println(b);
        }
    }
}
