package com.example.smallcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView affichage;
    private Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,oppPlus,oppMoin,oppFois,oppDiv,numpoint,numegale;

    private float [] valeur = new float [2];
    private int i = 0;
    private float resultat;
    String [] valeString = new String [2] ;
    private int opperation;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valeString[0] = "";
        valeString[1] = "";

        this.affichage = findViewById(R.id.affichage);
        this.num0 = findViewById(R.id.text0);
        this.num1 = findViewById(R.id.text1);
        this.num2 = findViewById(R.id.text2);
        this.num3 = findViewById(R.id.text3);
        this.num4 = findViewById(R.id.text4);
        this.num5 = findViewById(R.id.text5);
        this.num6 = findViewById(R.id.text6);
        this.num7 = findViewById(R.id.text7);
        this.num8 = findViewById(R.id.text8);
        this.num9 = findViewById(R.id.text9);
        this.num0 = findViewById(R.id.text0);
        this.oppPlus = findViewById(R.id.textplus);
        this.oppMoin = findViewById(R.id.textmoin);
        this.oppFois = findViewById(R.id.textfois);
        this.oppDiv = findViewById(R.id.textdiv);
        this.numpoint = findViewById(R.id.textpoint);
        this.numegale = findViewById(R.id.textegale);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "1";
                affichage.setText(valeString[(i+1)%2]);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "2";
                affichage.setText(valeString[(i+1)%2]);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "3";
                affichage.setText(valeString[(i+1)%2]);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "4";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "5";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "6";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "7";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "8";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "9";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + "0";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        numpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeString[(i+1)%2] = valeString[(i+1)%2] + ".";
                affichage.setText(valeString[(i+1)%2]);
            }
        });

        oppPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeur[(i+1)%2] = Float.valueOf(valeString[(i+1)%2]);
                affichage.setText( "\n + \n");
                i++;
                opperation = 1;

            }
        });

        oppFois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeur[(i+1)%2] = Float.valueOf(valeString[(i+1)%2]);
                affichage.setText("\n x \n");
                i++;
                opperation = 3;

            }
        });

        oppMoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeur[(i+1)%2] = Float.valueOf(valeString[(i+1)%2]);
                affichage.setText("\n x \n");
                i++;
                opperation = 2;

            }
        });

        oppDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valeur[(i+1)%2] = Float.valueOf(valeString[(i+1)%2]);
                affichage.setText("\n % \n");
                i++;
                opperation = 4;

            }
        });
        numegale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                valeur[(i+1)%2] = Float.valueOf(valeString[(i+1)%2]);
                valeur[(i)%2] = Float.valueOf(valeString[(i)%2]);
                switch (opperation){
                    case 1:
                        resultat = valeur[(i+1)%2] + valeur[(i)%2];
                        valeString[0] = "";
                        valeString[1] = "";
                        affichage.setText(Float.toString(valeur[(i+1)%2]) + " + " + Float.toString(valeur[(i)%2]) + " = " + Float.toString(resultat));
                        break;
                    case 2:
                        resultat = valeur[(i+1)%2] - valeur[(i)%2];
                        valeString[0] = "";
                        valeString[1] = "";
                        affichage.setText(Float.toString(valeur[(i+1)%2]) + " - " + Float.toString(valeur[(i)%2]) + " = " + Float.toString(resultat));
                        break;
                    case 3:
                        resultat = valeur[(i+1)%2] * valeur[(i)%2];
                        valeString[0] = "";
                        valeString[1] = "";
                        affichage.setText(Float.toString(valeur[(i+1)%2]) + " x " + Float.toString(valeur[(i)%2]) + " = " + Float.toString(resultat));
                        break;
                    case 4:
                        if(valeur[(i)%2]!=0) {
                            resultat = valeur[(i + 1) % 2] / valeur[(i) % 2];
                            valeString[0] = "";
                            valeString[1] = "";
                            affichage.setText(Float.toString(valeur[(i + 1) % 2]) + " / " + Float.toString(valeur[(i) % 2]) + " = " + Float.toString(resultat));
                        }else{
                            affichage.setText("On ne peut pas diviser un nombre par un zero");
                        }
                        break;
                }
            }
        });

    }
}