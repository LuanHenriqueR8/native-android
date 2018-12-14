package me.jogandoecodando.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void updateTextViewWithNameProductTyped(View view){
        TextView textView = findViewById(R.id.productNameTyped);
    }
}
