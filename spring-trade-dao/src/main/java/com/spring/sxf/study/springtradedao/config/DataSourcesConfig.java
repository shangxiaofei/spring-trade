package com.spring.sxf.study.springtradedao.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @author <a href="mailto:shangxiaofei@meituan.com">尚晓飞</a>
 * @date 3:51 PM 2019/9/26
 */
@Configuration
public class DataSourcesConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSouces() {
        DruidDataSource dataSource = new DruidDataSource();
        String url = environment.getProperty("spring.datasource.url");
        String name = environment.getProperty("spring.datasource.username");
        String pwd = environment.getProperty("spring.datasource.password");
        String coreSize = environment.getProperty("spring.datasource.coresize");
        String maxSize = environment.getProperty("spring.datasource.maxsize");
        String dirverClassName=environment.getProperty("spring.datasource.dirverclassname");
        System.out.println("数据库url=" + url);
        System.out.println("数据库用户名=" + name);
        System.out.println("数据库密码=" + pwd);
        System.out.println("数据库核心连接池初始化个数=" + coreSize);
        System.out.println("数据库核心连接池最大个数=" + maxSize);
        dataSource.setUrl(url);
        dataSource.setUsername(name);
        dataSource.setPassword(pwd);
        dataSource.setInitialSize(Integer.valueOf(coreSize));
        dataSource.setMaxActive(Integer.valueOf(maxSize));
        dataSource.setDriverClassName(dirverClassName);
        dataSource.setDbType("mysql");
        return dataSource;
    }
}
