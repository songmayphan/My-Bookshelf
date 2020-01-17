package com.example.mybookshelf2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddBook extends AppCompatActivity {

    Button btnSubmit;
    EditText etName;
    EditText etAuthor;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        //Book name field
        etName = findViewById(R.id.etName);
        //Author name field
        etAuthor = findViewById(R.id.etAuthor);
        //Submit button
        btnSubmit = findViewById(R.id.btnSubmit);
        //Displaying
        tvDisplay = findViewById(R.id.tvDisplay);
        //HIDE tv results from screen
        tvDisplay.setVisibility(View.GONE);
        //What happens when click submit

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookName = etName.getText().toString().trim();
                String authorName = etAuthor.getText().toString().trim();
                String text = " Looking for " + getString(R.string.bookName)+" "+ bookName + " " + getString(R.string.authorName) +authorName+"...\n";
                tvDisplay.setText(text);
            //REVEAL  results
                tvDisplay.setVisibility(View.VISIBLE);
            }
        });
    }
}
