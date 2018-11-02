package com.windows3.controller;

import com.windows3.po.TCustInfo;
import com.windows3.service.TCustInfoService;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 3 on 2018/9/30.
 */
@Controller
@RequestMapping(value = "/tCustInfo")
public class TCustInfoController {
    @Autowired
    private TCustInfoService tCustInfoService;

    @RequestMapping(value = "/tCustInfo.login")
    public String login(TCustInfo custInfo){
        TCustInfo info = tCustInfoService.login(custInfo);
        if (info !=null){
            return "cust/su";
        }else {
            return "cust/edd";
        }
    }

    @RequestMapping(value = "/index.index")
    public String index(){
        // TODO 需修复
        return "cust/login";
    }

}
