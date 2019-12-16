package com.yilianjiaju.ymall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 4434165202616249320L;

    @Id
    @Column
    private Long id;

    @Column
    private Date gmtCreate;

    @Column
    private Date gmtodify;

    @Column
    private Long userId;

    @Column
    private String userName;

    @Column
    private String phone;

}
