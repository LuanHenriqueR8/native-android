package me.jogandoecodando.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);
    }

    private Integer generateARandomNumber(){
        return new Random().nextInt(10);
    }

    public void updateResultLabel(View view){
        TextView textView = findViewById(R.id.resultLabel);
        Integer result = generateARandomNumber();
        textView.setText("The selected number was: " + result);
    }
}
