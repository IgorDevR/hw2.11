package hw.shopping_cart.service;

import hw.shopping_cart.CartProduct;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class CartServiceImpl implements CartService {

    public List<CartProduct> cartProducts = new ArrayList<>();

    @Override
    public List<CartProduct> addToProduct(List<Integer> idList) {

        for(Integer id: idList){
            CartProduct cp = new CartProduct(id);
            cartProducts.add(cp);
        }
        return cartProducts;
    }

    @Override
    public List<CartProduct> getAllProduct() {
        return cartProducts;
    }
}
