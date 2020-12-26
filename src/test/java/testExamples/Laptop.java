package testExamples;

public class Laptop {
	public Laptop() {
				
	}
	public Laptop(String brand, Integer price, Integer ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	private String brand;
	private Integer price;
	private Integer ram;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}


}
