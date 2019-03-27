package cn.sxt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //注册中心的客户端
public class SpringcloudTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTicketApplication.class, args);
	}

}
