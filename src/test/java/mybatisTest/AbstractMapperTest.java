package mybatisTest;


import mybatis.dao.BlogMapper;
import mybatis.dao.PostMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

public abstract class AbstractMapperTest {
    InputStream in = null;
    SqlSession sqlSession = null;
    BlogMapper blogMapper = null;
    PostMapper postMapper = null;
    SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void Before(){
        try {
            //得到输入流
            in = Resources.getResourceAsStream("mybatis_config.xml");
            //得到SqlSessionFactory对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            //设置事务自动提交
            sqlSession =sqlSessionFactory.openSession(true);
            //得到BlogMapper对象
            blogMapper = sqlSession.getMapper(BlogMapper.class);
            postMapper = sqlSession.getMapper(PostMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @After
    public void After(){
        //手动提交事务
        //sqlSession.commit();
        try {
            if (null != in) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (null != sqlSession) {
            sqlSession.close();
        }
    }
}
