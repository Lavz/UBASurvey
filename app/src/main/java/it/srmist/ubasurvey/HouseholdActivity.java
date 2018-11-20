package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HouseholdActivity extends AppCompatActivity {

    Button household_btn_submit_handler;
    EditText householdID_Handler, household_HeadName_handler,annualIncome_Handler;
    RadioGroup radioGender_Handler,radioCategory_Handler,radio_poverty_status_Handler,radio_ownhouse_Handler, radio_typeHouse_column1_Handler;
    RadioGroup radio_toilet_column1_Handler,radio_drainage_column1_Handler;
    RadioGroup waste_DoorStep_column1_Handler,radio_compost_Handler, radio_biogas_column1_Handler;

    RadioButton radioGenderButton,radioCategoryButton,radioPovertyStatusButton,radioOwnHouseButton,radioTypeHouseButton;
    RadioButton radioToiletButton,radioDrainageButton,radioWastageButton,radioCompostButton,radioBiogasButton;
    String householdID,household_HeadName,GenderValue,radioCategoryValue,radioPovertyStatusValue,radioOwnHouseValue,radioTypeHouseValue,radioToiletValue;
    String radioDrainageValue,radioWastageValue,radioCompostValue,radioBiogasValue,annualIncomeValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);
        // Get bundle object at appropriate place in your code
        /*Bundle extras = getIntent().getExtras();

        // Extract data using passed keys
        String village = extras.getString("village");
        String district = extras.getString("district");
        String state = extras.getString("state");
        String block = extras.getString("block");
        String wardno = extras.getString("wardno");
        String gramPanchayat = extras.getString("gramPanchayat");
        String ubaid = extras.getString("ubaid");*/



        household_btn_submit_handler = findViewById(R.id.household_btn_submit);

        household_btn_submit_handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ResultenString = getValueFromForm();
                 Toast toast = Toast.makeText(getApplicationContext(),
                         ResultenString,
                        Toast.LENGTH_SHORT);

                toast.show();

                Intent i = new Intent(HouseholdActivity.this, FamilyMembersInfo.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });



    }

    private String getValueFromForm() {
        householdID_Handler = findViewById(R.id.householdID);
        household_HeadName_handler = findViewById(R.id.household_HeadName);
        annualIncome_Handler = findViewById(R.id.annualIncome);
        radioGender_Handler = findViewById(R.id.radioGender);
        radioCategory_Handler = findViewById(R.id.radioCategory);
        radio_poverty_status_Handler = findViewById(R.id.radio_poverty_status);
        radio_ownhouse_Handler = findViewById(R.id.radio_ownhouse);
        radio_typeHouse_column1_Handler = findViewById(R.id.radio_typeHouse);
        radio_toilet_column1_Handler = findViewById(R.id.radio_toilet_column1);
        radio_drainage_column1_Handler = findViewById(R.id.radio_drainage_column1);
        waste_DoorStep_column1_Handler = findViewById(R.id.waste_DoorStep_column1);
        radio_compost_Handler = findViewById(R.id.radio_compost);
        radio_biogas_column1_Handler = findViewById(R.id.radio_biogas_column1);



        householdID = String.valueOf(householdID_Handler.getText());
        household_HeadName = String.valueOf(household_HeadName_handler.getText());
        // Radio Gender Option Value Fetching
        int selectedGenderId = radioGender_Handler.getCheckedRadioButtonId();
        radioGenderButton = (RadioButton) findViewById(selectedGenderId);
        GenderValue = (String) radioGenderButton.getText();

        // Radio Category Option Value Fetching
        int selectedCategoryId = radioCategory_Handler.getCheckedRadioButtonId();
        radioCategoryButton =(RadioButton) findViewById(selectedCategoryId);
        radioCategoryValue = (String) radioCategoryButton.getText();

        // Radio Poverty Status Option Value Fetching
        int selectedPovertyId = radio_poverty_status_Handler.getCheckedRadioButtonId();
        radioPovertyStatusButton =(RadioButton) findViewById(selectedPovertyId);
        radioPovertyStatusValue = (String) radioPovertyStatusButton.getText();

        // Radio own house Option Value Fetching
        int selectedOwnHouseId = radio_ownhouse_Handler.getCheckedRadioButtonId();
        radioOwnHouseButton =(RadioButton) findViewById(selectedOwnHouseId);
        radioOwnHouseValue = (String) radioOwnHouseButton.getText();

        // Radio Type House column1 Option Value Fetching
        int selectedTypeHouse1Id = radio_typeHouse_column1_Handler.getCheckedRadioButtonId();
        radioTypeHouseButton =(RadioButton) findViewById(selectedTypeHouse1Id);
        radioTypeHouseValue = (String) radioTypeHouseButton.getText();

        // Radio toilet Option Value Fetching
        int selectedToilet1Id =radio_toilet_column1_Handler.getCheckedRadioButtonId();
        radioToiletButton =(RadioButton) findViewById(selectedToilet1Id);
        radioToiletValue = (String) radioToiletButton.getText();

        // Radio Drainage Option Value Fetching
        int selectedDrainage1Id =radio_drainage_column1_Handler.getCheckedRadioButtonId();
        radioDrainageButton =(RadioButton) findViewById(selectedDrainage1Id);
        radioDrainageValue = (String) radioDrainageButton.getText();

        // Radio waste DoorStep Option Value Fetching
        int selectedWastageId =waste_DoorStep_column1_Handler.getCheckedRadioButtonId();
        radioWastageButton =(RadioButton) findViewById(selectedWastageId);
        radioWastageValue = (String) radioWastageButton.getText();

        // Radio compost Option Value Fetching
        int selectedCompostId =radio_compost_Handler.getCheckedRadioButtonId();
        radioCompostButton =(RadioButton) findViewById(selectedCompostId);
        radioCompostValue = (String) radioCompostButton.getText();

        // Radio biogas  Option Value Fetching
        int selectedBiogasId =radio_biogas_column1_Handler.getCheckedRadioButtonId();
        radioBiogasButton =(RadioButton) findViewById(selectedBiogasId);
        radioBiogasValue = (String) radioBiogasButton.getText();

        annualIncomeValue = String.valueOf(annualIncome_Handler.getText());

        Log.i("final String" , "householdID:"+householdID+"household_HeadName:"+household_HeadName+"GenderValue:"+GenderValue);
        Log.i("final String 2","radioCategoryValue:"+radioCategoryValue);
       return "value"+"householdID:"+householdID+"household_HeadName:"+household_HeadName+"GenderValue:"+GenderValue;
    }
}
