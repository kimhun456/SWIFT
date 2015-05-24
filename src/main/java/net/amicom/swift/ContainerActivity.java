package net.amicom.swift;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

import ar.com.daidalos.afiledialog.FileChooserDialog;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardGridArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardGridView;

public class ContainerActivity extends Activity {

    TextView userName;
    Button uploadButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        userName = (TextView) findViewById(R.id.usernameText);
        uploadButton = (Button) findViewById(R.id.uploadButton);


        //asdf


        Container container = new Container();
        container.setName("Hyun Jae");
        userName.setText(container.getName());
        ArrayList<Obj> objlist = new ArrayList<Obj>();

        for (int i = 0; i < 10; i++) {
            Obj o = new Obj();
            o.setBytes(i * 10);
            o.setLast_modified("date : " + i);
            o.setName("User " + i);
            objlist.add(o);
        }

        //asdf


        container.setObjectList(objlist);

        ArrayList<Card> cards = new ArrayList<Card>();

        for (final Obj object : container.getObjectList()) {

            Card card = new Card(ContainerActivity.this);

            card.setOnClickListener(new Card.OnCardClickListener() {
                @Override
                public void onClick(Card card, View view) {

                    Toast.makeText(ContainerActivity.this,
                            "bytes = " + object.getBytes() + "last-modified " + object.getLast_modified(), Toast.LENGTH_SHORT).show();

                }
            });


            CardHeader header = new CardHeader(ContainerActivity.this);
            header.setTitle(object.getName());

            //Add Header to card
            card.addCardHeader(header);

            cards.add(card);


        }

        CardGridArrayAdapter mCardArrayAdapter = new CardGridArrayAdapter(ContainerActivity.this, cards);

        CardGridView gridView = (CardGridView) ContainerActivity.this.findViewById(R.id.myGrid);
        if (gridView != null) {
            gridView.setAdapter(mCardArrayAdapter);
        }


        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FileChooserDialog dialog = new FileChooserDialog(ContainerActivity.this);
                dialog.addListener(new FileChooserDialog.OnFileSelectedListener() {
                    @Override
                    public void onFileSelected(Dialog source, File file) {
                        Toast toast = Toast.makeText(ContainerActivity.this, "File selected: " + file.getName(), Toast.LENGTH_LONG);
                        toast.show();
                    }

                    @Override
                    public void onFileSelected(Dialog source, File folder, String name) {
                        Toast toast = Toast.makeText(ContainerActivity.this, "File selected: " + folder.getName(), Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                dialog.show();


                /*
                Intent intent = new Intent(getApplicationContext(), FileChooserActivity.class);
                startActivity(intent);
                */
            }
        });
    }
}
