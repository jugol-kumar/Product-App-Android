package com.seip.android.lt2b1product.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seip.android.lt2b1product.databinding.ProductCardBinding;
import com.seip.android.lt2b1product.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    List<Product>productList;

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProductCardBinding binding = ProductCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ProductViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.bind(product);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        ProductCardBinding binding;
        public ProductViewHolder(@NonNull ProductCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Product product) {
            binding.productName.setText(product.getProductName());
            binding.productImageIV.setImageResource(product.getProductImage());
            binding.productPrice.setText(product.getProductPrice());

            binding.buyBUtton.setOnClickListener(v -> {
                Product.__setAllMyProducts(product);

//                List<Product> myProductList = new ArrayList<>();
//                Product.__setAllMyProducts();
//                Product.__getAllMyProducts().add(new Product(product.getProductName(), product.getProductPrice(), product.getProductImage()));
                Toast.makeText(v.getContext(), product.getProductName()+"Buy Done", Toast.LENGTH_SHORT).show();
            });
        }
    }


}
