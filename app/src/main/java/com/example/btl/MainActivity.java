package com.example.btl;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_Login, bt_dky, bt_fb;
    TextView tv_title, tv_subdky, tv_dky;
    ImageView img;
    EditText edtphone, edtpassw;
    String ten, sdt, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ControlButton();

//       su kien log in
        bt_Login.setOnClickListener(new View.OnClickListener() {
            @Override
//     dang nhap bang phone, pass
            public void onClick(View v) {

                if (edtphone.getText().length() != 0 && edtpassw.getText().length() != 0 ){
                     if (edtphone.getText().toString().equals(sdt) && edtpassw.getText().toString().equals(mk)) {
                         Toast.makeText(getApplicationContext(), R.string.loginsuccess, Toast.LENGTH_LONG).show();
                         Intent home = new Intent(MainActivity.this, Home.class);
                         startActivity(home);
                     } else {
                         Toast.makeText(getApplicationContext(), R.string.loginerror, Toast.LENGTH_LONG).show();
                     }
                }
                else {
                    Toast.makeText(getApplicationContext(), R.string.addInfor, Toast.LENGTH_LONG).show();
                }
            }
        });
//        nhan" dnhap = facebook
        bt_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginFacebook = new Intent(MainActivity.this, Home.class);
                startActivity(LoginFacebook);
            }
        });


//  nhan" dky de tao tai khoan
        tv_dky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dang_ky = new Intent(MainActivity.this, Home.class);
                startActivity(dang_ky);
            }
        });

//        nhan button"dky" o trang dky de dky tai khoan
        bt_dky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog (MainActivity.this);
                dialog.setTitle("Đang xử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.content_dang_ky);
                final TextView name = (TextView) findViewById(R.id.name);
                final TextView phone = (TextView) findViewById(R.id.phone);
                final TextView pass = (TextView) findViewById(R.id.passw);
                Button choose = (Button) findViewById(R.id.btdky);
                Button cancel = (Button) findViewById(R.id.cancel);
//  lấy thông tin dky
                choose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ten = name.getText().toString().trim();
                        sdt = phone.getText().toString().trim();
                        mk = pass.getText().toString().trim();
                        dialog.cancel();
                    }
                });
//                 huy dky
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

    }

    private void ControlButton() {

    }

    private  void  Anhxa(){
        //        ánh xạ
        bt_Login = (Button) findViewById(R.id.log_in);
        tv_title = (TextView) findViewById(R.id.nameApp);

        bt_fb = (Button) findViewById(R.id.log_in_fb);
        tv_subdky = (TextView) findViewById(R.id.sub_dky);
        tv_dky = (TextView) findViewById(R.id.dky);
        img = (ImageView) findViewById(R.id.imageHome);
        edtphone = (EditText) findViewById(R.id.phone);
        edtpassw = (EditText) findViewById(R.id.passw);
        bt_dky = (Button) findViewById(R.id.btdky);

    }
}
