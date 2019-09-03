package kyocoolcool.model;

import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-09-03 17:01
 * @Version 1.0
 **/

public class User {


    private Long id;//主键

    private String name;//姓名

    private String phone;//手机号

    private String email;//电子邮件

    private String aboutme;//自我介绍

    private String passwd;//经过MD5加密的密码

    private String avatar;//头像图片

    private Integer type;//1:普通用户，2:房产经纪人

    private Date createTime;//创建时间

    private Integer enable;//是否启用,1启用，0停用

    private Long agencyId;//所属经纪机构

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }


}