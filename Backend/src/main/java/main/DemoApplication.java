package main;

import configuration.WebConfig;
import model.dao.UserEntityRepository;
import model.dto.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.*;


@SpringBootApplication(scanBasePackages = {"model", "configuration"})
@EnableJpaRepositories(basePackageClasses = UserEntityRepository.class)
@ComponentScan({"model" , "controller"})
@EntityScan(basePackageClasses = {UserEntity.class})
@Import(value = {WebConfig.class})
@EnableWebMvc
@Controller
@Configuration

public class DemoApplication {


    @Bean
    WebMvcConfigurer configurer () {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers (ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/pages/**").
                        addResourceLocations("img");
            }
        };
    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
