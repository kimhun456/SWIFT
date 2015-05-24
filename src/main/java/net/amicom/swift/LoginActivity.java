package net.amicom.swift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends Activity {


    EditText loginText;
    EditText pwText;

    Button loginButton;
    Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginText = (EditText) findViewById(R.id.idEditText);
        pwText = (EditText) findViewById(R.id.pwEditText);
        loginButton = (Button) findViewById(R.id.loginButton);
        signupButton = (Button) findViewById(R.id.signupButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();
                user.setId(loginText.getText().toString());
                user.setPassword(pwText.getText().toString());

                // makePostRequest(user);


                Intent intent = new Intent(getApplicationContext(), ContainerActivity.class);
                startActivity(intent);

            }
        });


        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), joinActivity.class);
                startActivity(intent);
            }
        });


    }


}
