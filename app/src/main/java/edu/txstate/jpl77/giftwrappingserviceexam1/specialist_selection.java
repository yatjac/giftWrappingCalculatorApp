package edu.txstate.jpl77.giftwrappingserviceexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class specialist_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialist_selection);

        final Spinner names = findViewById(R.id.specialistSpinner);
        Button findSpecialist = findViewById(R.id.selectSpecialistBtn);
        final TextView resultsSP = findViewById(R.id.selectedSpecialistTxtView);

        ///output
        String strSelection = names.getSelectedItem().toString();
        resultsSP.setText("The name you have selected:" + strSelection + ".");
        
    }
}