package com.example.project01_ksbtalk.opentalk;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_ksbtalk.R;
import com.example.project01_ksbtalk.databinding.FragmentOpenTalkSub1Binding;

import java.util.ArrayList;

public class OpenTalkSubFragment1 extends Fragment {

    FragmentOpenTalkSub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenTalkSub1Binding.inflate(inflater, container, false);
        binding.recvOpenTalk1.setAdapter(new OpenTalkSubAdapter1(getList() ,getContext()));
        binding.recvOpenTalk1.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.recvOpenTalk2.setAdapter(new OpenTalkSubAdapter2(getList1(),getContext()));
        binding.recvOpenTalk2.setLayoutManager(new LinearLayoutManager(getContext() ,LinearLayoutManager.HORIZONTAL, false));

        binding.recvOpenTalk3.setAdapter(new OpenTalkSubAdapter3(getList2(),getContext()));
        binding.recvOpenTalk3.setLayoutManager(new LinearLayoutManager(getContext() ,LinearLayoutManager.HORIZONTAL, false));
        return binding.getRoot();
    }
    public ArrayList<OpenTalkDTO> getList() {
        ArrayList<OpenTalkDTO> list = new ArrayList<>();
        list.add(new OpenTalkDTO(R.drawable.profile_img1, 66,"광주&전남 IT 커뮤니티", "좋은 아침입니다~!!","오전 8:46"));
        list.add(new OpenTalkDTO(R.drawable.profile_img2, 75,"개발자 커뮤니티", "좋은 아침입니다~!!","어제"));
        list.add(new OpenTalkDTO(R.drawable.profile_img3, 5,"매일 7시 매일 100만원!", "딱 한시간만!!",">"));
        list.add(new OpenTalkDTO(R.drawable.profile_img4, 5,"광주&전남 IT 커뮤니티", "좋은 아침입니다~!!","오전 8:46"));
        list.add(new OpenTalkDTO(R.drawable.profile_img5, 5,"광주&전남 IT 커뮤니티", "좋은 아침입니다~!!","오전 8:46"));



        return list;
    }
    public ArrayList<OpenTalkDTO> getList1() {
        ArrayList<OpenTalkDTO> list = new ArrayList<>();
        list.add(new OpenTalkDTO(R.drawable.profile_img1, 66,"노원) 6.17 저녁에 \n엘리멘탈 보러 갈...", "좋은 아침입니다~!!","오전 8:46"));
        list.add(new OpenTalkDTO(R.drawable.profile_img2, 75,"인생 애니매이션 \n같이봐요 (디...", "좋은 아침입니다~!!","어제"));
        list.add(new OpenTalkDTO(R.drawable.profile_img3, 5,"Disney D23-디즈 \n 공식 팬클럽", "딱 한시간만!!",">"));
        list.add(new OpenTalkDTO(R.drawable.profile_img4, 5,"디즈니 ost 노래 부\n르기", "좋은 아침입니다~!!","오전 8:46"));
        list.add(new OpenTalkDTO(R.drawable.profile_img5, 5,"영화 소울 처럼 살\n고 싶으신 분들! 그... ", "좋은 아침입니다~!!","오전 8:46"));
        return list;
    }

    public ArrayList<OpenTalkDTO> getList2() {
        ArrayList<OpenTalkDTO> list = new ArrayList<>();
        list.add(new OpenTalkDTO(R.drawable.profile_img1, 66,"히로아카", "좋은 아침입니다~!!","1시간전"));
        list.add(new OpenTalkDTO(R.drawable.profile_img2, 75,"블루록", "좋은 아침입니다~!!",""));

        return list;
    }

}