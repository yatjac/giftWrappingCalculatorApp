package edu.txstate.jpl77.giftwrappingserviceexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int intNumberOfItems;
    double dblFindThePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numberOfItems = findViewById(R.id.numberOfItemsNumberBox);
        RadioButton regularPackage = findViewById(R.id.regularServiceRadioBtn);
        RadioButton largePackage = findViewById(R.id.largeServiceRadioBtn);
        Button findPaymentButton = findViewById(R.id.findPaymentBtn);
        TextView findPaymentsTextView = findViewById(R.id.findPaymentMainTxtView);

        findPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String strNumberOfItems = numberOfItems.getText().toString();
                try {
                    intNumberOfItems = Integer.parseInt(strNumberOfItems);
                }
                catch (Exception ex) {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                    return;

                }

                //calculation
                if (regularPackage.isChecked()) {
                    dblFindThePrice = intNumberOfItems * 6.25;
                }else {
                    dblFindThePrice = intNumberOfItems * 10.50;
                }
                //output
                DecimalFormat finalCost = new DecimalFormat("###,###.##");
                findPaymentsTextView.setText(finalCost.format(dblFindThePrice));

                }
        });

    }
}