package com.example.administrator.managestu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class stuLogin extends AppCompatActivity {
    Bundle loginInfo;
    String name;
    String sexy;
    String age;
    TextView nameText;
    TextView sexyText;
    TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_login);

        loginInfo = this.getIntent().getExtras();
        name = loginInfo.getString("name");
        sexy = loginInfo.getString("sexy");
        age = loginInfo.getString("age");

        nameText = (TextView) findViewById(R.id.getInfoName);
        sexyText = (TextView) findViewById(R.id.getInfoSexy);
        ageText = (TextView) findViewById(R.id.getInfoAge);
        nameText.setText(name);
        sexyText.setText(sexy);
        ageText.setText(age);
    }

    public void selForStu(View view) {
        Intent toSelResult = new Intent(stuLogin.this,selStudyResult.class);
        startActivity(toSelResult);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
}