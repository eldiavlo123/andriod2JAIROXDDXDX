package com.example.andriod2jairoxddxdxdxdx;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //atributos -> variables

    //atributos que representen cada elemento visual de que diseñemos
    //nota: elemento visual que van a poder usar por codigo
    private TextView txtResultado;
    private Button BTNbotonsito;
    private EditText tbNombre, tbCelular;
    //ATRIBUTOS DE CLASE

    private String nombre;
    private int celular;

    //metodos -> funciones
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        /*
        para confugirar al boton y decirle que este pendiente al evento
        click que se haga sobre el boton usamos un metodo del tipo SETTER....
        Y EN realidad ustededs quieren confugirar un concepto llamado
        listener ---> algoq eu esta pendiente a que pase cierto evento
         */
        BTNbotonsito.setOnClickListener(this);
    }

    private void inicializarVistas()
    {
        /*
        defubeb el enlace de sus variables o atributos
        con sus componentes visuales que han diseñado en pantalla
        inicialuzando sus vistas -> referencia de un view a una variable
         */
        txtResultado = findViewById(R.id.txtResultado);
        BTNbotonsito = findViewById(R.id.BTNbotonsito);
        tbNombre = findViewById(R.id.tbNombre);
        tbCelular = findViewById(R.id.tbCelular);
    }
    private void obtenerInformacionUsuario()
    {
        /*
        para obtener la informacion que el usuario introduze en los
        campos del texto. ustedes van a obtener esos valores del
        atributo TEXT que esat presente en el diseñador de ese componente
        y para obtener algo en POO en java se usa el buen amigo getter
        obtener el teto de edit text -> .getText()
         */
        nombre = tbNombre.getText().toString();
        String celularText = tbCelular.getText().toString();
        celular = Integer.parseInt(celularText);
    }
    private void invertirNumero()
    {
        int resto = 0, invertido = 0;
        while (this.celular>0)
        {
            resto = this.celular %10;
            invertido = invertido * 10 + resto;
            this.celular = this.celular / 10;
        }
        txtResultado.setText("valor invertido:" + invertido);
    }

    @Override
    public void onClick(View view)
    {
        obtenerInformacionUsuario();
        invertirNumero();
    }
}