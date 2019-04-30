package com.t.testz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nim;
    EditText nama;
    Button button;
    RadioGroup jkRadioGroup;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan semua tampilan id
        findAllViewsId();

        button.setOnClickListener(this);
    }


    public void findAllViewsId(){

        button = (Button) findViewById(R.id.btnLan);
        nim = (EditText) findViewById(R.id.edtNim);
        nama = (EditText) findViewById(R.id.edtNama);
        jkRadioGroup = (RadioGroup) findViewById(R.id.jk);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        Bundle b = new Bundle();

        b.putString("nim", nim.getText().toString());
        b.putString("nama", nama.getText().toString());
        int id  = jkRadioGroup.getCheckedRadioButtonId();
        RadioButton radiobutton = (RadioButton) findViewById(id);
        b.putString("jk", radiobutton.getText().toString());

        intent.putExtras(b);

        startActivity(intent);
    }


}
