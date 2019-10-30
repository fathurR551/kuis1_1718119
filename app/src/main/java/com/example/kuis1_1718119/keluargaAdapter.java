package com.example.kuis1_1718119;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class keluargaAdapter extends RecyclerView.Adapter<keluargaAdapter.keluargaViewHolder> {

    private ArrayList<keluarga> dataList;

    public keluargaAdapter(ArrayList<keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public keluargaAdapter.keluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new keluargaViewHolder(view);
    }

    public void onBindViewHolder(keluargaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class keluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStatus;
        private ImageView srcGambar;


        public keluargaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtStatus = (TextView) itemView.findViewById(R.id. txt_status);
            srcGambar = (ImageView) itemView.findViewById(R.id.gambar);

        }
    }
}
