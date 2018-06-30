package com.founderbn.springcloud.web.controller;

import org.eclipse.jetty.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.founderbn.springcloud.base.ApiResponse;
import com.founderbn.springcloud.entities.DeptLevelInfo;
import com.founderbn.springcloud.service.DeptService;
import com.founderbn.springcloud.service.ServiceResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @program: microservicecloud
 * @description: 部门信息Controller
 * @author: YangMing
 * @create: 2018-06-16 23:02
 **/
@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/get")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public ApiResponse get(@RequestParam(value = "id") long deptId) {

        ServiceResult<DeptLevelInfo> result = deptService.get(deptId);
        if (result.getResult()==null){
            throw new NullPointerException("没有查询到部门信息");
        }

        return ApiResponse.ofSuccess(result);
    }
    public ApiResponse processHystrixGet(@RequestParam(value = "id") long deptId){

      return ApiResponse.ofMessage(HttpStatus.BAD_REQUEST_400,"参数不存在");
    }
}
