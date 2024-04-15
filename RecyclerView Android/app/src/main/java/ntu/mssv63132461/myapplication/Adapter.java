package ntu.mssv63132461.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemLand> {
    Context context;
    ArrayList<LandSpace> listData;

    public Adapter(Context context, ArrayList<LandSpace> listData) {
        this.context = context;
        this.listData = listData;
    }
    
    @NonNull
    @Override
    public ItemLand onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLand holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemLand extends RecyclerView.ViewHolder{
        TextView tvcaption;
        ImageView ivView;

        public ItemLand(@NonNull View itemView) {
            super(itemView);
            tvcaption = itemView.findViewById(R.id.tvcaption);
            ivView = itemView.findViewById(R.id.imageView);
        }
    }
}
