package war.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import Sorting.MergeSortClass;

@Controller
public class HomeController {

	/*
	 * @RequestMapping(value="/") public ModelAndView test(HttpServletResponse
	 * response) throws IOException{ return new ModelAndView("home"); }
	 */

	@RequestMapping(value = "/")
	public ModelAndView receiveArrayOfValues(Model model, @RequestParam int[] values) {
		int[] orderedValues = new int[values.length];
		System.arraycopy(values, 0, orderedValues, 0, values.length);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		MergeSortClass m1 = new MergeSortClass();
		m1.mergeSort(orderedValues, orderedValues.length);
		for (int i = 0; i < orderedValues.length; i++) {
			System.out.println(orderedValues[i]);
		}
		model.addAttribute("orderedValues", orderedValues);
		//setAttribute("orderedValues",orderedValues);
		return new ModelAndView("home");

	}
	// http://localhost:8080/mywebsite/?values=23,45,56

}
