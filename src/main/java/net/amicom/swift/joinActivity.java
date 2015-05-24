package net.amicom.swift;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class joinActivity extends Activity {


    EditText nameText;
    EditText idText;
    EditText pwText;
    EditText pw2Text;
    EditText emailText;

    Button joinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        nameText = (EditText) findViewById(R.id.nameJoinText);
        idText = (EditText) findViewById(R.id.idJoinText);
        pwText = (EditText) findViewById(R.id.pwJoinText);
        pw2Text = (EditText) findViewById(R.id.pw2JoinText);
        emailText = (EditText) findViewById(R.id.emailJoinText);

        joinButton = (Button) findViewById(R.id.joinButton);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();
                user.setName(nameText.getText().toString());
                user.setId(idText.getText().toString());
                user.setPassword(pwText.getText().toString());


                Log.d("Http Post Response:", "make user");

                SendThread send = new SendThread(user);
                send.start();

                Toast.makeText(joinActivity.this, "join transmit!", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }
}
