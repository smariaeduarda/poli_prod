package entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{

	private Date manufactureDate;
	
	public UsedProduct(String name, double price, LocalDate date) {
	}

	public UsedProduct(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
}
