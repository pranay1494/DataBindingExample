package com.example.pranay.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pranay.databindingexample.databinding.ActivityMainBinding;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ApiCalls api = RetrofitClient.getClient().create(ApiCalls.class);
        api.getUserDetails("pranay1494").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<GitPojo>() {
            @Override
            public void accept(GitPojo gitPojo) throws Exception {
                binding.setGitpojo(gitPojo);
            }
        });
    }
}
