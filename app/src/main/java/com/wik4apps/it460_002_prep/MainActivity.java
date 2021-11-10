package com.wik4apps.it460_002_prep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.wik4apps.it460_002_prep.data.Books;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    Button btn;
    //private EditText et;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text_view_hello);
        sp = findViewById(R.id.spinner);
        btn = findViewById(R.id.btn_hello);
        btn.setOnClickListener(view -> {

        });
    }

    public void OnBtnClick(View view) {
        String topic = (String) sp.getSelectedItem();
        Books books = new Books();
        String [] bookTitles = books.BooksByTopic(topic);
        System.out.println(Arrays.toString(bookTitles));
        StringBuilder sb = new StringBuilder();
        for(String b : bookTitles) sb.append(b).append("\n");
        tv.setText(sb.toString());

//        String name = et.getText().toString();
//        tv.setText(String.format("%s %s", getString(R.string.hi_name), name));

    }
}