package JavaMasterClass.PasibusBurger;

public class TypicalBurger {

	private String breadRollType;
	private String meat;
	private String name;
	private double price;
	
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;
	
	public TypicalBurger(String breadRollType, String meat, String name, double price) {
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.name = name;
		this.price = price;
	}
	
	public void addBurgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	public void addBurgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void addBurgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void addBurgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double totalPrice() {
		double hamburgerPrice = this.price;
		if (this.addition1Name != null){
			hamburgerPrice =+ this.addition1Price;
		} else if (this.addition2Name != null) {
			hamburgerPrice =+ this.addition2Price;
		}else if (this.addition3Name != null) {
			hamburgerPrice =+ this.addition3Price;
		}else if (this.addition4Name != null) {
			hamburgerPrice =+ this.addition4Price;
		}
		return hamburgerPrice;
	}

	public String getBreadRollType() {
		return breadRollType;
	}
	public void setBreadRollType(String breadRollType) {
		this.breadRollType = breadRollType;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
