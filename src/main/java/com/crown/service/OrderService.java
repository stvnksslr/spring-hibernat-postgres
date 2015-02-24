package com.crown.service;

import java.util.List;

import com.crown.model.AcsOrder;

/**
 * Created by skessler on 2/23/15.
 */
public interface OrderService {
    public void addAcsOrder(AcsOrder acsOrder);
    public void updateAcsOrder(AcsOrder acsOrder);
    public AcsOrder getAcsOrder(int id);
    public void deleteAcsOrder(int id);
    public List<AcsOrder> getAcsOrders();
}



