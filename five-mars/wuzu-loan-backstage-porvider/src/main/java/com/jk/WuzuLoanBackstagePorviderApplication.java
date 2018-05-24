package com.jk;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication(scanBasePackages = "com.jk")
@EnableAutoConfiguration
@MapperScan("com.jk.dao")
@ImportResource(locations={"classpath:spring-dubbo-provider.xml"})
public class WuzuLoanBackstagePorviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(WuzuLoanBackstagePorviderApplication.class, args);
	}
}
