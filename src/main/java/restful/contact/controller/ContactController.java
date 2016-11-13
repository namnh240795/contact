package restful.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restful.contact.entity.Contact;
import restful.contact.repository.ContactRepository;
import restful.contact.repository.ContactRepositoryC;

@RestController
public class ContactController {
	@Autowired
	ContactRepository cr;
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public String getAll(){
		
		String info = "{";
		info += '\n';
		List<Contact> contacts = cr.findAll();
		for (Contact contact : contacts) {
			info += contact.toString();
			info += '\n';
		}		
		info += '\n' + '}';
		return info;
	}
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello(){
		
		
		return "hello";
	}
}
