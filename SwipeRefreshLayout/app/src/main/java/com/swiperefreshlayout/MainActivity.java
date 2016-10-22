package com.swiperefreshlayout;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    SwipeRefreshLayout mSwipeRefreshLayout;
    ArrayAdapter<String> adapter;
    String[] dataArr = {"a", "b", "c", "d", "e", "f"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.srl);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArr);
        listView.setAdapter(adapter);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override            public void onRefresh() {
                // update data here
                new refresh_data().execute();
            }
        });

    }


    class refresh_data extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            for (int i = 0; i < 4; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (mSwipeRefreshLayout.isRefreshing()) {
                mSwipeRefreshLayout.setRefreshing(false);
            }
        }
    }



    public List<User> getAllUserList() {
         List<User> users = new ArrayList<>();
        users.add(new User("Samir Samedov"));
        users.add(new User("Tolga Ay"));
        users.add(new User("Yıdız Teknik"));
        users.add(new User("Fen Edebiyat"));
        users.add(new User("Elektrik Elektrik"));
        users.add(new User("Kantin Kalabalık"));
        users.add(new User("Bahçe Geniş"));
        users.add(new User("Liste Scroll"));
        users.add(new User("Samir Samedov"));
        users.add(new User("Tolga Ay"));
        users.add(new User("Yıdız Teknik"));


        return users;
    }
}
