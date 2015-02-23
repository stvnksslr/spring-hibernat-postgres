package com.crown.controller;

import java.util.List;

import com.crown.model.AcsOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crown.service.OrderService;


/**
 * Created by skessler on 2/23/15.
 */

@Controller
@RequestMapping(value="/order")
public class AcsController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/add", method=RequestMethod.GET)
    public ModelAndView addAcsOrderPage() {
        ModelAndView modelAndView = new ModelAndView("add-order-form");
        modelAndView.addObject("acsorder", new AcsOrder());
        return modelAndView;
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public ModelAndView addingAcsOrder(@ModelAttribute AcsOrder acsOrder) {
        ModelAndView modelAndView = new ModelAndView("home");
        orderService.addAcsOrder(acsOrder);
        String message = "Order was successfully added.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value="/list")
    public ModelAndView listOfOrders() {
        ModelAndView modelAndView = new ModelAndView("list-of-orders");
        List<AcsOrder> acsOrders = orderService.getAcsorders();
        modelAndView.addObject("acsorders", acsOrders);
        return modelAndView;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editAcsOrderPage(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit-order-form");
        AcsOrder acsOrder = orderService.getAcsOrder(id);
        modelAndView.addObject("acsorder", acsOrder);
        return modelAndView;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
    public ModelAndView edditingAcsOrder(@ModelAttribute AcsOrder acsOrder, @PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("home");
        orderService.updateAcsOrder(acsOrder);
        String message = "Order was successfully edited.";
        modelAndView.addObject("message", message);

        return modelAndView;
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public ModelAndView deleteAcsOrder(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("home");
        orderService.deleteAcsOrder(id);
        String message = "Order was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

}
