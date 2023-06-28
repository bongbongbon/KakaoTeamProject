package com.example.project01_ksbtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_ksbtalk.databinding.ItemChatRecvBinding;
import com.example.project01_ksbtalk.databinding.ItemOpentalkRecv1Binding;

import java.util.ArrayList;

public class OpenTalkSubAdapter1 extends RecyclerView.Adapter<OpenTalkSubAdapter1.ViewHolder> {

    ItemOpentalkRecv1Binding binding;

    ArrayList<OpenTalkDTO> list;

    Context context;

    public OpenTalkSubAdapter1(ArrayList<OpenTalkDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public OpenTalkSubAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemOpentalkRecv1Binding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OpenTalkSubAdapter1.ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getImgRes());
        h.binding.tvChatTitle.setText(list.get(i).getChatTitle());
        h.binding.tvChatContext.setText(list.get(i).getChatContext());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemOpentalkRecv1Binding binding;

        public ViewHolder(ItemOpentalkRecv1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
