package com.windows3.service.impl;

import com.windows3.dao.TCustInfoDao;
import com.windows3.po.TCustInfo;
import com.windows3.service.TCustInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 3 on 2018/9/30.
 */
@Service(value = "tCustInfoService")
public class TCustInfoServiceImpl implements TCustInfoService {
@Autowired
private TCustInfoDao dao;
    @Override
    public TCustInfo login(TCustInfo custInfo) {
        return dao.login(custInfo);
    }
}
