package com.meizhu.pms.report.config;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 类名称：UreportDataSource<br>
 * 类描述： TODO <br>
 * 创建时间：2020年01月04日 <br>
 *
 * @author 张兆发
 * @version 1.0.0
 */
@Configuration
@Slf4j
public class UreportDataSource implements BuildinDatasource {
    private static final String NAME = "Ureport";
    @Autowired
    private DataSource dataSource;

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            log.error("Ureport 数据源 获取连接失败！");
            e.printStackTrace();
        }
        return null;
    }
}
