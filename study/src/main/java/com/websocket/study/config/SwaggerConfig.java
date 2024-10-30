package com.websocket.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class swaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .version("10_29")                // 버전 기록
                        .title("웹소켓 스터디를 위한 api 명세서")                // API 명세서 제목 
                        .description("Websocket_STUDY_API"));   // 상세

    }
}