package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class roomBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_booking);

        Button bts = findViewById(R.id.R_bedone);
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(roomBooking.this, "Booked Sucessfully", Toast.LENGTH_SHORT).show();
            }
        });

        Button btss = findViewById(R.id.R_bedtwo);
        btss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(roomBooking.this, "Booked Sucessfully", Toast.LENGTH_SHORT).show();
            }
        });
        Button btss44 = findViewById(R.id.book);
        btss44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(roomBooking.this , gpay.class);
                startActivity(i);
                Toast.makeText(roomBooking.this, "Booked Sucessfully", Toast.LENGTH_SHORT).show();
            }
        });

        Button btsss = findViewById(R.id. R_bedthree);
        btsss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(roomBooking.this, "Booked Sucessfully", Toast.LENGTH_SHORT).show();
            }
        });





    }
}