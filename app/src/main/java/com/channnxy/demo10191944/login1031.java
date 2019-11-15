package com.channnxy.demo10191944;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class login1031 extends AppCompatActivity {

    String mtv_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1031);
        //登录方式改变
        Button mbtn_password = findViewById(R.id.radio_password);
        Button mbtn_code = findViewById(R.id.radio_code);

        //忘记密码
        Button mbtn_forget =findViewById(R.id.btn_forget);
        mbtn_forget.setOnClickListener(new forgetOnclickListener());

        //登录按钮点击
        Button mbtn_login = findViewById(R.id.btn_login);
        mbtn_login.setOnClickListener(new loginOnclickListener());

        //下拉框监听器
        Spinner msp_identity = findViewById(R.id.sp_identity);
        msp_identity.setOnItemSelectedListener(new sp_identityListener());

        //下拉框适配器
        initSpinner();
    }

    //下拉框适配器
    private String[] tv_Spinner = {"我是学生","我是老师"};
    private void initSpinner() {
        ArrayAdapter<String> sp_Adapter = new ArrayAdapter<>(this,R.layout.item_select,tv_Spinner);

        Spinner sp = findViewById(R.id.sp_identity);
        sp.setPrompt("请选择身份");
        sp.setAdapter(sp_Adapter);
        sp.setSelection(0);
    }

    //忘记密码
    private class forgetOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            EditText mtv_telephone = findViewById(R.id.tv_telephone);
            if(!checkTel()){
                Intent forgetIntent = new Intent(login1031.this,login_forget.class);
                forgetIntent.putExtra("login_tel",mtv_telephone.getText().toString());
                startActivity(forgetIntent);
            }
        }
    }

    //手机号验证方法
    public boolean checkTel(){
        EditText mtv_telephone = findViewById(R.id.tv_telephone);
        String tel = mtv_telephone.getText().toString();
        String msg = null;
        boolean flag = false;
        if(tel.length()<11&&tel.length()>0){
            msg = "手机号小于十一位，请正确填写";
            flag = true;
        }else if(tel.length()>11){
            msg = "手机号大于十一位，请正确填写";
            flag = true;
        }else if(tel.length()==0){
            msg = "未填写手机号，请填写";
            flag = true;
        }

        if(flag){
            newAlert("填写错误",msg,"好的","");
        }
        return flag;
    }

    //    创建提醒对话框方法
    public void newAlert(String title,String msg,String pos_btn,String neg_btn){
        AlertDialog.Builder malert = new AlertDialog.Builder(login1031.this);
        malert.setTitle(title);
        if(pos_btn.length()!=0)  malert.setPositiveButton(pos_btn,null);
        if(neg_btn.length()!=0)  malert.setNegativeButton(neg_btn,null);
        malert.setMessage(msg);
        malert.show();
    }
    //登录按钮
    private class loginOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(!checkTel()){
                EditText mtv_tel = findViewById(R.id.tv_telephone);
                String msg = "您的手机号码是"+mtv_tel.getText().toString()+"类型是"+mtv_spinner+"。恭喜您通过登录验证，点击确定返回上个页面";
                newAlert("登录成功",msg,"确定返回","我在看看");
            }
        }
    }
    //适配器监听
    private class sp_identityListener implements android.widget.AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            mtv_spinner = tv_Spinner[position];
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
