package edu.nmonaghapurdue.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view) {
        setContentView(R.layout.screen_two); // change layout

    }
    public void easyDifficult(View view) {
        setContentView(R.layout.gameplay);
        Button c1 = (Button) findViewById(R.id.c1);
        c1.setVisibility(View.GONE);
        Button c2 = (Button) findViewById(R.id.c2);
        Button c3 = (Button) findViewById(R.id.c3);
        Button c4 = (Button) findViewById(R.id.c4);
        Button c5 = (Button) findViewById(R.id.c5);
        c5.setVisibility(View.GONE);
        Button c6 = (Button) findViewById(R.id.c6);
        Button c7 = (Button) findViewById(R.id.c7);
        Button c8 = (Button) findViewById(R.id.c8);
        Button c9 = (Button) findViewById(R.id.c9);
        Button c10 = (Button) findViewById(R.id.c10);
        Button c11 = (Button) findViewById(R.id.c11);
        Button c12 = (Button) findViewById(R.id.c12);
        Button c13 = (Button) findViewById(R.id.c13);
        Button c14 = (Button) findViewById(R.id.c14);
        Button c15 = (Button) findViewById(R.id.c15);
        Button c16 = (Button) findViewById(R.id.c16);
        Button c17 = (Button) findViewById(R.id.c17);
        Button c18 = (Button) findViewById(R.id.c18);
        Button c19 = (Button) findViewById(R.id.c19);
        Button c20 = (Button) findViewById(R.id.c20);
        Button c21 = (Button) findViewById(R.id.c21);
        c21.setVisibility(View.GONE);
        Button c22 = (Button) findViewById(R.id.c22);
        Button c23 = (Button) findViewById(R.id.c23);
        Button c24 = (Button) findViewById(R.id.c24);
        Button c25 = (Button) findViewById(R.id.c25);
        c25.setVisibility(View.GONE);


    }
    public void mediumDifficult(View view) {
        setContentView(R.layout.gameplay);

    }
    public void hardDifficult(View view) {
        setContentView(R.layout.gameplay);
    }
    public void exit(View view) {
      setContentView(R.layout.activity_main);
    }
}
