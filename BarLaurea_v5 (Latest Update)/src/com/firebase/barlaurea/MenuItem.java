package com.firebase.barlaurea;


/**
 * User: greg
 * Date: 6/21/13
 * Time: 2:38 PM
 */
public class MenuItem {
   	
    private String weekDay;   
	private String meat;
	private String vegetable;
	private String soup;
	private String specialOffer;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private MenuItem() { }

    MenuItem(String weekDay,String meat,String vegetable,String soup,String specialOffer) {
        this.weekDay = weekDay;  	
    	this.meat = meat;
    	this.vegetable = vegetable;
    	this.soup = soup;
    	this.specialOffer = specialOffer;	
    }
    
    public String getWeekDay() {
        return weekDay;
    }
    public String getMeat() {
        return meat;
    }
	public String getVegetable() {
		return vegetable;
	}
	public String getSoup() {
		return soup;
	}
	public String getSpecialOffer() {
		return specialOffer;
	}
}
