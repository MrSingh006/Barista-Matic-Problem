package com.barista;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Driver {

	public static void main(String[] args) {

		PriceIngredient pi =new PriceIngredient();
		UnitIngredient ui =new UnitIngredient();
		BaristaImpl barista = new BaristaImpl();
		
		String status = "In-Stock";
		double price =0.00;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean go = true;
		while (go) 
		{
			System.out.println("Inventory : ");
			System.out.println("Coffee : "+ui.getCoffeeUnit());
			System.out.println("Decaf Coffee : "+ui.getDecafCoffeeUnit());
			System.out.println("Sugar : "+ui.getSugarUnit());
			System.out.println("Cream : "+ui.getCreamUnit());
			System.out.println("Steamed Milk : "+ui.getSteamedMilkUnit());
			System.out.println("Foamed Milk : "+ui.getFoamedMilkUnit());
			System.out.println("Espresso : "+ui.getEspressoUnit());
			System.out.println("Cocoa : "+ui.getCocoaUnit());
			System.out.println("Whipped Cream : "+ui.getWhippedCreamUnit());
			
			System.out.println("Menu : ");
			price = pi.getCoffeePrice()*3+pi.getSugarPrice()*1+pi.getCreamPrice()*1;
			System.out.println("Press 1 for Coffee : Cost :"+price+" Status : "+status);
			
			price = pi.getDecafCoffeePrice()*3+pi.getSugarPrice()*1+pi.getCreamPrice()*1;
			System.out.println("Press 2 for Decaf Coffee : Cost :"+price+" Status : "+status);
			
			price = pi.getEspressoPrice()*2+pi.getSteamedMilkPrice()*1;
			System.out.println("Press 3 for Caffe Latte : Cost :"+price+" Status : "+status);
			
			price = pi.getEspressoPrice()*3;
			System.out.println("Press 4 for Caffe Americano : Cost :"+price+" Status : "+status);
			
			price = pi.getEspressoPrice()*1+pi.getCocoaPrice()*1+pi.getSteamedMilkPrice()*1+pi.getWhippedCreamPrice()*1;
			System.out.println("Press 5 for Caffe Mocha : Cost :"+price+" Status : "+status);
			
			price = pi.getEspressoPrice()*2+pi.getSteamedMilkPrice()*1+pi.getFoamedMilkPrice()*1;
			System.out.println("Press 6 for Cappuccino : Cost :"+price+" Status : "+status);
			
			System.out.println("Press 7 to Exit");
			
			try
			{
				int input = Integer.parseInt(br.readLine());
				switch (input)
				{
					case 1:
						// Coffee
						barista.priceOfCoffee(pi, ui);
						if(ui.getCoffeeUnit()<3 || ui.getSugarUnit()<1 || ui.getCreamUnit()< 1)
						{
							System.out.println("Out Of Stock: Coffee");
							status = "Out of Stock";
						}
						else
						{
							System.out.println("Dispensing: Coffee");
						}
						break;
					case 2:
						// Decaf Coffee
						barista.priceOfDecafCoffee(pi, ui);
						if(ui.getDecafCoffeeUnit()<3 || ui.getSugarUnit()<1 || ui.getCreamUnit()< 1)
						{
							System.out.println("Out Of Stock: Decaf Coffee");
							status = "Out of Stock";
						}
						else
						{
							System.out.println("Dispensing: Decaf Coffee");
						}
						break;
					case 3:
						// Caffe Latte
						barista.priceOfCaffeLatte(pi, ui);
						if(ui.getEspressoUnit()<2 || ui.getSteamedMilkUnit()<1)
						{
							System.out.println("Out Of Stock: Caffe Latte");
							status = "Out of Stock";
						}
						else
						{
							System.out.println("Dispensing: Caffe Latte");
						}
						break;
					case 4:
						// Caffe Americano
						barista.priceOfCaffeAmericano(pi, ui);
						if(ui.getEspressoUnit()<3)
						{
							System.out.println("Out Of Stock: Caffe Americano");
							status = "Out of Stock";
						}
						else
						{
							System.out.println("Dispensing: Caffe Americano");
						}
						break;
					case 5:
						// Caffe Mocha
						barista.priceOfCaffeMocha(pi, ui);
						if(ui.getEspressoUnit()<1 || ui.getCocoaUnit()<1 || ui.getSteamedMilkUnit()<1 
								|| ui.getWhippedCreamUnit()<1)
						{
							System.out.println("Out Of Stock: Caffe Mocha");
							status = "Out of Stock";
						}
						else
						{
							System.out.println("Dispensing: Caffe Mocha");
						}
						break;
					case 6:
						// Cappuccino
						barista.priceOfCappuccino(pi, ui);
						if(ui.getEspressoUnit()<2 || ui.getSteamedMilkUnit()<1 || ui.getFoamedMilkUnit()<1)
						{
							System.out.println("Out Of Stock: Cappuccino");
							status = "Out of Stock";
						}
						else
						{
							System.out.println("Dispensing: Cappuccino");
						}
						break;
					case 7:
						// EXIT
						go = false;
						break;
				}
			}
			catch (Exception e) 
			{
				System.out.println("Invalid input try another one !!");
				System.out.println(e.getMessage());
			}
		}
	}
}
