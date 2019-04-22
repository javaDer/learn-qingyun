package cn.merryyou.security.controller;


import cn.merryyou.security.properties.OAuth2Properties;
import cn.merryyou.security.utils.JsonUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author jack
 */
@Slf4j
@Controller
public class LoginController {
    @Autowired
    private OAuth2Properties oAuth2Properties;
    @GetMapping("/userJwt")
    public Object getCurrentUserJwt(Authentication authentication, HttpServletRequest request) throws UnsupportedEncodingException {
        log.info("【SecurityOauth2Application】 getCurrentUserJwt authentication={}", JsonUtil.toJson(authentication));

        String header = request.getHeader("Authorization");
        String token = StringUtils.substringAfter(header, "bearer ");

        Claims claims = Jwts.parser().setSigningKey(oAuth2Properties.getJwtSigningKey().getBytes("UTF-8")).parseClaimsJws(token).getBody();
        String blog = (String) claims.get("blog");
        log.info("【SecurityOauth2Application】 getCurrentUser1 blog={}", blog);

        return authentication;
    }

    @GetMapping("/userRedis")
    @PreAuthorize("hasAnyAuthority('select')")
    public Object getCurrentUserRedis(Authentication authentication) {
        log.info("【SecurityOauth2Application】 getCurrentUserRedis authentication={}", JsonUtil.toJson(authentication));
        return authentication;
    }

}
