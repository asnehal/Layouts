package com.example.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab2 extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Second Tab");
        setContentView(textView);
    }
}
