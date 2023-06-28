package com.example.project01_ksbtalk.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_ksbtalk.R;
import com.example.project01_ksbtalk.databinding.FragmentChatBinding;
import com.example.project01_ksbtalk.friend.FriendDTO;

import java.util.ArrayList;


public class ChatFragment extends Fragment {

    FragmentChatBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatBinding.inflate(inflater, container, false);
        binding.recvChat.setAdapter(new ChatAdapter(getList() , getContext()));
        binding.recvChat.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<ChatDTO> getList() {
        ArrayList<ChatDTO> list = new ArrayList<>();
        list.add(new ChatDTO(R.drawable.img1, "이름1", "밥 뭐 먹음?"));
        list.add(new ChatDTO(R.drawable.img2, "이름2", "에헤라디아"));
        list.add(new ChatDTO(R.drawable.img3, "이름3", "ㅇ리ㅡㅇㅁ아ㅡㄹ"));
        list.add(new ChatDTO(R.drawable.img4, "이름4", "닐리리맘보"));
        list.add(new ChatDTO(R.drawable.img5, "이름5", "야으"));


        return list;
    }
}