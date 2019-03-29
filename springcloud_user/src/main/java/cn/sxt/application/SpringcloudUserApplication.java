package cn.sxt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //要连接上注册中心.  就是注册中心的客户端了.
public class SpringcloudUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudUserApplication.class, args);
	}

}
