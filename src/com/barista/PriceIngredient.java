package com.barista;

public class PriceIngredient {
	double coffeePrice = 0.75;
	double decafCoffeePrice = 0.75;
	double sugarPrice = 0.25;
	double creamPrice = 0.25;
	double steamedMilkPrice = 0.35;
	double foamedMilkPrice = 0.35;
	double espressoPrice = 1.10;
	double cocoaPrice = 0.90;
	double whippedCreamPrice = 1.00;
	public double getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(double coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	public double getDecafCoffeePrice() {
		return decafCoffeePrice;
	}
	public void setDecafCoffeePrice(double decafCoffeePrice) {
		this.decafCoffeePrice = decafCoffeePrice;
	}
	public double getSugarPrice() {
		return sugarPrice;
	}
	public void setSugarPrice(double sugarPrice) {
		this.sugarPrice = sugarPrice;
	}
	public double getCreamPrice() {
		return creamPrice;
	}
	public void setCreamPrice(double creamPrice) {
		this.creamPrice = creamPrice;
	}
	public double getSteamedMilkPrice() {
		return steamedMilkPrice;
	}
	public void setSteamedMilkPrice(double steamedMilkPrice) {
		this.steamedMilkPrice = steamedMilkPrice;
	}
	public double getFoamedMilkPrice() {
		return foamedMilkPrice;
	}
	public void setFoamedMilkPrice(double foamedMilkPrice) {
		this.foamedMilkPrice = foamedMilkPrice;
	}
	public double getEspressoPrice() {
		return espressoPrice;
	}
	public void setEspressoPrice(double espressoPrice) {
		this.espressoPrice = espressoPrice;
	}
	public double getCocoaPrice() {
		return cocoaPrice;
	}
	public void setCocoaPrice(double cocoaPrice) {
		this.cocoaPrice = cocoaPrice;
	}
	public double getWhippedCreamPrice() {
		return whippedCreamPrice;
	}
	public void setWhippedCreamPrice(double whippedCreamPrice) {
		this.whippedCreamPrice = whippedCreamPrice;
	}
	public PriceIngredient(double coffeePrice, double decafCoffeePrice, double sugarPrice, double creamPrice,
			double steamedMilkPrice, double foamedMilkPrice, double espressoPrice, double cocoaPrice,
			double whippedCreamPrice) {
		super();
		this.coffeePrice = coffeePrice;
		this.decafCoffeePrice = decafCoffeePrice;
		this.sugarPrice = sugarPrice;
		this.creamPrice = creamPrice;
		this.steamedMilkPrice = steamedMilkPrice;
		this.foamedMilkPrice = foamedMilkPrice;
		this.espressoPrice = espressoPrice;
		this.cocoaPrice = cocoaPrice;
		this.whippedCreamPrice = whippedCreamPrice;
	}
	public PriceIngredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
