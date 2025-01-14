package com.mobile.service;

import com.mobile.entity.Mobile;
import com.mobile.repository.RefurbishedMobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefurbishedMobileService {

    @Autowired
    private RefurbishedMobileRepository refurbishedMobileRepository;

    public void insertNewMobile(Mobile mobile){
        refurbishedMobileRepository.save(mobile);
    }


    public List<Mobile> getRefurbishedMobiles(){
      return  refurbishedMobileRepository.findAll();
    }

}
