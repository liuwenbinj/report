package com.report.service;

import com.report.entity.pojo.QueryPojo;

import java.util.Map;

public interface IReport {
    Map<String,String> getReport1(QueryPojo queryPojo);
}
