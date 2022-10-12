package hw.shopping_cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class CartForNewUser {



    List<CartProduct> cartProducts = new ArrayList<>();

    public List<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void addCartProducts(CartProduct cp) {
       cartProducts.add(cp);
    }


}
