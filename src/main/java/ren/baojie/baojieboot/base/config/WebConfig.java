package ren.baojie.baojieboot.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ren.baojie.baojieboot.base.interceptor.MyInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public MyInterceptor myInterceptor() {
        return new MyInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**");
    }
}
