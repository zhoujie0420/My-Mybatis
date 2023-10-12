package org.jiezhou.mybatis.session.defaults;

import org.jiezhou.mybatis.binding.MapperRegistry;
import org.jiezhou.mybatis.session.SqlSession;
import org.jiezhou.mybatis.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }

}

