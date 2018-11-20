package it.srmist.ubasurvey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FamilyMembersInfo extends AppCompatActivity {

    Button familyMember_btn_submit_Handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members_info);


        familyMember_btn_submit_Handler= (findViewById(R.id.familyMember_btn_submit));
        familyMember_btn_submit_Handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FamilyMembersInfo.this, GovernmentSchemeActivity.class);
                // Starts TargetActivity
                startActivity(i);
            }
        });
    }
}
