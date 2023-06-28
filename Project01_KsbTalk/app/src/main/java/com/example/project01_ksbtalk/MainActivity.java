package com.example.project01_ksbtalk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.project01_ksbtalk.chat.ChatFragment;
import com.example.project01_ksbtalk.databinding.ActivityMainBinding;
import com.example.project01_ksbtalk.friend.FriendFragment;
import com.example.project01_ksbtalk.opentalk.OpenTalkMainFragment;

public class MainActivity extends AppCompatActivity {
// ViewBinding처리해보기.
    // KsbActBinding binding ; <= 디자인 파일이 Binding객체가 생기는것 혼동 x
    ActivityMainBinding binding;
    ActionBar actionBar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("친구");

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container , new FriendFragment() ).commit();

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if (item.getItemId()==R.id.page_1){
                    fragment = new FriendFragment();
                    actionBar.setTitle("친구");
            }else if(item.getItemId()==R.id.page_2) {
                actionBar.setTitle("채팅");
                    fragment = new ChatFragment();
            }else if(item.getItemId()==R.id.page_3) {
                actionBar.setTitle("오픈채팅");
                    fragment = new OpenTalkMainFragment();
            }else if(item.getItemId()==R.id.page_4) {
                actionBar.setTitle("쇼핑");
            }else if(item.getItemId()==R.id.page_5) {
                actionBar.setTitle("더보기");
            }else {
                return false;
            }
            if(fragment == null){
                Toast.makeText(this, "아직 메뉴가 준비가 안되어있습니다", Toast.LENGTH_SHORT).show();
            }else {
                manager.beginTransaction().replace(R.id.container, fragment).commit();
            }
            return true;
        }); //람다식의 메소드가 이해가 안간다면 new를 통해서 interface구조를 먼저 확인해볼것

    }
}