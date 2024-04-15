package ntu.mssv63132461.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
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
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLand viewCreated = new ItemLand(vItem);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLand holder, int position) {
        LandSpace landSpaceHienThi = listData.get(position);

        String caption = landSpaceHienThi.getCaption();
        String tenAnh = landSpaceHienThi.getImage();
        holder.tvcaption.setText(caption);
            String packageName = holder.itemView.getContext().getPackageName();
            int imgID = holder.itemView.getResources().getIdentifier(tenAnh, "mipmap", packageName);
        holder.ivView.setImageResource(imgID);
    }

    @Override
    public int getItemCount() {
        return listData.size();
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
