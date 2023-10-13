package org.jiezhou.mybatis.session;

public interface SqlSession {

    /**
     * 根据制定的sqlId获取一条记录的封装对象
     * @param statement
     * @return
     * @param <T>
     */
    <T> T selectOne(String statement);

    Configuration getConfiguration();
    /**
     * 根据指定，只不过这个方法容许我们给sql传递一些参数
     * @param statement
     * @param parameter
     * @return
     * @param <T>
     */
    <T> T selectOne(String statement ,Object parameter);

    /**
     * 得到映射，这个巧妙的使用泛型，使类型安全
     * @param type
     * @return
     * @param <T>
     */
    <T> T getMapper(Class<T> type);
}
