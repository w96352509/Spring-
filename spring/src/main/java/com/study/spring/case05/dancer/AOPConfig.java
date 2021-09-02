package com.study.spring.case05.dancer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfig {
    @Bean
	public Audience audience() {
		return new Audience();
	}
    @Bean(name = "dancer")
    public Performance performance() {
    	return new Dancer();
    }
}
