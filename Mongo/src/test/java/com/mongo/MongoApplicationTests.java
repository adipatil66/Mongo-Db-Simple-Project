package com.mongo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mongo.entity.product;
import com.mongo.entity.productRepo;

@SpringBootTest
class MongoApplicationTests {

	@Autowired
	productRepo productrepo;
	
	@Test
	public void contextLoads() {
	
		product p = new product();
		p.setName("Aditya");
		product save = productrepo.save(p );
		assertNotNull(save);
	}

	@Test
	public void findAll() {
	
		List<product> save = productrepo.findAll();
		assertNotNull(save);
	}
	
	@Test
	public void deleteBYId() {
	
		productrepo.deleteById("60efe192cefd552aadb60b7e");
		Optional<product> save = productrepo.findById("60efe192cefd552aadb60b7e");
		assertEquals(Optional.empty(), save);
	}
	
	@Test
	public void Update() {
	
		product p = new product();
		p.setId("60efe7046581cc093edd3cda");
		p.setName("Aditya2");
		product save = productrepo.save(p);
		assertNotNull(save);
		System.out.println(save.getId());
	}
	
}
