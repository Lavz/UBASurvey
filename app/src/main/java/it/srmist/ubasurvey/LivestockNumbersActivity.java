package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LivestockNumbersActivity extends AppCompatActivity {

    Button livestock_btn_submit_handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livestock_numbers);

        livestock_btn_submit_handler= (findViewById(R.id.livestock_btn_submit));
        livestock_btn_submit_handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LivestockNumbersActivity.this, MajorProblemsActivity.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });
    }
}
