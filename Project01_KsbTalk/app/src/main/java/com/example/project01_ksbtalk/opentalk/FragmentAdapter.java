package com.example.project01_ksbtalk.opentalk;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.project01_ksbtalk.databinding.ItemChatRecvBinding;
import com.example.project01_ksbtalk.friend.FriendDTO;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentStateAdapter {
    //FragmentStateAdapter <= 프래그먼트와 ViewPager2 & RecyclerView와 세트로 많이 사용되는 어댑터.
    //사용방법 자체가 엄청 간단함.


    ArrayList<Fragment> list;





    public FragmentAdapter(@NonNull Fragment fragment , ArrayList<Fragment> list) {
        super(fragment);
        this.list = list;
    }




    @NonNull
    @Override
    public Fragment createFragment(int i) {
        return list.get(i);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
