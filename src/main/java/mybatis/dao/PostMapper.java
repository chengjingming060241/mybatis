package mybatis.dao;


import mybatis.model.Blog;
import mybatis.model.post;

import java.util.List;

public interface PostMapper {
    List<post> postList(Blog blog);
}
