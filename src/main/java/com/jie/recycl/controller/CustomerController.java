package com.jie.recycl.controller;


import com.jie.recycl.entity.RespPage;
import com.jie.recycl.entity.ResponseObj;
import com.jie.recycl.entity.po.Customer;
import com.jie.recycl.entity.req.CustomerReq;
import com.jie.recycl.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jie
 * @since 2021-05-20
 */
@Slf4j
@Api(tags = "用户管理")
@RestController
@RequestMapping("/admin/customer")
@RefreshScope
public class CustomerController {

    @Value("${merber.name:}")
    private String merberName;

    @Value("${merber.age:}")
    private Integer merberAge;

    @Autowired
    private CustomerService customerService;

    @ApiOperation("查询(vue)")
    @PostMapping("/query")
    public ResponseObj<RespPage<List<Customer>>> customerQuery(@Valid @RequestBody CustomerReq customerReq) {
        log.info("merberName is " + merberName + " merberAge is " + merberAge);
        return customerService.customerQuery(customerReq);
    }
}

