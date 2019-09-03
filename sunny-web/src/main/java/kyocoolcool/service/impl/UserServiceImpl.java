package kyocoolcool.service.impl;

import kyocoolcool.dao.mapper.UserMapper;
import kyocoolcool.model.User;
import kyocoolcool.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-09-03 17:51
 * @Version 1.0
 **/

@Service
public class UserServiceImpl implements IUserService {


//    @Autowired
//    private UserMapper userMapper;
//
    @Override
    public void save(User user) {
        // TODO Auto-generated method stub
//        userMapper.save(user);
    }


}
