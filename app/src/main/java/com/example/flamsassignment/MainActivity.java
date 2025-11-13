package com.example.flamsassignment;
import org.opencv.android.OpenCVLoader;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.flamsassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'flamsassignment' library on application startup.
    static {
        System.loadLibrary("opencv_java4");
        System.loadLibrary("flamsassignment");

    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (!OpenCVLoader.initDebug()) {
            Log.e("OpenCV", "Unable to load OpenCV!");
        } else {
            Log.d("OpenCV", "OpenCV loaded successfully!");
            Toast.makeText(this, "OpenCV loaded successfully!", Toast.LENGTH_LONG).show();

            TextView tv=binding.sampleText;
            tv.setText(stringFromJNI());
        }

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'flamsassignment' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}