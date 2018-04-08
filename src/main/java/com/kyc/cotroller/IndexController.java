/**
 * 
 */
package com.kyc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author otocon
 *
 */
@Controller
public class IndexController {

	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Hello World";
		model.addAttribute("message", message);
		return "index";
	}
}
