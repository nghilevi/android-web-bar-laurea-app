package com.firebase.androidchat;



import java.util.HashMap;
import java.util.Map;

import android.app.Activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.client.Query;

/**
 * User: greg
 * Date: 6/21/13
 * Time: 2:39 PM
 */

/**
 * This class is an example of how to use FirebaseListAdapter. It uses the <code>Chat</code> class to encapsulate the
 * data for each individual chat message
 */
public class MenuItemListAdapter extends FirebaseListAdapter<MenuItem> {

    // The username for this client. We use this to indicate which messages originated from this user
    //private String username;
    private Map<String,Integer> weekDayHM;

    public MenuItemListAdapter(Query ref, Activity activity, int layout) {
        super(ref, MenuItem.class, layout, activity);
        //this.username = username;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param menuItem An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, MenuItem menuItem) {
    	//set up weekDay
    	setUpWeekDayMap();    	
    	int weekDayIcon[]={R.drawable.mo,R.drawable.tu,R.drawable.we,R.drawable.th,R.drawable.fr,R.drawable.sa};
    	String weekDay=menuItem.getWeekDay();
    	int ImageID=weekDayHM.get(weekDay);
    	((ImageView) view.findViewById(R.id.imageView)).setImageResource(weekDayIcon[ImageID]);
    	((TextView)view.findViewById(R.id.weekDay)).setText(weekDay);
        	
    	//content
    	((TextView)view.findViewById(R.id.meat)).setText(menuItem.getMeat());
        ((TextView)view.findViewById(R.id.vegetable)).setText(menuItem.getVegetable());
        ((TextView)view.findViewById(R.id.soup)).setText(menuItem.getSoup());
        ((TextView)view.findViewById(R.id.specialOffer)).setText(menuItem.getSpecialOffer());
    }
	public void setUpWeekDayMap(){
		weekDayHM = new HashMap<String,Integer>();		
		weekDayHM.put("Monday", 0);
		weekDayHM.put("Tuesday", 1);
		weekDayHM.put("Wednesday", 2);
		weekDayHM.put("Thursday", 3);
		weekDayHM.put("Friday", 4);
		weekDayHM.put("Saturday", 5);
	}

}
