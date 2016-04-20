package ch.hsr.cloudsolutions.rest.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.hsr.cloudsolutions.rest.api.model.Greeting;

@RestController
public class GreetingController {

	private static final String HELLO_TEXT = "Hello, %s";

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public Greeting defaultGreeting() {
		return new Greeting(String.format(HELLO_TEXT, "World"));
	}

	@RequestMapping(path = "/greeting/{name}", method = RequestMethod.GET)
	public Greeting greetingWithName(@PathVariable("name") String name) {
		return new Greeting(String.format(HELLO_TEXT, name));
	}

}
