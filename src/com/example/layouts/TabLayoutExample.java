package com.example.layouts;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
/*
 * TabActivity class was deprecated in API level 13.
New applications should use Fragments instead of this class; to continue to run on older devices, 
you can use the v4 support library which provides a version of the Fragment API that is compatible down to DONUT.
Also ActionBar Tabs can be used.
 */
public class TabLayoutExample extends TabActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout);
        init();
    }
    
    private void init(){
    	TabHost tabHost = getTabHost();	//The activity TabHost
    	TabSpec tabspec;	//Reusable TabHost for each tab
    	Intent intent;		//Reusable Intent for each tab
    	
    	// Create an Intent to launch an Activity for the tab (to be reused)
    	intent = new Intent().setClass(this, Tab1.class);
    	
    	// Initialize a TabSpec for each tab and add it to the TabHost
    	tabspec = tabHost.newTabSpec("Tab1")
    			.setIndicator("Tab 1", getResources().getDrawable(R.drawable.tab1_selector))
    			.setContent(intent);
        tabHost.addTab(tabspec);
        
        // Do the same for the other tabs
        intent = new Intent().setClass(this, Tab2.class);
        tabspec = tabHost.newTabSpec("Tab2")
        		.setIndicator("Tab 2", getResources().getDrawable(R.drawable.tab2_selector))
        		.setContent(intent);
        tabHost.addTab(tabspec);
        
        intent = new Intent().setClass(this, Tab3.class);
        tabspec = tabHost.newTabSpec("Tab3")
        		.setIndicator("Tab 3", getResources().getDrawable(R.drawable.tab3_selector))
        		.setContent(intent);
        tabHost.addTab(tabspec);
        
        tabHost.setCurrentTab(1);
    }
}
