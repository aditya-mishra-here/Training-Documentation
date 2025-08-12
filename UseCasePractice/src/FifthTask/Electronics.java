package FifthTask;

public class Electronics extends Product{
	public Electronics(String productid, String name) {
		super(productid, name);
	}

	int warrantyYears;

	

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", Warranty Years: " + warrantyYears;
	}

}