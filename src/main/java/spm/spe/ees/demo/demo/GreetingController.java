package spm.spe.ees.demo.demo;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {
	private static final String template = "Hello there, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        //return "Greetings from Spring Boot! - EES"; 
	return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
