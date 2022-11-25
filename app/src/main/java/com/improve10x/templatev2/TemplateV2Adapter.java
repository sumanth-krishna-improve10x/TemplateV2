package com.improve10x.templatev2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TemplateV2Adapter extends RecyclerView.Adapter<TemplatesV2ViewHolder> {
    ArrayList<TemplatesV2> templatesV2sList;

    public  void setTemplatesV2s(ArrayList<TemplatesV2> templatesV2ArrayList){
        templatesV2sList = templatesV2ArrayList;
    }
    @NonNull
    @Override
    public TemplatesV2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template2_item,parent,false);
        TemplatesV2ViewHolder templatesV2ViewHolder = new TemplatesV2ViewHolder(view);
        return templatesV2ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplatesV2ViewHolder holder, int position) {
        TemplatesV2 templatesV2 = templatesV2sList.get(position);
        holder.messageTxt.setText(templatesV2.messageText);
    }

    @Override
    public int getItemCount() {
        return templatesV2sList.size();
    }
}
