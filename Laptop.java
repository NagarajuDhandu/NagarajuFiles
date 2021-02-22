package org.Techouts;

public class Laptop implements Comparable<Laptop>
{
	String brand;
	Integer ram;
	Double price;
	
	public Laptop(String brand, Integer ram, Double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop la) 
	{
		if (this.ram>la.ram) 
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
}
