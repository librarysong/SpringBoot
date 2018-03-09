package cn.tsu.edu.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tsu.edu.demo.exception.BusinessException;
/**
 * 
 * @author song
 *
 */
@RestController
public class HelloWorld {
	
	
	   @Value("${swf.msg}")
       private  String msg;
	   
	   @Value("${swf.message}")
	   private  String message;
	
	  @RequestMapping(value=("hello"))
      public String say()
      {
		  //int no=1/0;
		  throw new BusinessException("100", "用户名密码错误");
    	  //return this.message;
      }
}
