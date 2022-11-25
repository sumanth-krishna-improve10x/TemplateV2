package com.improve10x.templatev2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

import javax.xml.transform.Templates;

public class TemplatesV2Activity extends AppCompatActivity {

    public ArrayList<TemplatesV2> templatesV2s;
    public RecyclerView templateV2Rcv;
    public TemplateV2Adapter templateV2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_v2);
        getSupportActionBar().setTitle("Templates");
        handleAddBtn();
        setData();
        setRecyclerView();

    }

    public void handleAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddTemplateV2Activity.class);
            startActivity(intent);
        });
    }

    public void setRecyclerView() {
        templateV2Rcv = findViewById(R.id.templatev2_rcv);
        templateV2Rcv.setLayoutManager(new LinearLayoutManager(this));
        templateV2Adapter = new TemplateV2Adapter();
        templateV2Adapter.setTemplatesV2s(templatesV2s);
        templateV2Rcv.setAdapter(templateV2Adapter);
    }

    public void setData() {
        templatesV2s = new ArrayList<>();
        TemplatesV2 template1 = new TemplatesV2();
        template1.messageText = "HI";
        templatesV2s.add(template1);

       TemplatesV2 life = new TemplatesV2();
       life.messageText = "My Life My Rules";
       templatesV2s.add(life);

    }
}