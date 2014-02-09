package com.biz.barlaurea;

public class SingleRow {
	int images[]={R.drawable.mo,R.drawable.tu,R.drawable.we,R.drawable.th,R.drawable.fr,R.drawable.sa};
	public int imageID;
	int image;
	String weekDay;
	String meat;
	String vegetable;
	String soup;
	String specialOffer;

	SingleRow(int imageID,String weekDay, String meat, String vegetable, String soup, String specialOffer){
		this.imageID=imageID;
		this.image=images[imageID];
		this.weekDay=weekDay;
		this.meat=meat;
		this.vegetable=vegetable;
		this.soup=soup;
		this.specialOffer=specialOffer;
	}
	public int getImage() {
		return image;
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
