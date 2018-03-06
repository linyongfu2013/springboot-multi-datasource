//package com.imooc.entity.test;
//
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * @author
// */
//public class User implements Serializable {
//    private Long userId;
//
//    private String userName;
//
//    private Byte gender;
//
//    private Long phone;
//
//    private String email;
//
//    private Date createTime;
//
//    private Date updateTime;
//
//    private static final long serialVersionUID = 1L;
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public Byte getGender() {
//        return gender;
//    }
//
//    public void setGender(Byte gender) {
//        this.gender = gender;
//    }
//
//    public Long getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Long phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    @Override
//    public boolean equals(Object that) {
//        if (this == that) {
//            return true;
//        }
//        if (that == null) {
//            return false;
//        }
//        if (getClass() != that.getClass()) {
//            return false;
//        }
//        User other = (User) that;
//        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
//            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
//            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
//            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
//            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
//            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
//            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
//        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
//        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
//        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
//        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
//        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
//        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", userId=").append(userId);
//        sb.append(", userName=").append(userName);
//        sb.append(", gender=").append(gender);
//        sb.append(", phone=").append(phone);
//        sb.append(", email=").append(email);
//        sb.append(", createTime=").append(createTime);
//        sb.append(", updateTime=").append(updateTime);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
//        sb.append("]");
//        return sb.toString();
//    }
//}