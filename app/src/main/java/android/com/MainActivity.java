package android.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG =  MainActivity.class.getSimpleName();
    //Button button;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//       setContentView(R.layout.activity_main);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout =(FrameLayout) findViewById(R.id.frame_layout);
        TextView product = new TextView(this);
        product.setText("NguyenThanhDa");
        product.setTextSize(20);
        frameLayout.addView(product);
    }
}