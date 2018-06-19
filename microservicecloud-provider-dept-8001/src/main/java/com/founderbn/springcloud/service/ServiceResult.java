package com.founderbn.springcloud.service;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: microservicecloud
 * @description: Service返回结果（单体）
 * @author: YangMing
 * @create: 2018-06-16 22:36
 **/
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class ServiceResult<T> {

    private boolean success;
    private String message;
    private T result;

    public ServiceResult(boolean success) {
        this.success = success;

    }

    public ServiceResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ServiceResult(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }


}
