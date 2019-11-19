package superbderrick.github.io.kotlinfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import recorder.RecorderFactory;
import recorder.RecorderType;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new RecorderFactory().buildCar(RecorderType.MEDIAPROTECTION);


    }
}
