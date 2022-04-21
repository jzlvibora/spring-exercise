package com.test2.demo.controller;

import com.test2.demo.model.Customer;
import com.test2.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    CustomerRepository repo;

 //   @RequestMapping("/customer/home")

//    public String home(@RequestParam(name="id", required=false, defaultValue="World") Long id, Model model){
//        model.addAttribute("id",id);
//        //model.addAttribute("name",name);
//        return "home";
//    }
//
//    @RequestMapping("/customer/information")
//    public ModelAndView getCustomer(@RequestParam Long id) {
//        ModelAndView mv = new ModelAndView();
//        Customer entry = repo.findById(2L);
//        mv.addObject("entry",entry);
//        mv.setViewName("CustomerInfoDisplay.html");
//        return mv;
//    }

    @RequestMapping("/")
    public String home(){
        return "home.html";
    }
//
//
//    @RequestMapping("/customer/information")
//    public String customer(@RequestParam(name="id", required=false) Long id, Model model) {
////        model.addAttribute("name",customer.getFirstName());
////        model.addAttribute("lastName",customer.getLastName());
////        model.addAttribute("age",customer.getAge());
//        Customer customer = repo.findById(id);
//        model.addAttribute("name",customer.getFirstName());
//        model.addAttribute("name",customer.getLastName());
//        model.addAttribute("name",customer.getAge());
//        return "getCustomerInfo.html";
//
//    }
//
    @GetMapping("/customer")
    public String customer2(@RequestParam(name="id", required=false) Long id, Model model){
        model.addAttribute("customer", repo.findById(id));
        //return "reserve.html";
        return "getCustomerInfo.html";
    }

//    @RequestMapping("customer/information/{id}")
//    public String customerInfo(@PathVariable("id") Long id, Model model){
//        Customer c1 = repo.findById(id);
//    }
}
