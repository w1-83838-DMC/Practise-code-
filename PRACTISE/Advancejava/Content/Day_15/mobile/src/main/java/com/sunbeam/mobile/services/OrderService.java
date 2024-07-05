package com.sunbeam.mobile.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.mobile.daos.MobileDao;
import com.sunbeam.mobile.daos.OrderDao;
import com.sunbeam.mobile.daos.UserDao;
import com.sunbeam.mobile.entities.Mobile;
import com.sunbeam.mobile.entities.Order;
import com.sunbeam.mobile.entities.User;

@Transactional
@Service
public class OrderService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MobileDao mobileDao;


    public Order placeOrder(int userId, int mobileId)
    {
        Optional<User> ou = userDao.findById(userId);
        Optional<Mobile> om = mobileDao.findById(mobileId);
        User u=ou.get();
        Mobile m=om.get();
        Order oq= new Order(0, u, m);
        Order dbo=orderDao.save(oq);
        return dbo;
        
    }


}
