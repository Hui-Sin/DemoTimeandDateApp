package sg.edu.rp.c346.id20018354.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btndisplayDate;
    Button btndisplayTime;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btndisplayDate=findViewById(R.id.buttonDisplayDate);
        btndisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
    }
}