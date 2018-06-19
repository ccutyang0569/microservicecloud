package com.founderbn.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: microservicecloud
 * @description: 部门信息DO类
 * @author: YangMing
 * @create: 2018-06-15 16:36
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DeptLevelInfo implements Serializable {

    private Long id;

    private String depName;

    private String depId;

    private String parentId;

    private Long level;



}
