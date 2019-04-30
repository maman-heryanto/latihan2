package com.t.testz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();

        TextView nim = (TextView) findViewById(R.id.txtNim);
        TextView nama = (TextView) findViewById(R.id.txtNama);
        TextView jk = (TextView) findViewById(R.id.txtJk);

        nim.setText(b.getCharSequence("nim"));
        nama.setText(b.getCharSequence("nama"));
        jk.setText(b.getCharSequence("jk"));
    }
}
