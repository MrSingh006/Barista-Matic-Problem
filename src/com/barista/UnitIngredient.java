package com.barista;

public class UnitIngredient {
	int coffeeUnit = 2;
	int decafCoffeeUnit = 10;
	int sugarUnit = 10;
	int creamUnit = 10;
	int steamedMilkUnit = 10;
	int foamedMilkUnit = 10;
	int espressoUnit = 10;
	int cocoaUnit = 10;
	int whippedCreamUnit = 10;
	public int getCoffeeUnit() {
		return coffeeUnit;
	}
	public void setCoffeeUnit(int coffeeUnit) {
		this.coffeeUnit = coffeeUnit;
	}
	public int getDecafCoffeeUnit() {
		return decafCoffeeUnit;
	}
	public void setDecafCoffeeUnit(int decafCoffeeUnit) {
		this.decafCoffeeUnit = decafCoffeeUnit;
	}
	public int getSugarUnit() {
		return sugarUnit;
	}
	public void setSugarUnit(int sugarUnit) {
		this.sugarUnit = sugarUnit;
	}
	public int getCreamUnit() {
		return creamUnit;
	}
	public void setCreamUnit(int creamUnit) {
		this.creamUnit = creamUnit;
	}
	public int getSteamedMilkUnit() {
		return steamedMilkUnit;
	}
	public void setSteamedMilkUnit(int steamedMilkUnit) {
		this.steamedMilkUnit = steamedMilkUnit;
	}
	public int getFoamedMilkUnit() {
		return foamedMilkUnit;
	}
	public void setFoamedMilkUnit(int foamedMilkUnit) {
		this.foamedMilkUnit = foamedMilkUnit;
	}
	public int getEspressoUnit() {
		return espressoUnit;
	}
	public void setEspressoUnit(int espressoUnit) {
		this.espressoUnit = espressoUnit;
	}
	public int getCocoaUnit() {
		return cocoaUnit;
	}
	public void setCocoaUnit(int cocoaUnit) {
		this.cocoaUnit = cocoaUnit;
	}
	public int getWhippedCreamUnit() {
		return whippedCreamUnit;
	}
	public void setWhippedCreamUnit(int whippedCreamUnit) {
		this.whippedCreamUnit = whippedCreamUnit;
	}
	public UnitIngredient(int coffeeUnit, int decafCoffeeUnit, int sugarUnit, int creamUnit, int steamedMilkUnit,
			int foamedMilkUnit, int espressoUnit, int cocoaUnit, int whippedCreamUnit) {
		super();
		this.coffeeUnit = coffeeUnit;
		this.decafCoffeeUnit = decafCoffeeUnit;
		this.sugarUnit = sugarUnit;
		this.creamUnit = creamUnit;
		this.steamedMilkUnit = steamedMilkUnit;
		this.foamedMilkUnit = foamedMilkUnit;
		this.espressoUnit = espressoUnit;
		this.cocoaUnit = cocoaUnit;
		this.whippedCreamUnit = whippedCreamUnit;
	}
	public UnitIngredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
