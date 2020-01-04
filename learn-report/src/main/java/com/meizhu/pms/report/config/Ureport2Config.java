package com.meizhu.pms.report.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;

/**
 * 类名称：Ureport2Config<br>
 * 类描述： ureport配置 <br>
 * 创建时间：2020年01月04日 <br>
 *
 * @author 张兆发
 * @version 1.0.0
 */
@Configuration
@ImportResource("classpath:ureport-console-context.xml")
public class Ureport2Config {
    @Bean
    public ServletRegistrationBean<Servlet> ureport2Servlet() {
        return new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
    }
}
