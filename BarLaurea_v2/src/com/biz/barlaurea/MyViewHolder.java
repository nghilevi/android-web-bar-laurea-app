package com.biz.barlaurea;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder {
	ImageView image;
	TextView weekDay;
	TextView meat;
	TextView vegetable;
	TextView soup;
	TextView specialOffer;
	
	MyViewHolder(View row){
		ImageView image=(ImageView) row.findViewById(R.id.imageView);
		TextView weekDay = (TextView) row.findViewById(R.id.weekDay);
		TextView meat= (TextView) row.findViewById(R.id.meat);
		TextView vegetable= (TextView) row.findViewById(R.id.vegetable);
		TextView soup= (TextView) row.findViewById(R.id.soup);
		TextView specialOffer= (TextView) row.findViewById(R.id.specialOffer);
	}
}
