package com.ngdeveloper.Todo.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngdeveloper.Todo.entity.CustomerEntity;
import com.ngdeveloper.Todo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository crep;
	String line="";
	
	public void saveCustomerData() throws IOException
	{
		try {
			
			// Location loc = locationRepository.findByNameAndStatus("csvFileLocation","N");
			// 
			// id | name | path |status => 1 | csvFileLocation | C:\\java classroom\\ivq\\CUSTOMER1.CSV | Y
			
			
			
			BufferedReader br=new BufferedReader(new FileReader("C:\\\\java classroom\\\\ivq\\\\CUSTOMER1.CSV"));
			while((line=br.readLine())!=null)
			{
				String [] data=line.split(",");
				CustomerEntity c=new CustomerEntity();
				c.setName(data[0]);
				c.setIssue(data[1]);
				c.setIssueID(data[2]);
				c.setAge(data[3]);
				String name = data[0];
				Optional<CustomerEntity> customerEntityOptional = crep.findByName(name);
				if(customerEntityOptional.isEmpty()) {
				crep.save(c);
				System.out.println("Record Saved");
				}else {
					System.out.println("this record skipped as already it exists");
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveCustomerDataBulk() throws IOException
	{
		try {
			List<CustomerEntity> customerEntityList = new ArrayList<>();
			BufferedReader br=new BufferedReader(new FileReader("C:\\java classroom\\ivq\\CUSTOMER1.CSV"));
			while((line=br.readLine())!=null)
			{
				String [] data=line.split(",");
				CustomerEntity c=new CustomerEntity();
				c.setName(data[0]);
				c.setIssue(data[1]);
				c.setIssueID(data[2]);
				c.setAge(data[3]);				
				customerEntityList.add(c);
			}
			crep.saveAll(customerEntityList);
			System.out.println("All Records Saved");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public List<CustomerEntity> getStoreData(String storeName) {
			return crep.findByIssueID(storeName);
		}
	
}
