package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {
    private Button map  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });
        return ;
    }
    private void openMap(){
        Uri uri = Uri.parse("geo:0, 0?q=hockey ground kasba bawada kolhapur");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }
    public void onscheme(View view)
    {
        Intent i = new Intent(index.this , scheme.class);
        startActivity(i);
    }

    public void onmess(View view)
    {
        Intent i = new Intent(index.this , mess.class);
        startActivity(i);
    }



    public void onbook(View view)
    {
        Intent i = new Intent(index.this , booking.class);
        startActivity(i);
    }

    public void card_btn(View view)
    {
        Intent it = new Intent(index.this , roomBooking.class);
        startActivity(it);
    }

}