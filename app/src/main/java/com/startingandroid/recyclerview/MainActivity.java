package com.startingandroid.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ArrayList<User> users;
    private UsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.users_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        users = new ArrayList<>();
        addDummyUsers();
        adapter = new UsersAdapter(users);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void addDummyUsers() {
        users.add(new User("Starting Android", "contact@startingandroid.com"));
        users.add(new User("Johan Taylor", "johan@startingandroid.com"));
        users.add(new User("Aliza wix", "aliza@gmail.com"));
        users.add(new User("Robert lafore", "robert@startingandroid.com"));
        users.add(new User("Aslam khan", "aslam@yahoo.com"));
        users.add(new User("Ahmed Nazir", "ahmed@buysellads.com"));
        users.add(new User("Maria Kanwal", "maria@hotmail.com"));
        users.add(new User("Zeeshan Ahmed", "imzeeshan4u@gmail.com"));
        users.add(new User("Asad Ali", "asad@startingandroid.com"));
        users.add(new User("Claire", "claire@gmail.com"));
        users.add(new User("Jack", "jack@hotmail.com"));
        users.add(new User("Tom", "tom@bing.com"));
        users.add(new User("Martin", "marting@startingandroid.com"));
        users.add(new User("Bruce", "bruce@android.com"));
        users.add(new User("Micheal", "michel@gmail.com"));
        users.add(new User("Angelina", "angelina@outlook.com"));
        users.add(new User("Sarah", "sarah@ary.tv"));
        users.add(new User("Bob", "bob@zeemania.it"));
        users.add(new User("Logics", "logics@headphones.net"));
        users.add(new User("Ash", "ash@gmail.com"));
        users.add(new User("Lucy", "lucy@xyz.net"));
        users.add(new User("Starting Android", "contact@startingandroid.com"));
    }
}
