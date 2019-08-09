package com.daoxuanson.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
//@EntityListeners(AuditingEntityListener.class)
public class User extends Base {
    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;
    @Column
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column
    private String satus;
    @Column(name = "created_date")
//    @CreatedDate
    private Date createdDate;
    @Column(name = "created_by")
//    @CreatedBy
    private String createdBy;
    @Column(name = "modified_date")
//    @LastModifiedDate
    private Date modifiedDate;
    @Column(name = "modified_by")
//    @LastModifiedBy
    private String modifiedBy;
    @ManyToMany
    @JoinTable(name = "permission",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false))
    private Set<Role> roles = new HashSet<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getSatus() {
        return satus;
    }

    public void setSatus(String satus) {
        this.satus = satus;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
