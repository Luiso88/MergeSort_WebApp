package war.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*
	 * @RequestMapping(value="/") public ModelAndView test(HttpServletResponse
	 * response) throws IOException{ return new ModelAndView("home"); }
	 */

	@RequestMapping(value = "/")
	public ModelAndView receiveArrayOfValues(@RequestParam int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		return new ModelAndView("home");

	}
	// http://localhost:8080/mywebsite/?values=23,45,56

}
