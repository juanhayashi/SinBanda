package caro.sinbanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class InicioSinBanda extends AppCompatActivity implements View.OnClickListener{

    private Button btnBuscar,btnPerfil,btnMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sin_banda);

        btnBuscar=(Button)findViewById(R.id.botonbuscar);
        btnPerfil=(Button)findViewById(R.id.botonperfil);
        btnMensaje=(Button)findViewById(R.id.botonmensaje);

        btnBuscar.setOnClickListener(this);
        btnPerfil.setOnClickListener(this);
        btnMensaje.setOnClickListener(this);

        //Intent intent = new Intent(this, SinBanda.class);
        //intent.putExtra();
        //startActivity(intent);
    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent; // Esto crea el Intent

        switch (v.getId()){     // Con esto se obtiene el ID del Boton presionado

            // En esta parte, se comienza a indicar qué hacer en caso de seleccionar cada botón
            case R.id.botonbuscar://En caso de seleccionar el botón Buscar
                explicit_intent =new Intent(this,caro.sinbanda.Buscar.class); // invoca con el Intent al Activity Buscar
                startActivity(explicit_intent); //Aquí se inicia el Activity invocado
                break;
            case R.id.botonperfil://Lo mismo para botón Perfil
                explicit_intent=new Intent(this, caro.sinbanda.PerfilUsuario.class);
                startActivity(explicit_intent);
                break;
            case R.id.botonmensaje:
                explicit_intent = new Intent(this,caro.sinbanda.MensajesUsuario.class);
                startActivity(explicit_intent);
        }

    }
}
