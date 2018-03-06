package com.imooc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_user")
@NoArgsConstructor
@AllArgsConstructor
//@DynamicInsert
//@DynamicUpdate
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
    private Integer gender;
    private Long phone;
    private String email;
    private Date createTime;
    private Date updateTime;

    public User(String userName, Integer gender, Long phone, String email, Date createTime) {
        this.userName = userName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.createTime = createTime;
    }
}
