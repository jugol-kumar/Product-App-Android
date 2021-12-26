package com.seip.android.lt2b1product;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.seip.android.lt2b1product.adapter.ProductAdapter;
import com.seip.android.lt2b1product.databinding.FragmentHomeBinding;
import com.seip.android.lt2b1product.models.Product;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);

        binding.viewALlButton.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "All Product page", Toast.LENGTH_SHORT).show();
            Navigation.findNavController(v).navigate(R.id.to_all_product_action);
        });

        binding.myProductButton.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.to_my_product_action);
        });



        return  binding.getRoot();
    }
}