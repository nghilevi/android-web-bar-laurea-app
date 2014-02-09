package com.biz.barlaurea;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuAdapter extends BaseAdapter{
	ArrayList<SingleRow> listOfSingleRows;
	Context context;
	MenuAdapter(Context c, ArrayList<SingleRow> listOfSingleRows){
		context=c;
		this.listOfSingleRows=listOfSingleRows;	
	}
	
	/*public static void cleanup() {
		listOfSingleRows=new ArrayList<SingleRow>();
		listOfSingleRows.clear();	
	}*/

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listOfSingleRows.size();
	}

	@Override
	public Object getItem(int i) {
		// TODO Auto-generated method stub
		return listOfSingleRows.get(i);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int i, View convertView, ViewGroup viewGroup) {	
		LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		View row=inflater.inflate(R.layout.single_row, viewGroup, false);
		/*View row=convertView;
		MyViewHolder holder=null;
		
		if(row==null){
			LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			row=inflater.inflate(R.layout.single_row, viewGroup, false);
			holder=new MyViewHolder(row);
			row.setTag(holder);
		}else{
			holder=(MyViewHolder) row.getTag();
		}*/
		
		ImageView image=(ImageView) row.findViewById(R.id.imageView);
		TextView weekDay = (TextView) row.findViewById(R.id.weekDay);
		TextView meat= (TextView) row.findViewById(R.id.meat);
		TextView vegetable= (TextView) row.findViewById(R.id.vegetable);
		TextView soup= (TextView) row.findViewById(R.id.soup);
		TextView specialOffer= (TextView) row.findViewById(R.id.specialOffer);
		 		
		SingleRow singleRow = listOfSingleRows.get(i);
		image.setImageResource(singleRow.getImage());
		weekDay.setText(singleRow.getWeekDay()); 
		meat.setText(singleRow.getMeat()); 
		vegetable.setText(singleRow.getVegetable()); 
		soup.setText(singleRow.getSoup()); 
		specialOffer.setText(singleRow.getSpecialOffer());
		/*holder.image.setImageResource(singleRow.getImage());
		holder.weekDay.setText(singleRow.getWeekDay()); 
		holder.meat.setText(singleRow.getMeat()); 
		holder.vegetable.setText(singleRow.getVegetable()); 
		holder.soup.setText(singleRow.getSoup()); 
		holder.specialOffer.setText(singleRow.getSpecialOffer());*/	
		return row;
	}
	
}
