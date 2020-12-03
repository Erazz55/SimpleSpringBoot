package com.learnMore.dto;

public class SignUpDTO {

    private String handle;
    private String fname;
    private String lname;
    private String email;

    public SignUpDTO() {

    }

    public SignUpDTO(String handle, String fname, String lname, String email) {
        this.handle = handle;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
