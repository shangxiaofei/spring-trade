package com.spring.sxf.study.springtradeweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:env.properties", encoding="utf-8")
@MapperScan("com.spring.sxf.study.springtradedao.mapper")
@SpringBootApplication(scanBasePackages="com.spring.sxf")
@ConfigurationProperties()
public class SpringTradeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTradeWebApplication.class, args);
	}

}
