package org.jiezhou.mybatis.session.defaults;

import org.jiezhou.mybatis.session.Configuration;
import org.jiezhou.mybatis.session.SqlSession;
import org.jiezhou.mybatis.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }

}

