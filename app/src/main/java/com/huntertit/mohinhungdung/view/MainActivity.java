package com.huntertit.mohinhungdung.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.huntertit.mohinhungdung.R;
import com.huntertit.mohinhungdung.model.entity.Demo;
import com.huntertit.mohinhungdung.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private MainPresenter mainPresenter;
    private ListView listView;
    private Button btnLoad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();

        btnLoad = findViewById(R.id.btn_load_data);
        listView = findViewById(R.id.list_view);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.loadData();
            }
        });
    }

    private void initPresenter() {
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void displayMain(List<Demo> demoList) {
        listView.setAdapter(new ArrayAdapter<Demo>(this,android.R.layout.simple_list_item_1,demoList));
    }
}
