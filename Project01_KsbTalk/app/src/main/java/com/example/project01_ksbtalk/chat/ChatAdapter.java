package com.example.project01_ksbtalk.chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_ksbtalk.databinding.ItemChatRecvBinding;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

        ItemChatRecvBinding binding;

        ArrayList<ChatDTO> list;

        Context context;

    public ChatAdapter(ArrayList<ChatDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getResImgID());
        h.binding.tvChatTitle.setText(list.get(i).getName());
        h.binding.tvChatContext.setText(list.get(i).getContext());

    }

    @Override
    public int getItemCount() {
        return list.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemChatRecvBinding binding;

        public ViewHolder(ItemChatRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
