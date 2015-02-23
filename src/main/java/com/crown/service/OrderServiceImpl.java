package com.crown.service;

import java.util.List;

import com.crown.model.AcsOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crown.dao.AcsOrderDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by skessler on 2/23/15.
 */

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private AcsOrderDAO acsOrderDAO;
    public void addAcsOrder(AcsOrder acsOrder) { acsOrderDAO.addAcsOrder(acsOrder); }
    public void updateAcsOrder(AcsOrder acsOrder) {acsOrderDAO.updateAcsOrder(acsOrder); }
    public AcsOrder getAcsOrder(int id) {return acsOrderDAO.getAcsOrder(id); }
    public void deleteAcsOrder(int id) {acsOrderDAO.deleteAcsOrder(id); }

    @Override
    public List<AcsOrder> getAcsorders() {
        return null;
    }

}
