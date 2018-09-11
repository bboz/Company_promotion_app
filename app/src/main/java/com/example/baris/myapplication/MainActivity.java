package com.example.baris.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.MainTheme);
        setContentView(R.layout.activity_main);

        GridLayout mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid){

        for (int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0){
                        Intent intent = new Intent(MainActivity.this,ActivityOne.class);
                        startActivity(intent);
                    }
                    else if(finalI==1){
                        Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
                        startActivity(intent);
                    }
                    else if(finalI==2){
                        Intent intent = new Intent(MainActivity.this,ActivityThree.class);
                        startActivity(intent);
                    }
                    else if(finalI==3){
                        Intent intent = new Intent(MainActivity.this,ActivityFour.class);
                        startActivity(intent);
                    }
                    else if(finalI==4){
                        Intent intent = new Intent(MainActivity.this,ActivityFive.class);
                        startActivity(intent);
                    }
                    else if(finalI==5){
                        Intent intent = new Intent(MainActivity.this,ActivitySix.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
