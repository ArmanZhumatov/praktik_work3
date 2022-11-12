package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class PictureActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture); }

    public void onInfo(View v) {

        Intent intent = new Intent(PictureActivity.this, MainActivity.class);
        startActivity(intent);
    }
}