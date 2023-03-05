package com.example.springboot.WayNewApp.controller;


import com.example.springboot.TechBlogApp.model.Post;
import com.example.springboot.WayNewApp.model.Item;
import com.example.springboot.WayNewApp.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BasketController {

    @RequestMapping("/addItemsToBasket")
    public Integer addItemsToBasket(List<Item> items, Integer customerId){
        //

        // Creates new basket and returns a basket id associated with it

        // Creates an event - sent to SQS ( basked id , record )
    }
    public Integer mapCustomerIdToBasketId(Integer customerId){

    }

    public boolean updateBasket(List<Item> items){

        // Create new basket
    }

    public boolean deleteBasket(List<Item> items){

        // Create new basket
    }

    public List<Item> getItemsFromBasket(Basket){

        // Create new basket
    }
}
