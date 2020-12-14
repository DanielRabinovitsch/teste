package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualcome;//renda
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualcome) {
		this.name = name;
		this.anualcome = anualcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualcome() {
		return anualcome;
	}

	public void setAnualcome(Double anualcome) {
		this.anualcome = anualcome;
	}
	
	public abstract Double tax();

}
