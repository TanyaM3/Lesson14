package by.epam.homework.less14.bean;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int price;
	private String description;
	
	public Treasure() {
		
	}
	
	public Treasure(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(description, other.description) && Objects.equals(name, other.name)
				&& price == other.price;
	}

	@Override
	public String toString() {
		return "Treasure [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
}