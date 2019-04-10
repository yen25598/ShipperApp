package com.example.btl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;

public class LoginFacebook extends AppCompatActivity {
    ProfilePictureView ImageFb;
    LoginButton login_Fb;
    TextView name_fb, email_fb;
    Button dangxuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facebook);
    }
    public void anhxa(){
        ImageFb = (ProfilePictureView) findViewById(R.id.imageProfile);
        login_Fb = (LoginButton) findViewById(R.id.login_button);
        name_fb =(TextView) findViewById(R.id.name_fb);
        email_fb= (TextView) findViewById(R.id.email_fb);
        dangxuat= (Button) findViewById(R.id.dangxuat);
    }
}
