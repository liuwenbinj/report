package com.report.service.impl;

import com.report.entity.pojo.QueryPojo;
import com.report.mapper.ReportMapper;
import com.report.service.IReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: lwb
 * @CreateTime: 2023-02-08  10:09
 * @Description: 报表业务类
 * @Version: 1.0
 */
@Service
public class ReportService implements IReport {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public Map<String, String> getReport1(QueryPojo queryPojo) {
        return reportMapper.getReport1(queryPojo);
    }
}
