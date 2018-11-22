package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgricultureProdcueActivity extends AppCompatActivity {

    Button agricProduce_btn_submit_handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_prodcue);

        agricProduce_btn_submit_handler= (findViewById(R.id.agricProduce_btn_submit));
        agricProduce_btn_submit_handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AgricultureProdcueActivity.this, LivestockNumbersActivity.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });
    }
}
