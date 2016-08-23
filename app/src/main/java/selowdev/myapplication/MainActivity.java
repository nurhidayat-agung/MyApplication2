package selowdev.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttononclick();
    }
    public void buttononclick(){
        Button btnpindah = (Button)findViewById(R.id.btn_pindah);
        btnpindah.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent pind = new Intent("selowdev.myapplication.Main2Activity");
                        startActivity(pind);
                    }
                }
        );
    }
}
