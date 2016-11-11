package caro.sinbanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sinbanda2 extends AppCompatActivity implements View.OnClickListener{

    private Button btnDislike, btnVolver, btnLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinbanda2);

        btnDislike=(Button)findViewById(R.id.botondislike2);
        btnVolver=(Button)findViewById(R.id.volver);
        btnLike=(Button)findViewById(R.id.botonlike2);

        btnDislike.setOnClickListener(this);
        btnVolver.setOnClickListener(this);
        btnLike.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;

        switch (v.getId()){

            case R.id.botondislike2:

                explicit_intent= new Intent(this,caro.sinbanda.SinBanda.class);
                startActivity(explicit_intent);
                break;

            case R.id.volver:
                explicit_intent=new Intent(this,caro.sinbanda.InicioSinBanda.class );
                startActivity(explicit_intent);
                break;

            case R.id.botonlike2:
                Toast toast = Toast.makeText(this, "Notificacion enviada!", Toast.LENGTH_SHORT);
                toast.show();
                break;

        }


    }
}
