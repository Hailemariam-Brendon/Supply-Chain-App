package security;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfigurator implements WebMvcConfigurer {
    public  void addViewControllers(ViewControllerRegistry registery){
        registery.addViewController("/home").setViewName("home");

    }
}
