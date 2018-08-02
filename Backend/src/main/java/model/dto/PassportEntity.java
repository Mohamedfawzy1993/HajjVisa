package model.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "passport", schema = "hajjvisa", catalog = "")
public class PassportEntity {
    private String passportId;
    private Date passportIssueDate;
    private Date passportExpireDate;
    private String passportType;
    private Integer userUserId;

    @Id
    @Column(name = "PASSPORT_ID", nullable = false, length = 50)
    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    @Basic
    @Column(name = "PASSPORT_ISSUE_DATE", nullable = false)
    public Date getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(Date passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    @Basic
    @Column(name = "PASSPORT_EXPIRE_DATE", nullable = false)
    public Date getPassportExpireDate() {
        return passportExpireDate;
    }

    public void setPassportExpireDate(Date passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }

    @Basic
    @Column(name = "PASSPORT_TYPE", nullable = false, length = 45)
    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    @Basic
    @Column(name = "User_USER_ID", nullable = false)
    public Integer getUserUserId() {
        return userUserId;
    }

    public void setUserUserId(Integer userUserId) {
        this.userUserId = userUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportEntity that = (PassportEntity) o;
        return Objects.equals(passportId, that.passportId) &&
                Objects.equals(passportIssueDate, that.passportIssueDate) &&
                Objects.equals(passportExpireDate, that.passportExpireDate) &&
                Objects.equals(passportType, that.passportType) &&
                Objects.equals(userUserId, that.userUserId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(passportId, passportIssueDate, passportExpireDate, passportType, userUserId);
    }
}
