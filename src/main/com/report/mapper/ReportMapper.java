package com.report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.report.entity.pojo.QueryPojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface ReportMapper extends BaseMapper<ReportMapper> {

    /**
     * 查询报表
     * @param queryPojo 查询条件参数类
     * @return
     */
    Map<String,String> getReport1(@Param("queryPojo") QueryPojo queryPojo);
}
