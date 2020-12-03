package com.learnMore.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_tbl")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id", nullable = false)

    private Integer userId;
    @Basic(optional = false)
    @Column(name = "user_handle", nullable = false, length = 100)

    private String userHandle;
    @Basic(optional = false)
    @Column(name = "user_fname", nullable = false, length = 100)

    private String userFname;
    @Basic(optional = false)
    @Column(name = "user_lname", nullable = false, length = 100)

    private String userLname;
    @Basic(optional = false)
    @Column(name = "user_email", nullable = false, length = 100)

    private String userEmail;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String userHandle, String userFname, String userLname, String userEmail) {
        this.userId = userId;
        this.userHandle = userHandle;
        this.userFname = userFname;
        this.userLname = userLname;
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

    public String getUserFname() {
        return userFname;
    }

    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    public String getUserLname() {
        return userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    @Override
    public String toString() {
        return "User[ userId=" + userId + " ]";
    }

}

