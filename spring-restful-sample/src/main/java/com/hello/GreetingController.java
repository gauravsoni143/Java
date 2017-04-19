package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting") public Greeting
	  greeting(@RequestParam(value="name", defaultValue="World") String name) {
	  return new Greeting(counter.incrementAndGet(),String.format(template,  name));
	  //return "Hello World";
	 }

	@GetMapping("/customers")
	public List getCustomers() {
		return new ArrayList();
	}

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable("id") Long id)
	{
		return new Customer(id, "Kevin", "bob", "stuart@hello.com", "0000000");




	}


	/**
	 * {
"id": "100",
"firstName": "Gaurav",
"lastName": "Soni",
"email":"gaurav@abc.com",
"mobile":"1234567"
   }
	 * @param customer
	 * @return
	 */
	@PostMapping(value = "/customers")
	public Customer createCustomer(@RequestBody Customer customer) {

		return customer;
	}

	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable Long id) {

		return "Customer has been deleted";

	}

	@PutMapping("/customers/{id}")
	public String updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {

		return "Customer has been updated";
	}





}