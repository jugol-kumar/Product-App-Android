package com.seip.android.lt2b1product.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seip.android.lt2b1product.databinding.MyProductBinding;
import com.seip.android.lt2b1product.models.Product;

import java.util.List;

public class MyProductAdapter extends RecyclerView.Adapter<MyProductAdapter.MyProductHolder> {

    private List<Product> myProducts;

    public MyProductAdapter(List<Product> myProducts) {
        this.myProducts = myProducts;
    }

    @NonNull
    @Override
    public MyProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyProductBinding binding = MyProductBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return  new MyProductHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyProductHolder holder, int position) {
        Product product = myProducts.get(position);
        holder.bind(product);
    }

    @Override
    public int getItemCount() {
        return myProducts.size();
    }

    public class MyProductHolder extends RecyclerView.ViewHolder{
        MyProductBinding binding;
        public MyProductHolder(@NonNull MyProductBinding binding) {
            super(binding.getRoot());
            this.binding =  binding;

        }

        public void bind(Product product) {
            binding.sellButton.setOnClickListener(v -> {
                Product.__removeMyProduct(product);
                Toast.makeText(v.getContext(), "removed", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
