package SukrutCo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZEurekaApplication.class, args);
	}

}
