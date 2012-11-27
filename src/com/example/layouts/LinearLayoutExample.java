package com.example.layouts;

import android.app.Activity;
import android.os.Bundle;

/*
 * LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.
 * All children of a LinearLayout are stacked one after the other, so a vertical list will only have one child per row, 
 * no matter how wide they are, and a horizontal list will only be one row high (the height of the tallest child, plus padding).
 */
public class LinearLayoutExample extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);
    }
}
