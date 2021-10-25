package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Description 跨域设置
 * addMapping("/**") 对接口配置跨域设置  /**代表所有接口
 * allowedHeaders("*") 允许所有的请求头
 * allowedMethods("*") 允许所有的方法 也可以设置为(“POST”,"GET","PUT","OPTIONS","DELETE")
 * allowedOrigins("*") 允许所有的域 (源地址)
 * */
@Slf4j
public class WebMvcConfig {

    private CorsConfiguration buildConfig(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        log.info("*******WebMvcConfig******");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }

    /**
     * 跨域过滤器
     * @return
     * */
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter(source);
    }
}
