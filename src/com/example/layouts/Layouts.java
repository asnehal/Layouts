package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class Layouts extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
        init();
    }
    
    private void init(){
    	Button button1 = (Button)findViewById(R.id.LinearLayout);
    	button1.setOnClickListener(this);
    	
    	Button button2 = (Button)findViewById(R.id.RelativeLayout);
    	button2.setOnClickListener(this);
    	
    	Button button4 = (Button)findViewById(R.id.TabLayout);
    	button4.setOnClickListener(this);
    	
    	Button button5 = (Button)findViewById(R.id.FrameLayout);
    	button5.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.LinearLayout:
				Intent intent1 = new Intent(this,LinearLayoutExample.class);
				startActivity(intent1);
				break;
			case R.id.RelativeLayout:
				Intent intent2 = new Intent(this,RelativeLayoutExample.class);
				startActivity(intent2);
				break;
			case R.id.TabLayout:
				Intent intent4 = new Intent(this,TabLayoutExample.class);
				startActivity(intent4);
				break;
			case R.id.FrameLayout:
				Intent intent6 = new Intent(this,FrameLayoutExample.class);
				startActivity(intent6);
				break;
		}
	}
}
