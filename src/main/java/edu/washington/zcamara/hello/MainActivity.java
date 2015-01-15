package edu.washington.zcamara.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends Activity
{
    private TextView displayTextView;
    private int tapCounter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        displayTextView = (TextView)findViewById(R.id.mainTexts);
        tapCounter = 0;
    }

    //Activates on screen tap
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        if (tapCounter < 2) {
            tapCounter++;
            if (tapCounter == 1)
                displayTextView.setText("Cougars Suck!");
            else if (tapCounter == 2)
                displayTextView.setText("Go Seahawks!");
        } else {
            tapCounter = 0;
            displayTextView.setText("Go Dawgs!");
        }
        return super.onTouchEvent(event);
    }
}
