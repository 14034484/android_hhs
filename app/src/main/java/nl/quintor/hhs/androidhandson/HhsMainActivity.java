package nl.quintor.hhs.androidhandson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HhsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhs_main);
    }

    public void startOpdracht1(View view){
        Intent intent = new Intent(HhsMainActivity.this, Opdracht1.class);
        startActivity(intent);
    }
    public void startOpdracht2(View view){
        Intent intent = new Intent(HhsMainActivity.this, Opdracht2.class);
        startActivity(intent);
    }
    public void startOpdracht3(View view){
        Intent intent = new Intent(HhsMainActivity.this, Opdracht3.class);
        startActivity(intent);
    }

}
