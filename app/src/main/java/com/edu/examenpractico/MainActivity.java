package com.edu.examenpractico;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCustomFirst;
    private EditText editTextCustomSecond;
    private TextView textViewCustomResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCustomFirst = findViewById(R.id.editTextCustomFirst);
        editTextCustomSecond = findViewById(R.id.editTextCustomSecond);
        textViewCustomResult = findViewById(R.id.textViewCustomResult);
    }

    public void customCalculateAverage(View view) {
        String customFirstPartialStr = editTextCustomFirst.getText().toString();
        String customSecondPartialStr = editTextCustomSecond.getText().toString();

        if (!customFirstPartialStr.isEmpty() && !customSecondPartialStr.isEmpty()) {
            double customFirstPartial = Double.parseDouble(customFirstPartialStr);
            double customSecondPartial = Double.parseDouble(customSecondPartialStr);

            double customAverage = (customFirstPartial + customSecondPartial) / 2;
            textViewCustomResult.setText("Promedio: " + customAverage);
        } else {
            textViewCustomResult.setText("Es obligatorio ingresar las calificaciones");
        }
    }
}
