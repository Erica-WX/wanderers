package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.app.service.impl.BandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/band")
public class BandController {
    @Autowired
    private BandServiceImpl bandService;

    

}
