package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DigitSumActivity extends AppCompatActivity {

    private TextView tvOutput;
    private EditText etNumber;
    private Button btnFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_sum);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        // Initialises the views and event listeners
        InitializeActivity();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeActivity() {
        tvOutput = (TextView) findViewById(R.id.Ausgabe_Quersumme);
        etNumber = (EditText) findViewById(R.id.Eingabefeld_Zahl);
        btnFire = (Button) findViewById(R.id.Start_Button);

                btnFire.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // Clear text view
                tvOutput.setText("");

                // Invoke calculation
                CalculateDigitSum();
            }
        });
    }
    private void CalculateDigitSum() {
        /*
         * a) Get entered number
         */
        int zahl = Integer.valueOf(etNumber.getText().toString());
        /*
         * b) Calculate digit sum
         *    (Hint: This can be done recursively using an additional function/method
         *    private int getDigitSum(int n))
         */

        /*
         * c) Print result
         */
        String output=new String();
        output+=getDigitSum(zahl);
        tvOutput.setText(output);
        }
    private int getDigitSum(int n)
    {
        String zahl = String.valueOf(n);
        int länge=zahl.length();
        int quersumme=0;
        String teilstring=new String();
        for(int i=länge;i>0;i--)
        {
            teilstring=zahl.substring(i-1,i);
            quersumme+=Integer.parseInt(teilstring);
        }
        return quersumme;
    }

}
