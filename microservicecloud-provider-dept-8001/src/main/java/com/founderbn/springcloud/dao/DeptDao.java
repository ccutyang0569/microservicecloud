package com.founderbn.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.founderbn.springcloud.entities.DeptLevelInfo;

/**
 * @program: microservicecloud
 * @description:
 * @author: yangming
 * @create: 2018-06-15 17:32
 **/

@Mapper
public interface DeptDao {
    /**
     * 根据部门id，查询信息
     * @param id
     * @return
     */
    DeptLevelInfo findOne(Long id);
}
