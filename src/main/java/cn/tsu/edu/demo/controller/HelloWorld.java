package cn.tsu.edu.demo.controller;

import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author song
 *
 */
@RestController
public class HelloWorld {
	  @RequestMapping(value=("hello"))
      public String say(@PathParam("id") Integer id)
      {
    	  int number=id;
    	  return "接受的参数值为:"+number;
      }
}
