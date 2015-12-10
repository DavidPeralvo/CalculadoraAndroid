package com.example.davidperalvogomez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,nc,nabs,ndel,nx,ndiv,nrest,nsum,npunto,nigual;
    private TextView display;
    boolean punto=false;
    boolean suma=false;
    boolean restar=false;
    boolean multi=false;
    boolean dividir=false;
    Double[] numero= new Double [20];
    Double resultado ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n0=(Button)findViewById(R.id.button0);
        n0.setOnClickListener(this);
        n1=(Button)findViewById(R.id.button1);
        n1.setOnClickListener(this);
        n2=(Button)findViewById(R.id.button2);
        n2.setOnClickListener(this);
        n3=(Button)findViewById(R.id.button3);
        n3.setOnClickListener(this);
        n4=(Button)findViewById(R.id.button4);
        n4.setOnClickListener(this);
        n5=(Button)findViewById(R.id.button5);
        n5.setOnClickListener(this);
        n6=(Button)findViewById(R.id.button6);
        n6.setOnClickListener(this);
        n7=(Button)findViewById(R.id.button7);
        n7.setOnClickListener(this);
        n8=(Button)findViewById(R.id.button8);
        n8.setOnClickListener(this);
        n9=(Button)findViewById(R.id.button9);
        n9.setOnClickListener(this);
        nc=(Button)findViewById(R.id.buttonborrartodo);
        nc.setOnClickListener(this);
        nabs=(Button)findViewById(R.id.buttonabs);
        nabs.setOnClickListener(this);
        nx=(Button)findViewById(R.id.buttonmulti);
        nx.setOnClickListener(this);
        ndiv=(Button)findViewById(R.id.buttondividir);
        ndiv.setOnClickListener(this);
        nrest=(Button)findViewById(R.id.buttonrestar);
        nrest.setOnClickListener(this);
        nsum=(Button)findViewById(R.id.buttonsumar);
        nsum.setOnClickListener(this);
        npunto=(Button)findViewById(R.id.buttonpunto);
        npunto.setOnClickListener(this);
        nigual=(Button)findViewById(R.id.buttonigual);
        nigual.setOnClickListener(this);
    }



    public void onClick(View view){
        display=(TextView)findViewById(R.id.textView);
        int seleccion= view.getId();
        String contenido=display.getText().toString();

        try {
        switch (seleccion){

                case R.id.button0:
                    display.setText(contenido+"0");
                    break;
                case R.id.button1:
                    display.setText(contenido+"1");
                    break;
                case R.id.button2:
                    display.setText(contenido+"2");
                    break;
                case R.id.button3:
                    display.setText(contenido+"3");
                    break;
                case R.id.button4:
                    display.setText(contenido+"4");
                    break;
                case R.id.button5:
                    display.setText(contenido+"5");
                    break;
                case R.id.button6:
                    display.setText(contenido+"6");
                    break;
                case R.id.button7:
                    display.setText(contenido+"7");
                    break;
                case R.id.button8:
                    display.setText(contenido+"8");
                    break;
                case R.id.button9:
                    display.setText(contenido+"9");
                    break;
                case R.id.buttonpunto:
                    if(punto==false){
                    display.setText(contenido+".");
                    punto=true;}
                    else{return;}
                    break;
                case R.id.buttonsumar:
                    suma=true;
                    numero[0]=Double.parseDouble(contenido);
                    display.setText("");
                    punto=false;
                    break;
                case R.id.buttonrestar:
                    restar=true;
                    numero[0]=Double.parseDouble(contenido);
                    display.setText("");
                    punto=false;
                    break;
                case R.id.buttonmulti:
                    multi=true;
                    numero[0]=Double.parseDouble(contenido);
                    display.setText("");
                    punto=false;
                    break;
                case R.id.buttondividir:
                    dividir=true;
                    numero[0]=Double.parseDouble(contenido);
                    display.setText("");
                    punto=false;
                    break;
                case R.id.buttonabs:
                    numero[0]=Double.parseDouble(contenido);
                    resultado=(numero[0])*-1;
                    display.setText(String.valueOf(resultado));
                    break;
                case R.id.buttonborrartodo:
                    display.setText("");
                    punto=false;
                    break;

            case R.id.buttonigual:
                    numero[1]=Double.parseDouble(contenido);
                if(suma==true){
                    resultado=numero[0]+numero[1];
                    display.setText(String.valueOf(resultado));

                }else if(restar==true){
                    resultado=numero[0]-numero[1];
                    display.setText(String.valueOf(resultado));

                }else if(multi==true){
                    resultado=numero[0]*numero[1];
                    display.setText(String.valueOf(resultado));

                }else if(dividir==true){
                    resultado=numero[0]/numero[1];
                    display.setText(String.valueOf(resultado));

                }
                punto=false;
                suma=false;
                restar=false;
                dividir=false;
                multi=false;
                break;

            }



        }
        catch (Exception e){
            display.setText("error");

        }




    }
}
