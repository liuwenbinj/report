package com.report.service;

import com.report.entity.pojo.QueryPojo;

import java.util.Map;

public interface IReport {
    
    /**
     * 查询报表1
     * @param queryPojo 查询条件参数
     * @return
     */
    Map<String,String> getReport1(QueryPojo queryPojo);
}
