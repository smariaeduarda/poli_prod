package entities;

public class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct() {
	}
	
	public ImportedProduct(Double customsFee) {
		super();
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
}
