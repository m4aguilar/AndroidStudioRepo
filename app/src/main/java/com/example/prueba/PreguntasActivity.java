package com.example.prueba;



import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;



public class PreguntasActivity extends AppCompatActivity {

    Button buttonRA, buttonRB, buttonRC;
    TextView textViewPregunta;
    final String[] opcion = {new String("")};
    final String pregunta = "¿En qúe año nació Pablo Picasso?";
    final String respuestaA = "1850";
    final String respuestaB = "1881";
    final String respuestaC = "1901";


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_preguntas);


        buttonRA = (Button) findViewById(R.id.buttonRA);
        buttonRB = (Button) findViewById(R.id.buttonRB);
        buttonRC = (Button) findViewById(R.id.buttonRC);
        textViewPregunta = (TextView) findViewById(R.id.textViewPregunta);
        textViewPregunta.setText(pregunta);
        buttonRA.setText(respuestaA);
        buttonRB.setText(respuestaB);
        buttonRC.setText(respuestaC);


        buttonRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion[0] = "A";
                //Toast, para mostrar un mensaje inmediato en la pantalla
                //Toast.makeText(PreguntasActivity.this, opcion[0], Toast.LENGTH_SHORT).show();
                comprobarRespuesta(opcion[0]);
            }
        });

        buttonRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion[0] = "B";
                comprobarRespuesta(opcion[0]);
            }
        });

        buttonRC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion[0] = "C";
                comprobarRespuesta(opcion[0]);
            }
        });

    }
    public void comprobarRespuesta(String respuesta) {

        //Para cargar el estilo del boton
        //ContextCompat.getDrawable(this, R.drawable.borderedondo);

        switch (respuesta) {
            case "A":
                //buttonRA.setBackgroundColor(Color.parseColor("#FF0000"));
                //buttonRB.setBackgroundColor(Color.parseColor("#BDBDBD"));
                //buttonRC.setBackgroundColor(Color.parseColor("#BDBDBD"));
                buttonRA.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondorojo));
                buttonRB.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondo));
                buttonRC.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondo));
                break;
            case "B":
                buttonRA.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondo));
                buttonRB.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondoverde));
                buttonRC.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondo));
                break;
            case "C":
                buttonRA.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondo));
                buttonRB.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondo));
                buttonRC.setBackground(ContextCompat.getDrawable(this, R.drawable.borderedondorojo));
                break;
        }
    }

}







