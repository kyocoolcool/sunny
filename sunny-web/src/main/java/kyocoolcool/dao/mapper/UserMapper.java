package kyocoolcool.dao.mapper;

import kyocoolcool.model.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-09-03 17:02
 * @Version 1.0
 **/
@Resource(name="userMapper")
@Mapper
public interface UserMapper {

    /**
     * 保存
     */
    void save(User user);
}