package com.learnMore.dto;

public class TeacherDTO {

    private String handle;
    private String name;
    private String education;
    private String subject;
    private int rating;

    public TeacherDTO() {
    }

    public TeacherDTO(String handle, String name, String education, String subject, int rating) {
        this.handle = handle;
        this.name = name;
        this.education = education;
        this.subject = subject;
        this.rating = rating;
    }

    public TeacherDTO(String name, String education, int rating) {
        this.name = name;
        this.education = education;
        this.rating = rating;
    }

    public TeacherDTO(String handle, String name, String education, int rating) {
        this.handle = handle;
        this.name = name;
        this.education = education;
        this.rating = rating;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "handle='" + handle + '\'' +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", subject='" + subject + '\'' +
                ", rating=" + rating +
                '}';
    }
}
