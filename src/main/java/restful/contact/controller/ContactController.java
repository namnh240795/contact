package restful.contact.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public String getAll(){
		return "all";
	}
}
