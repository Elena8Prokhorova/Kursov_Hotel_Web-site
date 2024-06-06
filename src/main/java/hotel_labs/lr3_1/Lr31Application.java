package hotel_labs.lr3_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Lr31Application {

	public static void main(String[] args) {
		SpringApplication.run(Lr31Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/getReviews").allowedOrigins("http://localhost:3000");
				registry.addMapping("/addReview").allowedOrigins("http://localhost:3000");
				registry.addMapping("/addOrder").allowedOrigins("http://localhost:3000");
				registry.addMapping("/getFoods").allowedOrigins("http://localhost:3000");
				//registry.addMapping("/findFitRoom").allowedOrigins("http://localhost:3000");
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");
			}
		};
	}
}
