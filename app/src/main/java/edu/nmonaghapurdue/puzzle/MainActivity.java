package edu.nmonaghapurdue.puzzle;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int difficultly = 0;
    private int picture = 0;
    private int location = 0;

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

        Button b7 = (Button) findViewById(R.id.button7);
        b7.setText(1 + "");
        Button b5 = (Button) findViewById(R.id.button5);
        b5.setText(1 + "");
        Button b6 = (Button) findViewById(R.id.button6);
        b6.setText(1 + "");
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setText(1 + "");
        b4.setText(1 + "");
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText(1 + "");
    }

    public void mediumDifficult(View view) {
        setContentView(R.layout.gameplay);
        difficultly = 2;
        Button c1 = (Button) findViewById(R.id.c1);
        c1.setVisibility(View.GONE);
        Button c2 = (Button) findViewById(R.id.c2);
        c2.setVisibility(View.GONE);
        Button c3 = (Button) findViewById(R.id.c3);
        c3.setVisibility(View.GONE);
        Button c4 = (Button) findViewById(R.id.c4);
        c4.setVisibility(View.GONE);
        Button c6 = (Button) findViewById(R.id.c6);
        c6.setVisibility(View.GONE);
        Button c8 = (Button) findViewById(R.id.c8);
        c8.setVisibility(View.GONE);
        Button c22 = (Button) findViewById(R.id.c22);
        c22.setVisibility(View.GONE);
        Button c23 = (Button) findViewById(R.id.c23);
        c23.setVisibility(View.GONE);
        Button c24 = (Button) findViewById(R.id.c24);
        c24.setVisibility(View.GONE);
        Button c25 = (Button) findViewById(R.id.c25);
        c25.setVisibility(View.GONE);


        Button b9 = (Button) findViewById(R.id.button9);
        b9.setText(1 + "");
        b9.setText(1 + "");
        Button b8 = (Button) findViewById(R.id.button8);
        b8.setText(1 + "");
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setText(1 + "");
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setText(1 + "");


    }

    public void hardDifficult(View view) {
        setContentView(R.layout.gameplay);
        difficultly = 3;
        Button c5 = (Button) findViewById(R.id.c5);
        c5.setVisibility(View.GONE);
        Button c6 = (Button) findViewById(R.id.c6);
        c6.setVisibility(View.GONE);
        Button c9 = (Button) findViewById(R.id.c9);
        c9.setVisibility(View.GONE);
        Button c10 = (Button) findViewById(R.id.c10);
        c10.setVisibility(View.GONE);
        Button c13 = (Button) findViewById(R.id.c13);
        c13.setVisibility(View.GONE);
        Button c19 = (Button) findViewById(R.id.c19);
        c19.setVisibility(View.GONE);


        Button b9 = (Button) findViewById(R.id.button9);
        b9.setText(1 + "");
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setText(1 + "");
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText(1 + "");
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setText(1 + "");
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setText(1 + "");
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setText(1 + "");

    }

    public void c1(View view) {
        Button c1 = (Button) findViewById(R.id.c1);
        checkColorToChange();
        c1.setBackgroundColor((Color.BLUE));
        location = 1;
    }

    public void c2(View view) {
        Button c2 = (Button) findViewById(R.id.c2);
        checkColorToChange();
        c2.setBackgroundColor(Color.BLUE);
        location = 2;
    }

    public void c3(View view) {
        Button c3 = (Button) findViewById(R.id.c3);
        checkColorToChange();
        c3.setBackgroundColor((Color.BLUE));
        location = 3;
    }

    public void c4(View view) {
        Button c4 = (Button) findViewById(R.id.c4);
        checkColorToChange();
        c4.setBackgroundColor((Color.BLUE));
        location = 4;
    }

    public void c5(View view) {
        Button c5 = (Button) findViewById(R.id.c5);
        checkColorToChange();
        c5.setBackgroundColor((Color.BLUE));
        location = 5;
    }

    public void c6(View view) {
        Button c6 = (Button) findViewById(R.id.c6);
        checkColorToChange();
        c6.setBackgroundColor((Color.BLUE));
        location = 6;
    }

    public void c7(View view) {
        Button c7 = (Button) findViewById(R.id.c7);
        checkColorToChange();
        c7.setBackgroundColor((Color.BLUE));
        location = 7;
    }

    public void c8(View view) {
        Button c8 = (Button) findViewById(R.id.c8);
        checkColorToChange();
        c8.setBackgroundColor((Color.BLUE));
        location = 8;
    }

    public void c9(View view) {
        Button c9 = (Button) findViewById(R.id.c9);
        checkColorToChange();
        c9.setBackgroundColor((Color.BLUE));
        location = 9;
    }

    public void c10(View view) {
        Button c10 = (Button) findViewById(R.id.c10);
        checkColorToChange();
        c10.setBackgroundColor((Color.BLUE));
        location = 10;
    }

    public void c11(View view) {
        Button c11 = (Button) findViewById(R.id.c11);
        checkColorToChange();
        c11.setBackgroundColor((Color.BLUE));
        location = 11;
    }

    public void c12(View view) {
        Button c12 = (Button) findViewById(R.id.c12);
        checkColorToChange();
        c12.setBackgroundColor((Color.BLUE));
        location = 12;
    }

    public void c13(View view) {
        Button c13 = (Button) findViewById(R.id.c13);
        checkColorToChange();
        c13.setBackgroundColor((Color.BLUE));
        location = 13;
    }

    public void c14(View view) {
        Button c14 = (Button) findViewById(R.id.c14);
        checkColorToChange();
        c14.setBackgroundColor((Color.BLUE));
        location = 14;
    }

    public void c15(View view) {
        Button c15 = (Button) findViewById(R.id.c15);
        checkColorToChange();
        c15.setBackgroundColor((Color.BLUE));
        location = 15;
    }

    public void c16(View view) {
        Button c16 = (Button) findViewById(R.id.c16);
        checkColorToChange();
        c16.setBackgroundColor((Color.BLUE));
        location = 16;
    }

    public void c17(View view) {
        Button c17 = (Button) findViewById(R.id.c17);
        checkColorToChange();
        c17.setBackgroundColor((Color.BLUE));
        location = 17;
    }

    public void c18(View view) {
        Button c18 = (Button) findViewById(R.id.c18);
        checkColorToChange();
        c18.setBackgroundColor((Color.BLUE));
        location = 18;
    }

    public void c19(View view) {
        Button c19 = (Button) findViewById(R.id.c19);
        checkColorToChange();
        c19.setBackgroundColor((Color.BLUE));
        location = 19;
    }

    public void c20(View view) {
        Button c20 = (Button) findViewById(R.id.c20);
        checkColorToChange();
        c20.setBackgroundColor((Color.BLUE));
        location = 20;
    }

    public void c21(View view) {
        Button c21 = (Button) findViewById(R.id.c21);
        checkColorToChange();
        c21.setBackgroundColor((Color.BLUE));
        location = 21;
    }

    public void c22(View view) {
        Button c22 = (Button) findViewById(R.id.c22);
        checkColorToChange();
        c22.setBackgroundColor((Color.BLUE));
        location = 22;
    }

    public void c23(View view) {
        Button c23 = (Button) findViewById(R.id.c23);
        checkColorToChange();
        c23.setBackgroundColor((Color.BLUE));
        location = 23;
    }

    public void c24(View view) {
        Button c24 = (Button) findViewById(R.id.c24);
        checkColorToChange();
        c24.setBackgroundColor((Color.BLUE));
        location = 24;
    }

    public void c25(View view) {
        Button c25 = (Button) findViewById(R.id.c25);
        checkColorToChange();
        c25.setBackgroundColor((Color.BLUE));
        location = 25;
    }
    public void button1(View view) {
        Button b1 = (Button) findViewById(R.id.button1);
        checkShapeColorToChange();
        b1.setTextColor((Color.BLUE));
        picture = 1;
    }
    public void button2(View view) {
        Button b2 = (Button) findViewById(R.id.button2);
        checkShapeColorToChange();
        b2.setTextColor((Color.BLUE));
        picture = 2;
    }
    public void button3(View view) {
        Button b3 = (Button) findViewById(R.id.button3);
        checkShapeColorToChange();
        b3.setTextColor((Color.BLUE));
        picture = 3;
    }
    public void button4(View view) {
        Button b4 = (Button) findViewById(R.id.button4);
        checkShapeColorToChange();
        b4.setTextColor((Color.BLUE));
        picture = 4;
    }
    public void button5(View view) {
        Button b5 = (Button) findViewById(R.id.button5);
        checkShapeColorToChange();
        b5.setTextColor((Color.BLUE));
        picture = 5;
    }
    public void button6(View view) {
        Button b6 = (Button) findViewById(R.id.button6);
        checkShapeColorToChange();
        b6.setTextColor((Color.BLUE));
        picture = 6;
    }
    public void button7(View view) {
        Button b7 = (Button) findViewById(R.id.button7);
        checkShapeColorToChange();
        b7.setTextColor((Color.BLUE));
        picture = 7;
    }
    public void button8(View view) {
        Button b8 = (Button) findViewById(R.id.button8);
        checkShapeColorToChange();
        b8.setTextColor((Color.BLUE));
        picture = 8;
    }
    public void button9(View view) {
        Button b9 = (Button) findViewById(R.id.button9);
        checkShapeColorToChange();
        b9.setTextColor((Color.BLUE));
        picture = 9;
    }
    public void button10(View view) {
        Button b10 = (Button) findViewById(R.id.button10);
        checkShapeColorToChange();
        b10.setTextColor((Color.BLUE));
        picture = 10;
    }
    public void button11(View view) {
        Button b11 = (Button) findViewById(R.id.button11);
        checkShapeColorToChange();
        b11.setTextColor((Color.BLUE));
        picture = 11;
    }
    public void submit(View view) {
        ButtonClass b = new ButtonClass(location ,difficultly ,picture);
    }

    public void exit(View view) {
        setContentView(R.layout.activity_main);
    }

    public void checkColorToChange() {
        Button defaultColor = (Button) findViewById(R.id.exit);
        Drawable r = defaultColor.getBackground();
        Button c1 = (Button) findViewById(R.id.c1);
        Button c2 = (Button) findViewById(R.id.c2);
        Button c3 = (Button) findViewById(R.id.c3);
        Button c4 = (Button) findViewById(R.id.c4);
        Button c5 = (Button) findViewById(R.id.c5);
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
        Button c22 = (Button) findViewById(R.id.c22);
        Button c23 = (Button) findViewById(R.id.c23);
        Button c24 = (Button) findViewById(R.id.c24);
        Button c25 = (Button) findViewById(R.id.c25);
        Button[] arr = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25};
        for (int i = 0; i < 25; i++) {
            arr[i].setBackgroundDrawable(r);
        }
    }
    public void checkShapeColorToChange() {
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        Button b9 = (Button) findViewById(R.id.button9);
        Button b10 = (Button) findViewById(R.id.button10);
        Button b11 = (Button) findViewById(R.id.button11);
        Button[] arr = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11};
        for (int i = 0; i < 11; i++) {
            arr[i].setTextColor(Color.WHITE);
        }
    }
}
