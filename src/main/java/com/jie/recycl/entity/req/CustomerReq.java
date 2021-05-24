package com.jie.recycl.entity.req;

import com.jie.recycl.entity.PageRequest;
import lombok.Data;

@Data
public class CustomerReq extends PageRequest {
    private Long id;
    private String name;
}
