package superbderrick.github.io.kotlinfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recorder mpRecorder = new RecorderFactory().buildCar(RecorderType.MEDIAPROTECTION);
        Recorder mcRecorder = new RecorderFactory().buildCar(RecorderType.MIDIACODEC);


        Log.d("derrickTest mp " , mpRecorder.toString());
        Log.d("derrickTest mc" , mcRecorder.toString());



    }
}
