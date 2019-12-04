package br.senac.go.projetointegrador_2_semestre_2019.source;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.senac.go.projetointegrador_2_semestre_2019.R;
import br.senac.go.projetointegrador_2_semestre_2019.model.Veiculos;

public class VeiculoAdapter extends RecyclerView.Adapter<VeiculoAdapter.VeiculoViewHolder> {


        private List<Veiculos> dataList;

        public VeiculoAdapter(List<Veiculos> dataList){

            this.dataList = dataList;
        }

        class VeiculoViewHolder extends RecyclerView.ViewHolder {

            public final View myView;

            TextView textVeiculo;

            VeiculoViewHolder(View itemView) {
                super(itemView);
                myView = itemView;

                textVeiculo = myView.findViewById(R.id.tx_veiculo);

            }
        }

        @Override

        public VeiculoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
            return new VeiculoViewHolder(view);
        }

        @Override

        public void onBindViewHolder(VeiculoViewHolder holder, int position) {
            holder.textVeiculo.setText(dataList.get(position).getPlaca());

        }


        @Override
        public int getItemCount() {
            return dataList.size();
        }
    }