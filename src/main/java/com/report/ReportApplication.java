package com.report.controller;

import com.report.entity.common.ReturnResult;
import com.report.entity.pojo.QueryPojo;
import com.report.mapper.ReportMapper;
import com.report.service.IReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: lwb
 * @CreateTime: 2023-02-07  10:05
 * @Description: 报表控制层
 * @Version: 1.0
 */
@RestController
@RequestMapping("report")
public class ReportController {

    @Autowired
    private IReport reportService;
    @Autowired
    private ReportMapper reportMapper;

    @RequestMapping("getReport1")
    public ReturnResult getReport1(QueryPojo queryPojo){
        //查询数据方法
        Map<String, String> report1 = reportService.getReport1(queryPojo);
//        Map<String, String> report1 = reportMapper.getReport1(queryPojo);
        return ReturnResult.success(report1, "success");
    }
}
