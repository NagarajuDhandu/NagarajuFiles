package aryanRestaurentClassesorInterfaces;

public class Items 
{
	public void menuu()
	{
	Menu  menu = new Menu();
	
	menu.nonVeg.put(1, "ChickenBiryani");
	menu.nonVeg.put(2, "MuttonBiryani");
	menu.nonVeg.put(3, "Rotti");
	menu.nonVeg.put(4, "ChickenCurry");
	
	menu.veg.put(1, "VegBiryani");
	menu.veg.put(2, "TomatoRice");
	menu.veg.put(3, "PannerBiryani");
	menu.veg.put(4, "HydDumBiryani");
	
	menu.display();
	}
}
