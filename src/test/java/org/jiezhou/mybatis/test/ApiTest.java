package org.jiezhou.mybatis.test;

import org.jiezhou.mybatis.binding.MapperProxyFactory;
import org.jiezhou.mybatis.binding.MapperRegistry;
import org.jiezhou.mybatis.session.SqlSession;
import org.jiezhou.mybatis.session.SqlSessionFactory;
import org.jiezhou.mybatis.session.defaults.DefaultSqlSessionFactory;
import org.jiezhou.mybatis.test.dao.IUserDao;
import org.junit.Test;

import javax.swing.text.DefaultFormatterFactory;
import java.util.HashMap;

public class ApiTest {

    @Test
    public void test_MapperProxyFactory(){
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("org.jiezhou.mybatis.test.dao");

        // 2. 从 SqlSession 工厂获取 Session
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 4. 测试验证
        String res = userDao.queryUserName("10001");
        System.out.print( res);
    }

    @Test
    public  void test(){
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
//        SqlSession sqlSession = new HashMap<>();

//        sqlSession.put("org.jiezhou.mybatis.test.dao.IUserDao.queryUserName","模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户姓名");
//        sqlSession.put("org.jiezhou.mybatis.test.dao.IUserDao.queryUserAge", "模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户年龄");

//        IUserDao iUserDao = factory.newInstance(sqlSession);

//        String res = iUserDao.queryUserName("10001");
//        System.out.println(res);
    }
}
