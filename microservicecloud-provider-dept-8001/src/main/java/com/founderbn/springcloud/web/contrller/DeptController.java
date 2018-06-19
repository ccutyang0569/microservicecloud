package com.founderbn.springcloud.web.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.founderbn.springcloud.base.ApiResponse;
import com.founderbn.springcloud.entities.DeptLevelInfo;
import com.founderbn.springcloud.service.DeptService;
import com.founderbn.springcloud.service.ServiceResult;

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
    public ApiResponse get(@RequestParam(value = "id") long deptId) {

        ServiceResult<DeptLevelInfo> result = deptService.get(deptId);

        return ApiResponse.ofSuccess(result);
    }
}
