package com.ngdeveloper.Todo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ngdeveloper.Todo.dto.ProductDetailsDto;
import com.ngdeveloper.Todo.repository.ProductDao;
import com.ngdeveloper.Todo.service.ProductQueryService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ProductQueryServiceTest {

	@Autowired
	ProductQueryService productQueryService;

	@MockBean
	ProductDao productDao;

	@BeforeEach
	void setMockOutput() {
		MockitoAnnotations.openMocks(this); // this is needed for inititalizytion of mocks, if you use @Mock
		TestObjects tstTestObjects = new TestObjects();
		List<Object[]> products = tstTestObjects.getProductDetails();
		when(productDao.findByProductWithPreferedPartners()).thenReturn(products);
	}

	@Test
	@DisplayName("Find product by product id")
	@Description("finding the product based on the given product id")
	void testProductById() {
		List<ProductDetailsDto> products = productQueryService.get();
		assertEquals(2, products.size());
	}

	@Test
	@DisplayName("Find product by product id")
	@Description("finding the product based on the given product id")
	void testProductByIdForCuelinksPartner() {
		TestObjects tstTestObjects = new TestObjects();
		List<Object[]> productsTest = tstTestObjects.getProductDetailsCuelinks();
		when(productDao.findByProductWithPreferedPartners()).thenReturn(productsTest);
		List<ProductDetailsDto> products = productQueryService.get();
		assertEquals(1, products.size());
	}

}
