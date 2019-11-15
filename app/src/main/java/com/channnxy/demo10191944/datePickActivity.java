package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class datePickActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener{
    public Button mbtn_choose;
    public Button mbtn_confirm;
    public TextView mtv_result;
    public DatePicker mdp_date;

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pick);
        mbtn_choose = findViewById(R.id.btn_choose);
        mbtn_confirm = findViewById(R.id.btn_confirm);
        mtv_result = findViewById(R.id.tv_result);
        mdp_date = findViewById(R.id.dp_date);

        mbtn_choose.setOnClickListener(this);
        mbtn_confirm.setOnClickListener(this);

//        mdp_date.setOnDateChangedListener(new myDateChangeListener());
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String desc = String.format("您选择的是%d年%d月%d日",year,month,dayOfMonth);
        mtv_result.setText(desc);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_choose:
                Calendar m_calendar = Calendar.getInstance();
                DatePickerDialog m_dialog = new DatePickerDialog(this,this,
                        m_calendar.get(Calendar.YEAR),
                        m_calendar.get(Calendar.MONTH),
                        m_calendar.get(Calendar.DAY_OF_MONTH));
                m_dialog.show();
                break;
            case R.id.btn_confirm:
                break;
            default:
                break;
        }
    }

//    private class myDateChangeListener implements DatePicker.OnDateChangedListener {
//        @Override
//        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//            String desc = String.format("您选择的是%d年%d月%d日",year,monthOfYear,dayOfMonth);
//            mtv_result.setText(desc);
//        }
//    }
}
