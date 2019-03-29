package cn.sxt.application.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.sxt.application.pojo.Ticket;

@RestController
public class UserController {

	//注入restTemplate对象
	@Autowired
	private RestTemplate restTemplate;
	
	/***
	 * 进行远程服务的调用，获得余票信息
	 */
	@GetMapping("/users/{start}/{end}")
	public List<Ticket> usersTicket(@PathVariable String start,
			@PathVariable String end){
		//访问远程服务的地址  TICKET-PROVIDER
		String url="http://ticket-provider/tickets/"+start+"/"+end;
		//调用远程服务
		Ticket[] tickets = restTemplate.getForObject(url, Ticket[].class);
		
		List<Ticket> list = Arrays.asList(tickets);
		return list;
	}
	
}

