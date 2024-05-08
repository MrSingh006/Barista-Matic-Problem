package com.barista;

public class BaristaImpl {
	
	public void priceOfCoffee(PriceIngredient pi,UnitIngredient ui)
	{
		ui.setCoffeeUnit(ui.getCoffeeUnit()-3);
		ui.setSugarUnit(ui.getSugarUnit()-1);
		ui.setCreamUnit(ui.getCreamUnit()-1);
	}
	
	public void priceOfDecafCoffee(PriceIngredient pi,UnitIngredient ui)
	{
		ui.setDecafCoffeeUnit(ui.getDecafCoffeeUnit()-3);
		ui.setSugarUnit(ui.getSugarUnit()-1);
		ui.setCreamUnit(ui.getCreamUnit()-1);
	}
	
	public void priceOfCaffeLatte(PriceIngredient pi,UnitIngredient ui)
	{
		ui.setEspressoUnit(ui.getEspressoUnit()-2);
		ui.setSteamedMilkUnit(ui.getSteamedMilkUnit()-1);
	}
	
	public void priceOfCaffeAmericano(PriceIngredient pi,UnitIngredient ui)
	{
		ui.setEspressoUnit(ui.getEspressoUnit()-3);
	}
	
	public void priceOfCaffeMocha(PriceIngredient pi,UnitIngredient ui)
	{
		ui.setEspressoUnit(ui.getEspressoUnit()-1);
		ui.setCocoaUnit(ui.getCocoaUnit()-1);
		ui.setSteamedMilkUnit(ui.getSteamedMilkUnit()-1);
		ui.setWhippedCreamUnit(ui.getWhippedCreamUnit()-1);
	}
	
	public void priceOfCappuccino(PriceIngredient pi,UnitIngredient ui)
	{
		ui.setEspressoUnit(ui.getEspressoUnit()-2);
		ui.setSteamedMilkUnit(ui.getSteamedMilkUnit()-1);
		ui.setFoamedMilkUnit(ui.getFoamedMilkUnit()-1);
	}

}
