package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GovernmentSchemeActivity extends AppCompatActivity {
Button governmentScheme_btn_submit_Handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government_scheme);

        governmentScheme_btn_submit_Handler= (findViewById(R.id.governmentScheme_btn_submit));
        governmentScheme_btn_submit_Handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GovernmentSchemeActivity.this, SourceWaterActivity.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });
    }
}
