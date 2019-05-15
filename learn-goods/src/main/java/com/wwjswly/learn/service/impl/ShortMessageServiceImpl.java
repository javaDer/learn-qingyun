package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.entity.goods.ShortMessage;
import com.wwjswly.learn.mapper.ShortMessageMapper;
import com.wwjswly.learn.service.ShortMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信验证码 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@Service
public class ShortMessageServiceImpl extends ServiceImpl<ShortMessageMapper, ShortMessage> implements ShortMessageService {

}
