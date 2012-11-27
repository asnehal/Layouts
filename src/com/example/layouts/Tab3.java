package com.example.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab3 extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Third Tab");
        setContentView(textView);
    }
}
