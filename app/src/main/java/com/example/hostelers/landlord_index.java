package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class landlord_index extends AppCompatActivity {
    RecyclerView recyclerView ;
    RecyclerContactAdapter adapter;
    FloatingActionButton btnOpenDialog;

    ArrayList<Contact_model> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_index);

        recyclerView = findViewById(R.id.recyclerContact);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnOpenDialog.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Dialog dialog = new Dialog(landlord_index.this);
                dialog.setContentView(R.layout.activity_add_update_lay);

                EditText edt_name = dialog.findViewById(R.id.edt_name);
                EditText edt_location = dialog.findViewById(R.id.edt_location);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = "" , location = "";
                        if(!edt_name.getText().toString().equals("")){
                             name = edt_name.getText().toString();
                        }else{

                            Toast.makeText(landlord_index.this,"please enetr hostel name ",Toast.LENGTH_SHORT);
                        }
                        if(!edt_location.getText().toString().equals("")){

                            location = edt_location.getText().toString();
                        } else {

                            Toast.makeText(landlord_index.this,"please enetr hostel location ",Toast.LENGTH_SHORT);

                        }
                        arrContacts.add(new Contact_model(R.drawable.haval,name,location));

                        adapter.notifyItemChanged(arrContacts.size()-1);

                        recyclerView.scrollToPosition(arrContacts.size()-1);

                        dialog.dismiss();

                    }


                });

                dialog.show();

            }
        });


        arrContacts.add(new Contact_model(R.drawable.haval,"Swapnpurti Hostel | Kolhapur","Nearer to Hockey ground kolhapur"));
        arrContacts.add(new Contact_model(R.drawable.h2,"Mountain hostel | Kolhapur","5 km from city center"));
        arrContacts.add(new Contact_model(R.drawable.h3,"Chhichhore hostel | Kolhapur","kasba bawada"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerContactAdapter(this,arrContacts);
        
        recyclerView.setAdapter(adapter);
    }
}