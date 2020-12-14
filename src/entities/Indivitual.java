package entities;

public class Indivitual extends TaxPayer {
	
	private Double healthExpenditures;
	
	

	public Indivitual() {
		super();
	}
	
	
	public Indivitual(String name, Double anualcome, Double healthExpenditures) {
		super(name, anualcome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if(getAnualcome()<20000) {
		return getAnualcome()*0.15 - healthExpenditures * 0.5;}
		else return getAnualcome()*0.25 - healthExpenditures * 0.5;
	   
	}

}
