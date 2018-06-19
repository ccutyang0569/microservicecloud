package com.founderbn.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.founderbn.springcloud.dao.DeptDao;
import com.founderbn.springcloud.entities.DeptLevelInfo;
import com.founderbn.springcloud.service.DeptService;
import com.founderbn.springcloud.service.ServiceResult;

/**
 * @program: microservicecloud
 * @description:
 * @author: YangMing
 * @create: 2018-06-16 15:12
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public ServiceResult<DeptLevelInfo> get(Long deptId) {
        DeptLevelInfo deptInfo = deptDao.findOne(deptId);
        if (deptInfo == null) {
            return new ServiceResult<>(false, "NOT FOUND", null);
        }
        return new ServiceResult<>(true, null, deptInfo);
    }
}
