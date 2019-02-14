package com.example.iramli.tap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    int combo;
    int ika;
    TextView scorTextView;
    TextView maxconboTextView;
    TextView comentTextView;
    TextView comboTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        scorTextView = (TextView) findViewById(R.id.scor);
        maxconboTextView = (TextView) findViewById(R.id.Maxconbo);
        comentTextView = (TextView)findViewById(R.id.coment);
        comboTextView = (TextView)findViewById(R.id.combo);
        Intent intent = getIntent();
        combo = intent.getIntExtra("combo", 0);
        ika = intent.getIntExtra("point", 0);


        maxconboTextView.setText(String.valueOf(comboTextView));
        scorTextView.setText(String.valueOf(ika));

        if(0<ika&&ika<=500){
            comentTextView.setText("まだまだ行けるぞ");
        }
        if (500<ika&&ika<=1000){
            comentTextView.setText("もっと高みへ");
        }
        if (1000<ika&&ika<=2000){
            comentTextView.setText("限界なんてない");
        }
        if (2000<ika&&ika<=3000){
            comentTextView.setText("上しか見えない");
        }
        if (3000<ika&&ika<=5000){
            comentTextView.setText("目指せ5桁");
        }
        if (5000<ika&&ika<10000){
            comentTextView.setText("こんなとこじゃ終われない");
        }
        if (10000<=ika&&ika<=20000){
            comentTextView.setText("ついに5桁だ");
        }
        if (20000<ika&&ika<=50000){
            comentTextView.setText("終わりはないぜ");
        }
        if (50000<ika){
            comentTextView.setText("youならまだいける");
        }



    }
    //public void updateMaxComboScore(){
       // double maxConbo=0;

        //if (combo > maxConbo) {
           // maxConbo = combo;
        //}
    //}

    public void back (View v){
        Intent intent = new Intent(this,StartActivity.class);
        startActivity(intent);
    }



}
