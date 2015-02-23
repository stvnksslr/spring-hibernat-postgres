package com.crown.dao;

import java.util.List;

import com.crown.model.AcsOrder;

/**
 * Created by skessler on 2/23/15.
 */
public interface AcsOrderDAO {
    public void addAcsOrder(AcsOrder acsOrder);
    public void updateAcsOrder(AcsOrder acsOrder);
    public AcsOrder getAcsOrder(int id);
    public void deleteAcsOrder(int id);
    public List getAcsOrder();
}
