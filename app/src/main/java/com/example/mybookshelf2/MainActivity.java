package com.example.mybookshelf2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    ImageView book_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking button to xml file
        btnAdd = findViewById(R.id.btnAdd);
        book_1 = findViewById(R.id.book_1);

        //onClick addbook
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddBook();
            }
        });
    }
    public void openAddBook() {
        Intent intent = new Intent(this, AddBook.class);
        startActivity(intent);
    }
}
