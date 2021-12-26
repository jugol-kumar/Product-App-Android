package com.seip.android.lt2b1product;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.seip.android.lt2b1product.adapter.MyProductAdapter;
import com.seip.android.lt2b1product.adapter.ProductAdapter;
import com.seip.android.lt2b1product.databinding.FragmentMyProductBinding;
import com.seip.android.lt2b1product.models.Product;

public class MyProduct extends Fragment {

    FragmentMyProductBinding binding;


    public MyProduct() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMyProductBinding.inflate(inflater);

            MyProductAdapter myProductAdapter = new MyProductAdapter(Product.__getAllMyProducts());
            GridLayoutManager gridLayoutManager= new GridLayoutManager(getContext(), 2);

            binding.myProductRV.setLayoutManager(gridLayoutManager);
            binding.myProductRV.setAdapter(myProductAdapter);


        return binding.getRoot();
    }
}