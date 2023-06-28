package com.example.project01_ksbtalk.friend;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_ksbtalk.MainActivity;
import com.example.project01_ksbtalk.R;
import com.example.project01_ksbtalk.databinding.FragmentFriendBinding;
import com.example.project01_ksbtalk.opentalk.FragmentAdapter;

import java.util.ArrayList;

public class FriendFragment extends Fragment {
    FragmentFriendBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFriendBinding.inflate(inflater , container , false);

        binding.recvFriend.setAdapter(new FriendAdapter(getList(), getContext()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));

        //Intent intent = new Intent(getContext() , MainActivity.class);
        //startActivity(intent);
        return binding.getRoot();//
    }

    public ArrayList<FriendDTO> getList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.img1 , "이름1" , "이젠 정말.."));
        list.add(new FriendDTO(R.drawable.img2 , "이름2" , ""));
        list.add(new FriendDTO(R.drawable.img3 , "이름3" , ""));
        list.add(new FriendDTO(R.drawable.img4 , "이름4" , ""));
        list.add(new FriendDTO(R.drawable.img5 , "이름5" , ""));
        list.add(new FriendDTO(R.drawable.img1 , "이름6" , ""));
        list.add(new FriendDTO(R.drawable.img1 , "이름7" , ""));
        list.add(new FriendDTO(R.drawable.img2 , "이름8" , ""));
        list.add(new FriendDTO(R.drawable.img3 , "이름9" , ""));

        return list;

    }
}