package comparableExamples;

public class Laptop implements Comparable<Laptop>{
	private String brand;
	private Integer price;
	private Integer ram;
	
	public Laptop(String brand, Integer price, Integer ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
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
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	@Override
	public int compareTo(Laptop lap2) {
		if (this.ram > lap2.ram)
			return 1;
		return -1;
	}

	
}
