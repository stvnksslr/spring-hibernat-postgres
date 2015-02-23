package com.crown.dao;

import java.util.List;

import com.crown.model.AcsOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by skessler on 2/23/15.
 */
@Repository
public class AcsOrderDAOImpl implements AcsOrderDAO {
    @Autowired
    private SessionFactory sessionFactory;
    private Session getCurrentSession() {return sessionFactory.getCurrentSession(); }
    public void addAcsOrder(AcsOrder acsOrder) {getCurrentSession().save(acsOrder); }
    public void updateAcsOrder(AcsOrder acsOrder) {
        AcsOrder acsOrderToUpdate = getAcsOrder(acsOrder.getId());
        acsOrderToUpdate.setOrderdata(acsOrder.getOrderdata());
//        acsOrderToUpdate.setDateprocessed(acsOrder.getDateprocessed());

        getCurrentSession().update(acsOrderToUpdate);
    }

    public AcsOrder getAcsOrder(int id) {
        AcsOrder acsOrder = (AcsOrder) getCurrentSession().get(AcsOrder.class, id);
        return acsOrder;
    }

    public void deleteAcsOrder(int id) {
        AcsOrder acsOrder = getAcsOrder(id);
        if (acsOrder != null)
            getCurrentSession().delete(acsOrder);
    }


    public List<AcsOrder> getAcsOrder() { return getCurrentSession().createQuery("from acsorders").list(); }
}
