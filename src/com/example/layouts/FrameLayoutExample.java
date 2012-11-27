package com.example.layouts;

import android.app.Activity;
import android.os.Bundle;

/*
 * FrameLayout is designed to block out an area on the screen to display a single item.
 * Generally, FrameLayout should be used to hold a single child view, because it can be difficult to organize child views 
 * in a way that's scalable to different screen sizes without the children overlapping each other. 
 * Multiple children can be added to a FrameLayout and control their position within the FrameLayout by assigning gravity to each child
 */
public class FrameLayoutExample extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout);
    }
}
