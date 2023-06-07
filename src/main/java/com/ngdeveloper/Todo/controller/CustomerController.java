package com.ngdeveloper.Todo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.entity.CustomerEntity;
import com.ngdeveloper.Todo.service.CustomerService;

@RestController // @RestController is a Spring framework annotation used to
				// indicate that a particular class is a controller that is designed to handle
				// RESTful web service requests.

public class CustomerController {

	@Autowired /*
				 * @Autowired is a Spring framework annotation used for automatic dependency
				 * injection. //When a class is annotated with @Autowired, Spring will look for
				 * a matching bean instance //in the application context and inject it
				 * automatically. If multiple beans of the same type are available, //Spring
				 * will use the one that has the @Primary annotation or the one with the name
				 * that matches the field name.
				 */

	private CustomerService cs;

	@RequestMapping(path = "/feedCustomerData") /*
												 * @RequestMapping is a Spring framework annotation used to map web
												 * requests onto specific handler classes or handler methods.
												 */
	public void setDataInDB() {
		try {
			cs.saveCustomerData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(path = "/feedCustomerDataBulk")
	public void setDataInDBBulk() {
		try {
			cs.saveCustomerDataBulk();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(path = "/getCoupons/{store}")
	public List<CustomerEntity> getCoupons(@PathVariable("store") String storeName) {
		try {
			return cs.getStoreData(storeName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
