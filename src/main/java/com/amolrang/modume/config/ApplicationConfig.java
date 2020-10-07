package com.amolrang.modume.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// dao와 service를 사용할 객체 패키지를 지정 @Repository @Service가 있다면 자동 빈생성
@ComponentScan(basePackages= {"com.amolrang.modume.user.model"})
public class ApplicationConfig {

}
