package com.example.equiposfutbol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {
    private List<Equipo> listaEquipos;

    public EquipoAdapter(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    @NonNull
    @Override
    public EquipoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_equipo, parent, false);
        return new EquipoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipoViewHolder holder, int position) {
        Equipo equipo = listaEquipos.get(position);
        holder.txtNombreEquipo.setText(equipo.getNombre());
        holder.imgEquipo.setImageResource(equipo.getLogo());
    }

    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

    static class EquipoViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombreEquipo;
        ImageView imgEquipo;

        public EquipoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreEquipo = itemView.findViewById(R.id.txtNombreEquipo);
            imgEquipo = itemView.findViewById(R.id.imgEquipo);
        }
    }
}
