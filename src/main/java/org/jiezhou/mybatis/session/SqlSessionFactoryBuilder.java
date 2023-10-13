package org.jiezhou.mybatis.session;

import org.jiezhou.mybatis.builder.xml.XMLConfigBuilder;
import org.jiezhou.mybatis.session.defaults.DefaultSqlSessionFactory;

import java.io.Reader;

/**
 * 作为整个mybatis的入口，
 * @author: jiezhou
 **/

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(Reader reader){
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration configuration){
        return new DefaultSqlSessionFactory(configuration);
    }
}
