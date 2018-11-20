package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class BasicInfoActivity extends AppCompatActivity {


    Button btn_submit;
    HashMap<String,String> villageHashMap;
    HashMap<String,String> DistrictHashMap;

    String villageSpinnerValue, districtSpinnerValue,blockSpinnerValue,wardNoSpinnerValue,gramPanchayatSpinnerValue, stateSpinnerValue;
    Spinner villageSpinnerHandler, districtSpinnerHandler,blockSpinnerHandler,wardNoSpinnerHandler,gramPanchayatSpinnerHandler, stateSpinnerHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        villageHashMap = new HashMap<String, String>();
        villageHashMap.put("Anjur","anjur");
        villageHashMap.put("Pattaravakkam","patta");
        villageHashMap.put("Thenmelpakkam","thenm");
        villageHashMap.put("Orathur","orath");
        villageHashMap.put("Nattarasampattu","natta");
        DistrictHashMap = new HashMap<String, String>();
        DistrictHashMap.put("Kancheepuram","Ka");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);

        btn_submit = findViewById(R.id.basic_btn_submit);
        villageSpinnerHandler = findViewById(R.id.villageSpinner);
        districtSpinnerHandler = findViewById(R.id.districtspinner);
        blockSpinnerHandler = findViewById(R.id.BlockSpinner);
        gramPanchayatSpinnerHandler = findViewById(R.id.GramPanachayatSpinner);
        wardNoSpinnerHandler = findViewById(R.id.wardNoSpinner);
        stateSpinnerHandler = findViewById(R.id.StateSpinner);

        btn_submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                villageSpinnerValue = villageSpinnerHandler.getSelectedItem().toString();
                districtSpinnerValue = districtSpinnerHandler.getSelectedItem().toString();
                blockSpinnerValue = blockSpinnerHandler.getSelectedItem().toString();
                wardNoSpinnerValue = wardNoSpinnerHandler.getSelectedItem().toString();
                gramPanchayatSpinnerValue = gramPanchayatSpinnerHandler.getSelectedItem().toString();
                stateSpinnerValue = stateSpinnerHandler.getSelectedItem().toString();

                String villageCode=villageHashMap.get(villageSpinnerValue);
                String districtCode=DistrictHashMap.get(districtSpinnerValue);
               /* Toast toast = Toast.makeText(getApplicationContext(),
                        stateSpinnerValue+districtCode+villageCode,
                        Toast.LENGTH_SHORT);

                toast.show();*/

                // Explicit Intent by specifying its class name
                Intent i = new Intent(BasicInfoActivity.this, HouseholdActivity.class);
                i.putExtra("ubaid", stateSpinnerValue+districtCode+villageCode);
                i.putExtra("village", villageSpinnerValue);
                i.putExtra("district", districtSpinnerValue);
                i.putExtra("state", stateSpinnerValue);
                i.putExtra("block", blockSpinnerValue);
                i.putExtra("wardno", wardNoSpinnerValue);
                i.putExtra("gramPanchayat", gramPanchayatSpinnerValue);


                // Starts TargetActivity
                startActivity(i);
            }
        });


    }
}
