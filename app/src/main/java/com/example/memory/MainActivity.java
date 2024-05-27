package com.example.memory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView tv_p1, tv_p2;
    ImageView q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12;

    Integer[] arraySlika = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int slika1,slika2,slika3,slika4,slika5,slika6,slika7,slika8,slika9,slika10,slika11,slika12;
    int prvaSlika, drugaSlika;
    int izabranaSlika1, izabranaSlika2;

    int brojSlike =  1;

    int potez = 1;

    int bodIgraca= 0, bodRacunala = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);
        q1 = (ImageView) findViewById(R.id.q1);
        q2 = (ImageView) findViewById(R.id.q2);
        q3 = (ImageView) findViewById(R.id.q3);
        q4 = (ImageView) findViewById(R.id.q4);
        q5 = (ImageView) findViewById(R.id.q5);
        q6 = (ImageView) findViewById(R.id.q6);
        q7 = (ImageView) findViewById(R.id.q7);
        q8 = (ImageView) findViewById(R.id.q8);
        q9 = (ImageView) findViewById(R.id.q9);
        q10 = (ImageView) findViewById(R.id.q10);
        q11 = (ImageView) findViewById(R.id.q11);
        q12 = (ImageView) findViewById(R.id.q12);

        q1.setTag("0");
        q2.setTag("1");
        q3.setTag("2");
        q4.setTag("3");
        q5.setTag("4");
        q6.setTag("5");
        q7.setTag("6");
        q8.setTag("7");
        q9.setTag("8");
        q10.setTag("9");
        q11.setTag("10");
        q12.setTag("11");

        prednjaStranaKarata();
        Collections.shuffle(Arrays.asList(arraySlika));
        tv_p1.setTextColor(Color.WHITE);
        tv_p2.setTextColor(Color.GRAY);

        q1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q1, slika);
            }
        });
        q2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q2, slika);
            }
        });
        q3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q3, slika);
            }
        });
        q4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q4, slika);
            }
        });
        q5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q5, slika);
            }
        });
        q6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q6, slika);
            }
        });
        q7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q7, slika);
            }
        });
        q8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q8, slika);
            }
        });
        q9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q9, slika);
            }
        });
        q10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q10, slika);
            }
        });
        q11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q11, slika);
            }
        });
        q12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int slika = Integer.parseInt((String) view.getTag());
                provjera(q12, slika);
            }
        });

    }
    private void provjera(ImageView q, int slika){
        if(arraySlika[slika]==1){
                q.setImageResource(slika1);
        }   else if(arraySlika[slika]==2){
                q.setImageResource(slika2);
        }   else if(arraySlika[slika]==3){
                q.setImageResource(slika3);
        }   else if(arraySlika[slika]==4){
            q.setImageResource(slika4);
        }   else if(arraySlika[slika]==5){
            q.setImageResource(slika5);
        }   else if(arraySlika[slika]==6){
            q.setImageResource(slika6);
        }   else if(arraySlika[slika]==7){
            q.setImageResource(slika7);
        }   else if(arraySlika[slika]==8){
            q.setImageResource(slika8);
        }   else if(arraySlika[slika]==9){
            q.setImageResource(slika9);
        }   else if(arraySlika[slika]==10){
            q.setImageResource(slika10);
        }   else if(arraySlika[slika]==11){
            q.setImageResource(slika11);
        }   else if(arraySlika[slika]==12){
            q.setImageResource(slika12);
        }


    if(brojSlike == 1) {

        prvaSlika = arraySlika[slika];

        if (prvaSlika > 6) {
            prvaSlika = prvaSlika - 6;
            System.out.println(prvaSlika);
        }
        brojSlike = 2;
        izabranaSlika1 = slika;

        q.setEnabled(false);
    } else if (brojSlike == 2) {
        drugaSlika = arraySlika[slika];
        if (drugaSlika > 6) {
            drugaSlika = drugaSlika - 6;
        }
        brojSlike = 1;
        izabranaSlika2 = slika;

        q1.setEnabled(false);
        q2.setEnabled(false);
        q3.setEnabled(false);
        q4.setEnabled(false);
        q5.setEnabled(false);
        q6.setEnabled(false);
        q7.setEnabled(false);
        q8.setEnabled(false);
        q9.setEnabled(false);
        q10.setEnabled(false);
        q11.setEnabled(false);
        q12.setEnabled(false);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                kalkuliraj();
            }
        }, 1000);
    }
    }

    private void kalkuliraj(){
        if(prvaSlika==drugaSlika){
            if(izabranaSlika1==0){
                q1.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==1){
                q2.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==2){
                q3.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==3){
                q4.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==4){
                q5.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==5){
                q6.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==6){
                q7.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==7){
                q8.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==8){
                q9.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==9){
                q10.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==10){
                q11.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika1==11){
                q12.setVisibility(View.INVISIBLE);
            }

            if(izabranaSlika2==0){
                q1.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==1){
                q2.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==2){
                q3.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==3){
                q4.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==4){
                q5.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==5){
                q6.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==6){
                q7.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==7){
                q8.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==8){
                q9.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==9){
                q10.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==10){
                q11.setVisibility(View.INVISIBLE);
            }   else if(izabranaSlika2==11){
                q12.setVisibility(View.INVISIBLE);
            }
            if(potez== 1){
                bodIgraca++;
                tv_p1.setText("Igrac 1: " +bodIgraca);
            } else if(potez == 2){
                bodRacunala++;
                tv_p2.setText("Igrac 2: " + bodRacunala);
            }

        }
        else{
            q1.setImageResource(R.drawable.question);
            q2.setImageResource(R.drawable.question);
            q3.setImageResource(R.drawable.question);
            q4.setImageResource(R.drawable.question);
            q5.setImageResource(R.drawable.question);
            q6.setImageResource(R.drawable.question);
            q7.setImageResource(R.drawable.question);
            q8.setImageResource(R.drawable.question);
            q9.setImageResource(R.drawable.question);
            q10.setImageResource(R.drawable.question);
            q11.setImageResource(R.drawable.question);
            q12.setImageResource(R.drawable.question);
            if(potez == 1){
                potez=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.WHITE);
            } else if( potez == 2){
                potez = 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.WHITE);
            }
        }
        q1.setEnabled(true);
        q2.setEnabled(true);
        q3.setEnabled(true);
        q4.setEnabled(true);
        q5.setEnabled(true);
        q6.setEnabled(true);
        q7.setEnabled(true);
        q8.setEnabled(true);
        q9.setEnabled(true);
        q10.setEnabled(true);
        q11.setEnabled(true);
        q12.setEnabled(true);

        provjeriJeLiKraj();
    }
    private void provjeriJeLiKraj(){
        if(q1.getVisibility() == View.INVISIBLE
        && q2.getVisibility() == View.INVISIBLE
        && q3.getVisibility() == View.INVISIBLE
        && q4.getVisibility() == View.INVISIBLE
        && q5.getVisibility() == View.INVISIBLE
        && q6.getVisibility() == View.INVISIBLE
        && q7.getVisibility() == View.INVISIBLE
        && q8.getVisibility() == View.INVISIBLE
        && q9.getVisibility() == View.INVISIBLE
        && q10.getVisibility() == View.INVISIBLE
        && q11.getVisibility() == View.INVISIBLE
        && q12.getVisibility() == View.INVISIBLE
        ){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("GOTOVA IGRA:\nIgrac 1: " + bodIgraca + "\nIgrac 2: " + bodRacunala).setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    private void prednjaStranaKarata(){
        slika1 = R.drawable.chicken;
        slika1 = R.drawable.chicken;
        slika7 = R.drawable.chicken2;
        slika2 = R.drawable.cow;
        slika8 = R.drawable.cow2;
        slika3 = R.drawable.dog;
        slika9 = R.drawable.dog2;
        slika4 = R.drawable.duck;
        slika10 = R.drawable.duck2;
        slika5 = R.drawable.pig;
        slika11 = R.drawable.pig2;
        slika6 = R.drawable.sheep;
        slika12 = R.drawable.sheep2;

    }

}