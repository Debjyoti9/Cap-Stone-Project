package com.zomato.MerchantService.config;



import com.zomato.MerchantService.filter.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
   @Bean
    public FilterRegistrationBean jwtFilterBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new JwtFilter());
        filterRegistrationBean.addUrlPatterns("/v1/auth/merchant/*");
        return filterRegistrationBean;
    }
}
