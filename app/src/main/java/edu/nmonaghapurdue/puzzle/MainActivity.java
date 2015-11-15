package edu.nmonaghapurdue.puzzle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int difficultly = 0;

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
        Button c5 = (Button) findViewById(R.id.c5);
        c5.setVisibility(View.GONE);
        Button c21 = (Button) findViewById(R.id.c21);
        c21.setVisibility(View.GONE);
        Button c25 = (Button) findViewById(R.id.c25);
        c25.setVisibility(View.GONE);
    }
    public void c1() {
        Button c1 = (Button) findViewById(R.id.c1);
        c1.setBackgroundColor((Color.BLUE));
    }
    public void c2() {
        Button c2 = (Button) findViewById(R.id.c1);
        c2.setBackgroundColor(Color.BLUE);
    }
    public void c3() {
        Button c1 = (Button) findViewById(R.id.c1);
        c1.setBackgroundColor((Color.BLUE));
    }
    public void c4() {
        Button c4 = (Button) findViewById(R.id.c1);
        c4.setBackgroundColor((Color.BLUE));}
    public void c5() {
        Button c5 = (Button) findViewById(R.id.c1);
        c5.setBackgroundColor((Color.BLUE));}

    public void c6() {
        Button c6 = (Button) findViewById(R.id.c1);
        c6.setBackgroundColor((Color.BLUE));
    }
    public void c7() {
        Button c7 = (Button) findViewById(R.id.c1);
        c7.setBackgroundColor((Color.BLUE));
    }
    public void c8() {
        Button c8 = (Button) findViewById(R.id.c1);
        c8.setBackgroundColor((Color.BLUE));
    }
    public void c9() {
        Button c9 = (Button) findViewById(R.id.c1);
        c9.setBackgroundColor((Color.BLUE));
    }
    public void c10() {
        Button c10 = (Button) findViewById(R.id.c1);
        c10.setBackgroundColor((Color.BLUE));
    }
    public void c11() {
        Button c11 = (Button) findViewById(R.id.c1);
        c11.setBackgroundColor((Color.BLUE));
    }
    public void c12() {
        Button c12 = (Button) findViewById(R.id.c1);
        c12.setBackgroundColor((Color.BLUE));
    }
    public void c13() {
        Button c13 = (Button) findViewById(R.id.c1);
        c13.setBackgroundColor((Color.BLUE));
    }
    public void c14() {
        Button c14 = (Button) findViewById(R.id.c1);
        c14.setBackgroundColor((Color.BLUE));
    }
    public void c15() {
        Button c15 = (Button) findViewById(R.id.c1);
        c15.setBackgroundColor((Color.BLUE));
    }
    public void c16() {
        Button c16 = (Button) findViewById(R.id.c1);
        c16.setBackgroundColor((Color.BLUE));
    }
    public void c17() {
        Button c17 = (Button) findViewById(R.id.c1);
        c17.setBackgroundColor((Color.BLUE));
    }
    public void c18() {
        Button c18 = (Button) findViewById(R.id.c1);
        c18.setBackgroundColor((Color.BLUE));
    }
    public void c19() {
        Button c19 = (Button) findViewById(R.id.c1);
        c19.setBackgroundColor((Color.BLUE));
    }
    public void c20() {
        Button c20 = (Button) findViewById(R.id.c1);
        c20.setBackgroundColor((Color.BLUE));}
    public void c21() {
        Button c21 = (Button) findViewById(R.id.c1);
        c21.setBackgroundColor((Color.BLUE));
    }
    public void c22() {
        Button c22 = (Button) findViewById(R.id.c1);
        c22.setBackgroundColor((Color.BLUE));
    }
    public void c23() {
        Button c23 = (Button) findViewById(R.id.c1);
        c23.setBackgroundColor((Color.BLUE));
    }
    public void c24() {
        Button c24 = (Button) findViewById(R.id.c1);
        c24.setBackgroundColor((Color.BLUE));
    }
    public void c25() {
        Button c25 = (Button) findViewById(R.id.c1);
        c25.setBackgroundColor((Color.BLUE));
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
