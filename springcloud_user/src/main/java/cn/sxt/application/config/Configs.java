package cn.sxt.application.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//相当于xml文件         
@Configuration
public class Configs {
	
	/***
	 * RestTemplate对象，完成集群服务的消费
	 * 通过服务的名字，进行远程服务的消费
	 * 
	 *  完成负载均衡：
	 *  连接上注册中心，通过ticket-provider名字获得服务列表。
	 *  然后由Ribbon在服务消费端，通过相应的负载均衡算法，产生一个可用的服务进行调用
	 *  
	 */
	@LoadBalanced  //在服务消费的时候，实现负载均衡
	@Bean     //给spring容器中添加一个restTemplate模板对象         (系统没有提供) 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
