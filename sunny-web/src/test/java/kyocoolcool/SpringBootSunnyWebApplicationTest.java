package kyocoolcool;

import kyocoolcool.domain.master.SysUser;
import kyocoolcool.domain.slave.User;
import kyocoolcool.service.SysUserService;
import kyocoolcool.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName SpringBootSunnyWebApplicationTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-09-03 21:55
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSunnyWebApplicationTest {
    @Test
    public void contextLoads() {
    }

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        List<SysUser> sysUsers = sysUserService.listUser();
        System.out.println("sysUsers:" + sysUsers.size());
        System.out.println(sysUsers);

		List<User> users = userService.listUser();
		System.out.println("users:" + users.size());
        System.out.println(users);
    }

    @Test
    public void transaction() {
//		SysUser sysUser = new SysUser();
//		sysUser.setUserId(1);
//		sysUser.setUserName("name-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getSecond());
//		sysUserService.update(sysUser);

        User user = new User();
        user.setUserId(6);
        user.setUserName("name-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getSecond());
        userService.update(user);
    }
}