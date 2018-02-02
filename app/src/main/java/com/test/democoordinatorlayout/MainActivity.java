package com.test.democoordinatorlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.democoordinatorlayout.demo.FabFromLibraryActivity;
import com.test.democoordinatorlayout.demo.FabFromLibraryWithCustomBehaviourActivity;
import com.test.democoordinatorlayout.demo.ScrollFlagEnterAlwaysActivity;
import com.test.democoordinatorlayout.demo.ScrollFlagEnterAlwaysCollapsedActivity;
import com.test.democoordinatorlayout.demo.ScrollFlagExitUntilCollapsedActivity;
import com.test.democoordinatorlayout.demo.ScrollFlagSnapActivity;
import com.test.democoordinatorlayout.demo.SimpleFabActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button buttonSeven = findViewById(R.id.button7);

        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
        buttonSeven.setOnClickListener(clickListener);
    }

    private final View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    startActivity(new Intent(MainActivity.this, SimpleFabActivity.class));
                    break;
                case R.id.button2:
                    startActivity(new Intent(MainActivity.this, FabFromLibraryActivity.class));
                    break;
                case R.id.button3:
                    startActivity(new Intent(MainActivity.this, FabFromLibraryWithCustomBehaviourActivity.class));
                    break;
                case R.id.button4:
                    startActivity(new Intent(MainActivity.this, ScrollFlagEnterAlwaysActivity.class));
                    break;
                case R.id.button5:
                    startActivity(new Intent(MainActivity.this, ScrollFlagEnterAlwaysCollapsedActivity.class));
                    break;
                case R.id.button6:
                    startActivity(new Intent(MainActivity.this, ScrollFlagSnapActivity.class));
                    break;
                case R.id.button7:
                    startActivity(new Intent(MainActivity.this, ScrollFlagExitUntilCollapsedActivity.class));
                    break;
            }
        }
    };
}
