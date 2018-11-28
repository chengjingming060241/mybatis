package mybatis.dao;

import com.github.pagehelper.Page;
import mybatis.model.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {
    //按id查找信息
    Blog getBlog(int id);
    //插入信息
    void insertBlog(Blog blog);

    //按删除信息
    void deleteBlog(Integer id );

    //按id修改
    void updateBlog(Blog blog);

    //查询所有信息
    List<Blog> getAll();

    //分页
    List<Blog> getPage(Page page);

    //联合查询
    Blog selectBlogDetails(Integer id);

    //集合查询
    Blog selectBlog(Integer id);

    //动态SQLif查询
    List<Blog> findActiveBlogLike(@Param("title") String title);

}


