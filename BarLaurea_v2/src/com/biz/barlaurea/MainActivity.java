package com.biz.barlaurea;



import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends Activity {
	private static final String FIREBASE_UR="https://lvn2.firebaseio.com/articles/";
	private ValueEventListener connectedListener;
	private Firebase ref;
	static ArrayList<SingleRow> listOfSingleRows = new ArrayList<SingleRow>(6);
	Map<String,Integer> weekDayHM;
	ArrayList pTagKeys;
	ListView listView;
	//ArrayList <Integer>checkedPointList=new ArrayList<Integer>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setUpWeekDayMap();
		// Create a reference to database
		ref = (Firebase) new Firebase(FIREBASE_UR);
		listView=(ListView) findViewById(R.id.listView);
				
		ref.addListenerForSingleValueEvent(new ValueEventListener() {	
			@Override
			public void onDataChange(DataSnapshot snap) {
				Set<String> keys = null;
				Map<String, Object> data = (Map) snap.getValue();
				keys=data.keySet();				
				Object[] array = keys.toArray();
				
				int i=1;
				for (String s : keys) {
					Map value= (Map) ((Map) snap.getValue()).get(s);
					String weekDay=(String)value.get("title");;	
					Object contentCode=value.get("content:encoded");
					pTagKeys=(ArrayList) ((Map)contentCode).get("p");
					
					String meat=getValueFromPTagKeys(0); //co the lam hang so
					String vegetable=getValueFromPTagKeys(1);
					String soup=getValueFromPTagKeys(2);
					String specialOffer= getValueFromPTagKeys(3);
					int imageID=weekDayHM.get(weekDay);
					System.out.println(imageID+" - "+weekDay);
					
					try {
						listOfSingleRows.add(new SingleRow(imageID,weekDay, meat, vegetable, soup, specialOffer));
					} catch (Exception e) {
						System.out.println("Some error!");
						break;
					}				
				}
				
				Collections.sort(listOfSingleRows, new Comparator<SingleRow>() {
			        @Override
			        public int compare(SingleRow row1, SingleRow row2)
			        {
			            System.out.println(row1.imageID +" vs "+row2.imageID);
			        	return  row1.imageID-row2.imageID;
			        }
			    });
			}
			
			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		listView.setAdapter(new MenuAdapter(this,listOfSingleRows));
	}

	public String getValueFromPTagKeys(int index){
		if(pTagKeys.size()<(index+1)){
			return "";
		}
		return ((Map) pTagKeys.get(index)).get("value").toString();	
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
	
	public void onStart() {
		super.onStart();
		// Finally, a little indication of connection status
	    connectedListener = ref.getRoot().child(".info/connected").addValueEventListener(new ValueEventListener() {
			
			@Override
	        public void onDataChange(DataSnapshot dataSnapshot) {
	            boolean connected = (Boolean)dataSnapshot.getValue();
	            if (connected) {
	                Toast.makeText(MainActivity.this, "Connected to Firebase", Toast.LENGTH_SHORT).show();
	            } else {
	                Toast.makeText(MainActivity.this, "Disconnected from Firebase", Toast.LENGTH_SHORT).show();
	            }
	        }
			
			@Override
			public void onCancelled(FirebaseError arg0) {
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    @Override
    public void onStop() {
        super.onStop();
        ref.getRoot().child(".info/connected").removeEventListener(connectedListener);
        //listOfSingleRows.clear();
    }
	

}


