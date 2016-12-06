package caro.sinbanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerfilUsuario extends AppCompatActivity implements View.OnClickListener{

    private Button btnPerfil1,btnMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        btnPerfil1=(Button)findViewById(R.id.buttonPerfil1);
        btnMensaje=(Button)findViewById(R.id.botonmensaje);
        btnPerfil1.setOnClickListener(this);
        btnMensaje.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent explicit_intent;
        explicit_intent=new Intent(this,caro.sinbanda.InicioSinBanda.class);
        startActivity(explicit_intent);

        switch (v.getId()) {
            case R.id.botonmensaje:
                explicit_intent = new Intent(this, caro.sinbanda.MensajesUsuario.class);
                startActivity(explicit_intent);
        }
    }

}
