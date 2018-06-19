package com.founderbn.springcloud.service;

import com.founderbn.springcloud.entities.DeptLevelInfo;

/**
 * @program: microservicecloud
 * @description:
 * @author: YangMing
 * @create: 2018-06-16 15:09
 **/
public interface DeptService {


    /**
     * 查询部门信息
      * @param deptId
     * @return
     */
   ServiceResult<DeptLevelInfo> get(Long deptId);
}
