package hw.shopping_cart.service;

import hw.shopping_cart.CartForNewUser;
import hw.shopping_cart.CartProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final CartForNewUser cartForNewUser;

    public CartServiceImpl(CartForNewUser cartForNewUser) {
        this.cartForNewUser = cartForNewUser;
    }


    @Override
    public List<CartProduct>  addToProduct(List<Integer> idList) {

        for(Integer id: idList){
            CartProduct cartProduct = new CartProduct(id);
            cartForNewUser.addCartProducts(cartProduct);
        }
        return cartForNewUser.getCartProducts();
    }

    @Override
    public List<CartProduct> getAllProduct() {
        return cartForNewUser.getCartProducts();
    }
}
