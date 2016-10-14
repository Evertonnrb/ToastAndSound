package br.com.evertonnrb.toastandsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void funcao01(View view){
        Toast toast = Toast.makeText(MainActivity.this,"Toast longo", Toast.LENGTH_LONG);
        toast.show();
    }
    public void funcao02(View view){
        Toast.makeText(MainActivity.this,"Toast curto",Toast.LENGTH_SHORT).show();
    }
    public void funcao03(View view){
        MediaPlayer som = MediaPlayer.create(this,R.raw.bomba);
        som.start();
    }
}
