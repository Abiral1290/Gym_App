package com.example.abiral.xampp.functions;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.abiral.xampp.R;
import com.example.abiral.xampp.data.model.Product;

import java.util.HashMap;
import java.util.List;


/**
 * Created by Abiral on 4/4/2019.
 */
/* Recycler.Viewholder */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    private Context mctx;
    private List<Product> productList;
    private HashMap<String, String> map;


    public ProductAdapter(Context mctx, List<Product> productList) {
        this.mctx = mctx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mctx);
        View view = inflater.inflate(R.layout.layout_product_workouts, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, final int position) {
        Product product = productList.get(position);


        holder.imageView.setImageDrawable(mctx.getResources().getDrawable((product.getImageView())));
        holder.txt1.setText(productList.get(position).getTitle());
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(mctx, VideoView.class);
               intent.putExtra("identifier", map.get(position));
               mctx.startActivity(intent);

           }
       });


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txt1;
        CardView cardView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);

            txt1 = (TextView) itemView.findViewById(R.id.txt1);

        }
    }
    public void setVideo(final Context c, final String videoUrl){
    }
}
