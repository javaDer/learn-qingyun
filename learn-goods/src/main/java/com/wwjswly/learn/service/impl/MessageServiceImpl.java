package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.entity.goods.Message;
import com.wwjswly.learn.mapper.MessageMapper;
import com.wwjswly.learn.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
