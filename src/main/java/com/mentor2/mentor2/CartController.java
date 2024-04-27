package com.mentor2.mentor2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @PostMapping
    public String createCart(int id){
        return "cart has been created";
    }
}
