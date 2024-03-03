package com.codenj.shortlink.admin.service.impl;

import com.codenj.shortlink.admin.dao.entity.UserDO;
import com.codenj.shortlink.admin.dao.mapper.UserMapper;
import com.codenj.shortlink.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Codenj
 * @since 2024-03-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
