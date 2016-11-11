package caro.sinbanda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Buscar extends AppCompatActivity implements View.OnClickListener{

    private Button btnBuscarPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        btnBuscarPersona=(Button)findViewById(R.id.botonbuscarpersona);
        btnBuscarPersona.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;

        explicit_intent=new Intent(this,caro.sinbanda.SinBanda.class);
        startActivity(explicit_intent);

    }
}
