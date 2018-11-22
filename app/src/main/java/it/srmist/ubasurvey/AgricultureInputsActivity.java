package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgricultureInputsActivity extends AppCompatActivity {

    Button agricInputs_btn_submit_handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_inputs);

        agricInputs_btn_submit_handler= (findViewById(R.id.agricInputs_btn_submit));
        agricInputs_btn_submit_handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AgricultureInputsActivity.this, AgricultureProdcueActivity.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });
    }
}
