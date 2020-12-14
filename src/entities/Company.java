package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;

	public Company(String name, Double anualcome, Integer numberOfEmployees) {
		super(name, anualcome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumbeOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumbeOfEmployees(Integer numbeOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if(numberOfEmployees<10) {
			return getAnualcome()*0.16;
		}
		else return getAnualcome()*0.14;
	}

}
