package com.improve10x.templatev2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddTemplateV2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_template_v2);
        getSupportActionBar().setTitle("Template");
    }
}