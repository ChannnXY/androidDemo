package com.channnxy.demo10191944;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class login_forget extends AppCompatActivity {
    public int code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_forget);

        //校验新密码，并且确认验证码
        Button mbtn_back =findViewById(R.id.btn_back);
        mbtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkCode()&&checkPassword()){
                    Intent forgetIntent = new Intent(login_forget.this,login1031.class);
                    startActivity(forgetIntent);
                }
            }
        });

        Button mbtn_checkCode = findViewById(R.id.btn_checkCode);
        mbtn_checkCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                code = random.nextInt(100000);
                String msg = "手机号为"+getIntent().getStringExtra("login_tel")+"的验证码为"+code;
                newAlert("请记住验证码",msg,"好的");
            }
        });
    }

//    校验验证码
    public boolean checkCode(){
        EditText mtv_checkCode = findViewById(R.id.tv_checkCode);
        String checkCode = mtv_checkCode.getText().toString();
        if(Integer.valueOf(checkCode)!=code){
            newAlert("填写错误","验证码输入错误，请重新获取并填写验证码","好的");
            return false;
        }else {
            return true;
        }
    }
//    校验密码是否相等
    public boolean checkPassword(){
        EditText mtv_password = findViewById(R.id.tv_password);
        EditText mtv_conPassword = findViewById(R.id.tv_conPassword);
        String conPassword = mtv_conPassword.getText().toString();
        String password = mtv_password.getText().toString();
        if(conPassword.equals(password)){
            return true;
        }else{
            newAlert("填写错误","密码不相等，请重新确认密码","好的");
            return false;
        }
    }
//    创建提醒对话框方法
    public void newAlert(String title,String msg,String pos_btn){
        AlertDialog.Builder malert = new AlertDialog.Builder(login_forget.this);
        malert.setTitle(title);
        malert.setPositiveButton(pos_btn,null);
        malert.setMessage(msg);
        malert.show();
    }
}
