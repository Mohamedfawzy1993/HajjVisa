package model.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "hajjvisa", catalog = "")
public class UserEntity {
    private Integer userId;
    private String userFname;
    private String userLname;
    private String userMname;
    private String placeOfBirth;
    private Date dateOfBirth;
    private String email;
    private String phoneNo;
    private String address;
    private String nationality;
    private String job;
    private int blackListed;

    @Id
    @Column(name = "USER_ID", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_FNAME", nullable = false, length = 45)
    public String getUserFname() {
        return userFname;
    }

    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    @Basic
    @Column(name = "USER_LNAME", nullable = false, length = 45)
    public String getUserLname() {
        return userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    @Basic
    @Column(name = "USER_MNAME", nullable = false, length = 45)
    public String getUserMname() {
        return userMname;
    }

    public void setUserMname(String userMname) {
        this.userMname = userMname;
    }

    @Basic
    @Column(name = "PLACE_OF_BIRTH", nullable = false, length = 45)
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PHONE_NO", nullable = false, length = 45)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = false, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "NATIONALITY", nullable = false, length = 45)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "JOB", nullable = false, length = 45)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(userFname, that.userFname) &&
                Objects.equals(userLname, that.userLname) &&
                Objects.equals(userMname, that.userMname) &&
                Objects.equals(placeOfBirth, that.placeOfBirth) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(address, that.address) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(job, that.job);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, userFname, userLname, userMname, placeOfBirth, dateOfBirth, email, phoneNo, address, nationality, job);
    }

    @Basic
    @Column(name = "BLACKLISTED", nullable = false)
    public int getBlackListed() {
        return blackListed;
    }

    public void setBlackListed(int blackListed) {
        this.blackListed = blackListed;
    }
}
