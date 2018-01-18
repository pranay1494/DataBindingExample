package com.example.pranay.databindingexample;

import android.view.View;
import android.widget.Toast;

/**
 * Created by kuliza-336 on 18/01/18.
 */

public class OnClickHandler {
    public void clickOccured(View view){
        Toast.makeText(view.getContext(), "click occured", Toast.LENGTH_SHORT).show();
    }
}
