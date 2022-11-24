package com.example.hostelers;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<Contact_model>arrContacts;
    RecyclerContactAdapter(Context context, ArrayList<Contact_model>arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact_model model = (Contact_model) arrContacts.get(position);
        holder.hostel_image.setImageResource(model.img);
        holder.hostel_name.setText(arrContacts.get(position).name);
        holder.hostel_location.setText(arrContacts.get(position).location);
        holder.row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_add_update_lay);

                EditText hostel_name = dialog.findViewById(R.id.hostel_name);
                EditText hostel_location = dialog.findViewById(R.id.hostel_location);
                Button btnAction = dialog.findViewById(R.id.btnAction);


            }
        });
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView hostel_name, hostel_location;
        ImageView hostel_image;
        LinearLayout row;

        public ViewHolder(View itemView){
            super(itemView);

            hostel_name = itemView.findViewById(R.id.hostel_name);
            hostel_location = itemView.findViewById(R.id.hostel_location);
            hostel_image = itemView.findViewById(R.id.hostel_image);
            row= itemView.findViewById(R.id.row);
        }

    }

}
