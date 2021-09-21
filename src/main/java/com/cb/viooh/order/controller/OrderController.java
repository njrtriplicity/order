package com.cb.viooh.order.controller;

import com.cb.viooh.order.entity.Item;
import com.cb.viooh.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getItems() {
        List<Item> items = orderService.getAllArticles();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
