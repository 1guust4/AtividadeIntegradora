package gustavo.maia.ava3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoBebe_Semana_17 extends AppCompatActivity {

    private TextView info_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_bebe_semana17);
        getSupportActionBar().hide();

    }

    private void IniciarComponentes(){

        info_1 = findViewById(R.id.info_1);
    }
}