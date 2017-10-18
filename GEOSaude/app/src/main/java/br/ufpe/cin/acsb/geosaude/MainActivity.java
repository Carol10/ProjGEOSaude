package br.ufpe.cin.acsb.geosaude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button butLog;

    public void init(){

        butLog = (Button)findViewById(R.id.button);

        butLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                android.content.Intent toy = new android.content.Intent(MainActivity.this, TabsActivity.class);
                startActivity(toy);

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
}
