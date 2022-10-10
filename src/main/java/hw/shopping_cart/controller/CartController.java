package hw.shopping_cart.controller;

import hw.shopping_cart.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    public final CartService cartService;


    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Object test() {
        return "OK";
    }

    @GetMapping(path = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Object addToCart(@RequestParam(value="id") List<Integer> id) {
        return cartService.addToProduct(id);
    }
    @GetMapping(path = "/get")
    @ResponseStatus(HttpStatus.OK)
    public Object getAllProduct() {
        return cartService.getAllProduct();
    }

}
