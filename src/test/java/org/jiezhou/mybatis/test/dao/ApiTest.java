package org.jiezhou.mybatis.test.dao;

import org.jiezhou.mybatis.binding.MapperProxyFactory;
import org.junit.Test;

import java.util.HashMap;

public class ApiTest {

    @Test
    public  void test(){
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        HashMap<String, String> sqlSession = new HashMap<>();

        sqlSession.put("org.jiezhou.mybatis.test.dao.IUserDao.queryUserName","模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户姓名");
        sqlSession.put("org.jiezhou.mybatis.test.dao.IUserDao.queryUserAge", "模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户年龄");

        IUserDao iUserDao = factory.newInstance(sqlSession);

        String res = iUserDao.queryUserName("10001");
        System.out.println(res);
    }
}
