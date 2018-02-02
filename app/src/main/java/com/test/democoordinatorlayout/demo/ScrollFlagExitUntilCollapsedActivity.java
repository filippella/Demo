package com.test.democoordinatorlayout.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

import com.test.democoordinatorlayout.R;

/**
 * Created by Workspace on 01/02/2018.
 */

public class ScrollFlagExitUntilCollapsedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_flag_exit_until_collapsed);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SimpleListAdapter());
    }

    class SimpleListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new SimpleViewHolder(getLayoutInflater().inflate(R.layout.item_simple_layout, parent, false));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            //Do nothing
        }

        @Override
        public int getItemCount() {
            return 50;
        }

        class SimpleViewHolder extends RecyclerView.ViewHolder {

            SimpleViewHolder(View itemView) {
                super(itemView);
            }
        }
    }
}
