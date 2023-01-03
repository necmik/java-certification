package java11.functionalinterfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {

	private int id;
	private String name;
	private BigDecimal price;
	private Category category;
	
	
	public Product(int id, String name, BigDecimal price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product() {
		
	}
	
	public static List<Product>  generateProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Book", new BigDecimal(24.5), Category.STATIONERY));
		products.add(new Product(2, "Pencil", new BigDecimal(14.5), Category.STATIONERY));
		products.add(new Product(3, "Eraser", new BigDecimal(5), Category.STATIONERY));
		products.add(new Product(4, "Paper", new BigDecimal(3), Category.STATIONERY));
		products.add(new Product(5, "Meatball", new BigDecimal(50), Category.FOOD));
		products.add(new Product(6, "Screw driver", new BigDecimal(30), Category.APPLIANCE));
		products.add(new Product(7, "Bed Cover", new BigDecimal(80), Category.TEXTILE));
		products.add(new Product(8, "Salad", new BigDecimal(25), Category.FOOD));
		products.add(new Product(9, "Yogurt", new BigDecimal(12), Category.FOOD));
		products.add(new Product(10, "Soup", new BigDecimal(9), Category.FOOD));
		
		return products;
	}
	
}
