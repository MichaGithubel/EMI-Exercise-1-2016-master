package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static de.davidgollasch.emiexercise1.R.id.buttonFire;
import static de.davidgollasch.emiexercise1.R.id.cancel_action;
import static de.davidgollasch.emiexercise1.R.id.textViewFibonacci;

public class FibonacciActivity extends AppCompatActivity {

    private TextView tvOutput;
    private Button btnFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        InitializeActivity();
    }

    private void InitializeActivity() {
        tvOutput = (TextView) findViewById(textViewFibonacci);
        btnFire = (Button) findViewById(buttonFire);

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear text view
                tvOutput.setText("");

                // Invoke calculation
                CalculateFibonacciRow();
            }
        });
    }

    /**
     * This method has to be filled...
     */
    private void CalculateFibonacciRow() {
        String output = "";
        int a=0; //#1
        int b=1; //#2
        int c;
        output = a+", "+b+", ";
        for(int i=0;i<27;i++)
        {
            c=b;
            b=a+b;
            a=c;
            output+=b+", ";
        }
            tvOutput.setText(output);
    }
}
