package com.mobile.controller;

import com.mobile.entity.Mobile;
import com.mobile.service.RefurbishedMobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobile")
@CrossOrigin(origins = "*")
public class RefurbishedMobileController {

    @Autowired
    private RefurbishedMobileService refurbishedMobileService;

    @PostMapping(path = "/add-mobile")
    public Mobile addMobileDetails(@RequestBody Mobile mobile) {
        System.out.println("from RefurbishedMobileController,addMobileDetails");
        System.out.println(mobile);
        refurbishedMobileService.insertNewMobile(mobile);
        return mobile;
    }

    @GetMapping(path = "/getRefurbishedMobiles")
    public List<Mobile> getAllMobiles() {

       return refurbishedMobileService.getRefurbishedMobiles();

    }
}
