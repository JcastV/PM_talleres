package com.example.logintaller5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btnRegistro;
    ImageButton btnGoogle, btnFace, btnTwiter;
    String _urlG = "https://accounts.google.com";
    String _urlF = "https://www.facebook.com/";
    String _urlT = "https://twitter.com/";
    EditText editUser,editPass;
    TextView txtUser;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUser = (EditText) findViewById(R.id.editTextTextPersonName);
        editPass = (EditText) findViewById(R.id.editTextTextPassword);

        btnGoogle = findViewById(R.id.imageButtonGoogle);
        btnFace = findViewById(R.id.imageButtonFace);
        btnTwiter = findViewById(R.id.imageButtonTwiter);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_urlG);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_urlF);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });

        btnTwiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_urlT);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });

        btnRegistro = findViewById(R.id.button2);

            btnRegistro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                    leerWs();
                    }catch (Exception ex){
                        Toast.makeText(MainActivity.this, "Sin conexi??n a la base de datos", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    public void  sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        editUser = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editUser.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    private void leerWs(){
        String url = "http://10.0.2.2:9090/consultar/1";
        StringRequest getRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObjet = new JSONObject(response);
                    editUser.setText(jsonObjet.getString("user"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        Volley.newRequestQueue(this).add(getRequest);
    }

}