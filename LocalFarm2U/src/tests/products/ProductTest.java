package tests.products;

import static org.junit.Assert.*;

import org.junit.Test;

import products.Product;

public class ProductTest {
	Product product=new Product("Granny", "Apple", .10);
	@Test(expected=IllegalArgumentException.class)
	public void setCostShouldFailIfNegative() {
		product.setCost(-1);
	}
	@Test
	public void setCostShouldSetIfPositive(){
		product.setCost(2);
		//extra zero is for error range
		assertEquals(2.0,product.getCost(),0);
	}

}
