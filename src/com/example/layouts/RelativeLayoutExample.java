package com.example.layouts;

import android.app.Activity;
import android.os.Bundle;

/*
 * RelativeLayout is a view group that displays child views in relative positions.
 * The position of each view can be specified as relative to sibling elements (such as to the left-of or below another view) 
 * or in positions relative to the parent RelativeLayout area (such as aligned to the bottom, left of center).
 */
public class RelativeLayoutExample extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout);
    }
}
