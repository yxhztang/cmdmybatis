import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisTest {
   public static void main(String[] args) throws Exception {

      String resource = "mybatis-config.xml";

      InputStream inputStream = Resources.getResourceAsStream(resource);

      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      SqlSession sqlSession = sqlSessionFactory.openSession();
      try {
         User user = sqlSession.selectOne("MyMapper.selectUser", 1);
         System.out.println(user);
      } finally {
         sqlSession.close();
      }
   }
}