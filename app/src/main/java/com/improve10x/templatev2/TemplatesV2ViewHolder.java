package com.improve10x.templatev2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TemplatesV2ViewHolder extends RecyclerView.ViewHolder {

    public TextView messageTxt;
    public TemplatesV2ViewHolder(@NonNull View itemView) {
        super(itemView);
        messageTxt = itemView.findViewById(R.id.message_txt);
    }
}
