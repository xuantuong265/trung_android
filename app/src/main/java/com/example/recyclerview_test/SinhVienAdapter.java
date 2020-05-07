package com.example.recyclerview_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.ViewHolder> {
    private Context context;
    private ArrayList<SinhVien> sinhVienList;

    public SinhVienAdapter(Context context, ArrayList<SinhVien> sinhVienList) {
        this.context = context;
        this.sinhVienList = sinhVienList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);
        View SinhVienView = inflater.inflate(R.layout.dong_sinh_vien, parent, false);
        ViewHolder viewHolder = new ViewHolder(SinhVienView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SinhVien sv = sinhVienList.get(position);
        holder.txtName.setText(sv.getName());
        holder.txtNamSinh.setText(String.valueOf(sv.getNamSinh()));
        holder.txtDiaChi.setText(sv.getDiaChi());


    }


    @Override
    public int getItemCount() {
        return sinhVienList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName,txtDiaChi, txtNamSinh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.textviewName);
            txtNamSinh = (TextView) itemView.findViewById(R.id.textviewNamSinh);
            txtDiaChi = (TextView) itemView.findViewById(R.id.textviewDiaChi);
        }
    }
}
