package hw.shopping_cart.service;

import hw.shopping_cart.CartProduct;

import java.util.List;

public interface CartService {

    List<CartProduct> addToProduct(List<Integer> id);

    List<CartProduct> getAllProduct();


}
