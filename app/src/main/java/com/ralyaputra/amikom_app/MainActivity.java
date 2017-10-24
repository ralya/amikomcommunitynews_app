package com.ralyaputra.amikom_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText editText1 ,editText2; //Deklarasi object dari class EdiText
    String text1 ,text2; //Deklarasi object string
    String msg = "--Amikom App : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg, "The on Create() event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The on Start() event");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The on Resume() event");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The on Pause() event");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(msg, "The on Restart() event");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The on Stop() event");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The on Destroy() event");
    }

    public void loginMasuk(View view) {
        //Method onClick pada Button

        editText1 = (EditText)findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();

        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2
        if ((text1.contains("Username"))&&((text2.contains("Password")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

        else if ((text1.matches("")||text2.matches("")))
          /*
          Atau jika input text 1 dan text 2 kosong
           */
        {
            //Maka akan menampilkan pesan text toast
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

        }

        else {
            //jika kedua kondisi diatas tidak memenuhi

            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }

    }
}
