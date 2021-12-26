package com.seip.android.lt2b1product.models;

import com.seip.android.lt2b1product.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
    private String productName;
    private String productPrice;
    private int productImage;

    private static List<Product> myProduct = new ArrayList<>();

    public Product(String productName, String productPrice, int productImage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productImage=" + productImage +
                '}';
    }

    public static List<Product> __getAllProducts(){
        List<Product> products = new ArrayList<>();

        products.add(new Product("Smart Watch", "BDT 3500", R.drawable.product1));
        products.add(new Product("Digital Camera", "BDT 3500", R.drawable.product2));
        products.add(new Product("Potato Fry", "BDT 3500", R.drawable.product3));
        products.add(new Product("Digital Camera", "BDT 3500", R.drawable.product2));
        products.add(new Product("Smart Watch", "BDT 3500", R.drawable.product1));
        products.add(new Product("Digital Camera", "BDT 3500", R.drawable.product2));
        products.add(new Product("Potato Fry", "BDT 3500", R.drawable.product3));
        products.add(new Product("Smart Watch", "BDT 3500", R.drawable.product1));
        products.add(new Product("Smart Watch", "BDT 3500", R.drawable.product1));
        products.add(new Product("Digital Camera", "BDT 3500", R.drawable.product2));
        products.add(new Product("Potato Fry", "BDT 3500", R.drawable.product3));
        products.add(new Product("Digital Camera", "BDT 3500", R.drawable.product2));
        products.add(new Product("Smart Watch", "BDT 3500", R.drawable.product1));
        products.add(new Product("Digital Camera", "BDT 3500", R.drawable.product2));
        products.add(new Product("Potato Fry", "BDT 3500", R.drawable.product3));
        products.add(new Product("Smart Watch", "BDT 3500", R.drawable.product1));


        return products;
    }

    public static void __setAllMyProducts(Product product){
        myProduct.add(product);
    }

    public static List<Product>__getAllMyProducts(){
        return myProduct;
    }

    public static void __removeMyProduct(Product product){
        myProduct.remove(product);
    }






}
