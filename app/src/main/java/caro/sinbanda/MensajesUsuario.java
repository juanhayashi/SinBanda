package caro.sinbanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MensajesUsuario extends AppCompatActivity implements View.OnClickListener{

    private Button btnMensaje1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes_usuario);

        btnMensaje1=(Button)findViewById(R.id.buttonMensajes1);
        btnMensaje1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent explicit_intent;
        explicit_intent=new Intent(this,caro.sinbanda.InicioSinBanda.class);
        startActivity(explicit_intent);
    }

}
