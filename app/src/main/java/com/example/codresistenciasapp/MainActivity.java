package com.example.codresistenciasapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout lBand1, lBand2, lBand3, lBand4;
    EditText eNumero;
    Button bCalcular, bNeB2, bNeB3, bCaB1, bCaB2, bCaB3, bCaB4, bRoB1, bRoB2, bRoB3, bRoB4, bNaB1,
            bNaB2, bNaB3, bAmaB1, bAmaB2, bAmaB3, bVeB1, bVeB2, bVeB3, bVeB4, bAzB1, bAzB2, bAzB3,
            bAzB4, bMoB1, bMoB2, bMoB3, bMoB4, bGrB1, bGrB2, bGrB4, bBlB1, bBlB2, bDoB3, bDoB4,
            bPlB3, bPlB4;
    int x,y;
    double z, Res;
    String  Tol="", Mul="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lBand1 = (LinearLayout) findViewById(R.id.lBand1);
        lBand2 = (LinearLayout) findViewById(R.id.lBand2);
        lBand3 = (LinearLayout) findViewById(R.id.lBand3);
        lBand4 = (LinearLayout) findViewById(R.id.lBand4);
        eNumero = (EditText) findViewById(R.id.eNumero);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        bNeB2 = (Button) findViewById(R.id.bNeB2);
        bNeB3 = (Button) findViewById(R.id.bNeB3);
        bCaB1 = (Button) findViewById(R.id.bCaB1);
        bCaB2 = (Button) findViewById(R.id.bCaB2);
        bCaB3 = (Button) findViewById(R.id.bCaB3);
        bCaB4 = (Button) findViewById(R.id.bCaB4);
        bRoB1 = (Button) findViewById(R.id.bRoB1);
        bRoB2 = (Button) findViewById(R.id.bRoB2);
        bRoB3 = (Button) findViewById(R.id.bRoB3);
        bRoB4 = (Button) findViewById(R.id.bRoB4);
        bNaB1 = (Button) findViewById(R.id.bNaB1);
        bNaB2 = (Button) findViewById(R.id.bNaB2);
        bNaB3 = (Button) findViewById(R.id.bNaB3);
        bAmaB1 =(Button) findViewById(R.id.bAmaB1);
        bAmaB2 =(Button) findViewById(R.id.bAmaB2);
        bAmaB3 =(Button) findViewById(R.id.bAmaB3);
        bVeB1 = (Button) findViewById(R.id.bVeB1);
        bVeB2 = (Button) findViewById(R.id.bVeB2);
        bVeB3 = (Button) findViewById(R.id.bVeB3);
        bVeB4 = (Button) findViewById(R.id.bVeB4);
        bAzB1 = (Button) findViewById(R.id.bAzB1);
        bAzB2 = (Button) findViewById(R.id.bAzB2);
        bAzB3 = (Button) findViewById(R.id.bAzB3);
        bAzB4 = (Button) findViewById(R.id.bAzB4);
        bMoB1 = (Button) findViewById(R.id.bMoB1);
        bMoB2 = (Button) findViewById(R.id.bMoB2);
        bMoB3 = (Button) findViewById(R.id.bMoB3);
        bMoB4 = (Button) findViewById(R.id.bMoB4);
        bGrB1 = (Button) findViewById(R.id.bGrB1);
        bGrB2 = (Button) findViewById(R.id.bGrB2);
        bGrB4 = (Button) findViewById(R.id.bGrB4);
        bBlB1 = (Button) findViewById(R.id.bBlB1);
        bBlB2 = (Button) findViewById(R.id.bBlB2);
        bDoB3 =(Button) findViewById(R.id.bDoB3);
        bDoB4 =(Button) findViewById(R.id.bDoB4);
        bPlB3 =(Button) findViewById(R.id.bPlB3);
        bPlB4 =(Button) findViewById(R.id.bPlB4);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Resultado=" ";
                Res=(x+y)*z;
                //Resultado=String.valueOf(Res);
                String Resultado = String.format("%.1f", Res);
                //Resultado=Resultado + Mul + Tol;
                eNumero.setText(Resultado + Mul + Tol);
                Mul=" ";
            }
        });

    }

    public void click(View view){
        int id=view.getId();
        switch(id){
            case R.id.bCaB1:
                x=10;
                lBand1.setBackgroundColor(Color.parseColor("#a52a2a"));
                break;
            case R.id.bRoB1:
                x=20;
                lBand1.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.bNaB1:
                x=30;
                lBand1.setBackgroundColor(Color.parseColor("#ffa500"));
                break;
            case R.id.bAmaB1:
                x=40;
                lBand1.setBackgroundColor(Color.parseColor("#ffff00"));
                break;
            case R.id.bVeB1:
                x=50;
                lBand1.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case R.id.bAzB1:
                x=60;
                lBand1.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
            case R.id.bMoB1:
                x=70;
                lBand1.setBackgroundColor(Color.parseColor("#ee82ee"));
                break;
            case R.id.bGrB1:
                x=80;
                lBand1.setBackgroundColor(Color.parseColor("#808080"));
                break;
            case R.id.bBlB1:
                x=90;
                lBand1.setBackgroundColor(Color.parseColor("#ffffff"));
                break;


            case R.id.bNeB2:
                y=0;
                lBand2.setBackgroundColor(Color.parseColor("#000000"));
                break;
            case R.id.bCaB2:
                y=1;
                lBand2.setBackgroundColor(Color.parseColor("#a52a2a"));
                break;
            case R.id.bRoB2:
                y=2;
                lBand2.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.bNaB2:
                y=3;
                lBand2.setBackgroundColor(Color.parseColor("#ffa500"));
                break;
            case R.id.bAmaB2:
                y=4;
                lBand2.setBackgroundColor(Color.parseColor("#ffff00"));
                break;
            case R.id.bVeB2:
                y=5;
                lBand2.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case R.id.bAzB2:
                y=6;
                lBand2.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
            case R.id.bMoB2:
                y=7;
                lBand2.setBackgroundColor(Color.parseColor("#ee82ee"));
                break;
            case R.id.bGrB2:
                y=8;
                lBand2.setBackgroundColor(Color.parseColor("#808080"));
                break;
            case R.id.bBlB2:
                y=9;
                lBand2.setBackgroundColor(Color.parseColor("#ffffff"));
                break;


            case R.id.bNeB3:
                z=1;
                Mul="0";
                lBand3.setBackgroundColor(Color.parseColor("#000000"));
                break;
            case R.id.bCaB3:
                z=10;
                Mul="0";
                lBand3.setBackgroundColor(Color.parseColor("#a52a2a"));
                break;
            case R.id.bRoB3:
                z=0.1;
                Mul="k";
                lBand3.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.bNaB3:
                z=1;
                Mul="k";
                lBand3.setBackgroundColor(Color.parseColor("#ffa500"));
                break;
            case R.id.bAmaB3:
                z=10;
                Mul="k";
                lBand3.setBackgroundColor(Color.parseColor("#ffff00"));
                break;
            case R.id.bVeB3:
                z=0.1;
                Mul="M";
                lBand3.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case R.id.bAzB3:
                z=1;
                Mul="M";
                lBand3.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
            case R.id.bMoB3:
                z=10;
                Mul="M";
                lBand3.setBackgroundColor(Color.parseColor("#ee82ee"));
                break;
            case R.id.bDoB3:
                z=0.1;
                Mul="0";
                lBand3.setBackgroundColor(Color.parseColor("#bdb76b"));
                break;
            case R.id.bPlB3:
                z=0.01;
                Mul="0";
                lBand3.setBackgroundColor(Color.parseColor("#c0c0c0"));
                break;


            case R.id.bCaB4:
                Tol="+1%";
                lBand4.setBackgroundColor(Color.parseColor("#a52a2a"));
                break;
            case R.id.bRoB4:
                Tol="+2%";
                lBand4.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.bVeB4:
                Tol="+0.5%";
                lBand4.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case R.id.bAzB4:
                Tol="+0.25%";
                lBand4.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
            case R.id.bMoB4:
                Tol="+0.1%";
                lBand4.setBackgroundColor(Color.parseColor("#ee82ee"));
                break;
            case R.id.bGrB4:
                Tol="+0.05%";
                lBand4.setBackgroundColor(Color.parseColor("#808080"));
                break;
            case R.id.bDoB4:
                Tol="+5%";
                lBand4.setBackgroundColor(Color.parseColor("#bdb76b"));
                break;
            case R.id.bPlB4:
                Tol="+10%";
                lBand4.setBackgroundColor(Color.parseColor("#c0c0c0"));
                break;
        }
    }

}
