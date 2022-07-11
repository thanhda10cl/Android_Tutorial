package android.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG =  MainActivity.class.getSimpleName();
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null){
            Log.e(TAG,"Bug");
        }
        else {
            Log.e(TAG,"WELCOME!!");
        }

        setContentView(R.layout.activity_main);
        //button = new Button(this);
        button.setText("TEST BUTTON");
    }
}