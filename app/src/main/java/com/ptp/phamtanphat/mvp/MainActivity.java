package com.ptp.phamtanphat.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ptp.phamtanphat.mvp.Dangnhap.Interface.Capnhatlayout;
import com.ptp.phamtanphat.mvp.Dangnhap.Presenter.PresenterDangnhap;

public class MainActivity extends AppCompatActivity implements Capnhatlayout {

    EditText edtUserName,edtPassword;
    Button btnDangnhap;
    PresenterDangnhap presenterDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDangnhap = findViewById(R.id.buttonDangnhap);
        edtUserName = findViewById(R.id.edittextUser);
        edtPassword = findViewById(R.id.edittextPassword);

        presenterDangnhap = new PresenterDangnhap(this);

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();
                presenterDangnhap.recievedata(username,password);
            }
        });
    }

    @Override
    public void UpdateView(String update) {
        Log.d("BBB",update);
    }

    @Override
    public void Err(String err) {
        Log.d("BBB",err);
    }
}
