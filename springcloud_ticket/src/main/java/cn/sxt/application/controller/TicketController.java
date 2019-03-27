package cn.sxt.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.sxt.application.pojo.Ticket;

@RestController
public class TicketController {
	
	//restTemplate模板就是一个HttpClient
	/***
	 * 处理查询余票的请求
	 * 	 start开始日期，结束日期
	 */
	@GetMapping("/tickets/{start}/{end}")
	/***
	 * public List<Ticket> loadStartEnd(@PathVariable(value="start") String start,
			@PathVariable(value="end") String end){
	 * @param start
	 * @param end
	 * @return
	 */
	public List<Ticket> loadStartEnd(@PathVariable String start,
			@PathVariable String end){
		
		System.out.println("3333------"+start+"-----"+end);
		
		//余票的集合
		List<Ticket> tickets=new ArrayList<>();
		
		Ticket t1=new Ticket();
		t1.setId(1111);
		t1.setTotal(120);
		t1.setRemark("靠窗...");
		
		Ticket t2=new Ticket();
		t2.setId(2222);
		t2.setTotal(345);
		t2.setRemark("卧铺...");
		
		tickets.add(t1);
		tickets.add(t2);

		
		return tickets;
	}
	
}
