package com.example.project01_ksbtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_ksbtalk.databinding.ItemOpentalkRecv1Binding;
import com.example.project01_ksbtalk.databinding.ItemOpentalkRecv2Binding;

import java.util.ArrayList;

public class OpenTalkSubAdapter2 extends RecyclerView.Adapter<OpenTalkSubAdapter2.ViewHolder> {

    ItemOpentalkRecv2Binding binding;

    ArrayList<OpenTalkDTO> list;

    Context context;

    public OpenTalkSubAdapter2(ArrayList<OpenTalkDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public OpenTalkSubAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemOpentalkRecv2Binding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OpenTalkSubAdapter2.ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getImgRes());
        h.binding.tvChatTitle.setText(list.get(i).getChatTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemOpentalkRecv2Binding binding;

        public ViewHolder(ItemOpentalkRecv2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
