package com.channnxy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinnerDropDownActivity extends AppCompatActivity {
    public Spinner sp_sropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_drop_down);

        ArrayAdapter<String> starAdapter = new ArrayAdapter<>(this,R.layout.item_select,starArray);
        starAdapter.setDropDownViewResource(R.layout.item_select);

        sp_sropdown = findViewById(R.id.sp_dropdown);
        sp_sropdown.setOnItemSelectedListener(new spListener());
        sp_sropdown.setPrompt("请选择行星");
        sp_sropdown.setAdapter(starAdapter);
        sp_sropdown.setSelection(0);

        Spinner sp_dialog = findViewById(R.id.sp_dialog);
        sp_dialog.setPrompt("请选择行星-dia");
        sp_dialog.setAdapter(starAdapter);
        sp_dialog.setSelection(0);
        sp_dialog.setOnItemSelectedListener(new diaListener());
    }

    private String[] starArray = {"水星","木星","金星","地球","木星","土星"};


    private class spListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(spinnerDropDownActivity.this,"您选择的是："+starArray[i],Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    private class diaListener implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(spinnerDropDownActivity.this,"您选择的是："+starArray[i],Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}
