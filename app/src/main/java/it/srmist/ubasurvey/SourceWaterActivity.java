package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SourceWaterActivity extends AppCompatActivity {
    RadioButton radio_pipedWaterAtHome_yes,radio_pipedWaterAtHome_no;
    Button sourceWater_btn_submit_Handler;
    EditText pipedWaterDistance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_source_water);



        class Radio_check implements  CompoundButton.OnCheckedChangeListener
        {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(radio_pipedWaterAtHome_yes.isChecked())
                {
                    pipedWaterDistance.setVisibility(View.VISIBLE);
                }
                else if(radio_pipedWaterAtHome_no.isChecked())
                {
                    pipedWaterDistance.setVisibility(View.INVISIBLE);
                }
            }
        }

        radio_pipedWaterAtHome_yes.setOnCheckedChangeListener(new Radio_check());
        radio_pipedWaterAtHome_no.setOnCheckedChangeListener(new Radio_check());


        /*sourceWater_btn_submit_Handler= (findViewById(R.id.sourceWater_btn_submit));
        sourceWater_btn_submit_Handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SourceWaterActivity.this, SourceEnergyPower.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });*/
    }
}
