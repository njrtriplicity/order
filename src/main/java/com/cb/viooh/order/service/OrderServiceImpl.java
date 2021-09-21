package com.cb.viooh.order.service;

import com.cb.viooh.order.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Item> getAllArticles() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> requestHttpEntity = new HttpEntity<>(httpHeaders);
        String requestUrl = "http://item-service/items";
        ResponseEntity<List<Item>> response = restTemplate.exchange(requestUrl, HttpMethod.GET, requestHttpEntity, new ParameterizedTypeReference<List<Item>>() {});
        return response.getBody();
    }
}
