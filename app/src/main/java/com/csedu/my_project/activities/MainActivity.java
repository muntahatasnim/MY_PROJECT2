package com.csedu.my_project.activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.csedu.my_project.R;
import com.csedu.my_project.activities.userActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button mybutton = (Button) findViewById(R.id.userbutton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, userActivity.class));
            }
        });


    }



}
