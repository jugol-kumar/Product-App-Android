package com.seip.android.lt2b1product;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seip.android.lt2b1product.adapter.ProductAdapter;
import com.seip.android.lt2b1product.databinding.FragmentAllProductBinding;
import com.seip.android.lt2b1product.models.Product;

public class AllProduct extends Fragment {
    FragmentAllProductBinding binding;
    public AllProduct() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAllProductBinding.inflate(inflater);

        ProductAdapter productAdapter = new ProductAdapter(Product.__getAllProducts());
        GridLayoutManager gridLayoutManager= new GridLayoutManager(getContext(), 2);

        binding.productListRV.setAdapter(productAdapter);
        binding.productListRV.setLayoutManager(gridLayoutManager);

        return binding.getRoot();

//        return inflater.inflate(R.layout.fragment_all_product, container, false);
    }
}