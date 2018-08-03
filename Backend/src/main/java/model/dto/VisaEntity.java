package model.dto;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "visa", schema = "hajjvisa", catalog = "")
public class VisaEntity {
    private Integer visaId = 0;
    private String visaType = "";
    private Integer validity = 1;
    private Date issueDate = new Date();
    private Integer durationOfStay = 1;
    private String issueOffice = "";
    private String fees = "";
    private Integer numberOfEntries = 1;
    private Integer companion = 1;
    private Byte workPermit = 1;
    private String visaOfficer = "";
    private String visaStatus = "";
    private String passportPassportId = "";
    private String agencyNumber = "";
    private String paymentNumber = "";
    private String visaURL = "";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VISA_ID", nullable = false)
    public Integer getVisaId() {
        return visaId;
    }

    public void setVisaId(Integer visaId) {
        this.visaId = visaId;
    }

    @Basic
    @Column(name = "VISA_TYPE", nullable = false, length = 45)
    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    @Basic
    @Column(name = "VALIDITY", nullable = false)
    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    @Basic
    @Column(name = "ISSUE_DATE", nullable = true)
    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Basic
    @Column(name = "DURATION_OF_STAY", nullable = false)
    public Integer getDurationOfStay() {
        return durationOfStay;
    }

    public void setDurationOfStay(Integer durationOfStay) {
        this.durationOfStay = durationOfStay;
    }

    @Basic
    @Column(name = "ISSUE_OFFICE", nullable = false, length = 45)
    public String getIssueOffice() {
        return issueOffice;
    }

    public void setIssueOffice(String issueOffice) {
        this.issueOffice = issueOffice;
    }

    @Basic
    @Column(name = "FEES", nullable = false, length = 45)
    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    @Basic
    @Column(name = "NUMBER_OF_ENTRIES", nullable = false)
    public Integer getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(Integer numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    @Basic
    @Column(name = "COMPANION", nullable = true)
    public Integer getCompanion() {
        return companion;
    }

    public void setCompanion(Integer companion) {
        this.companion = companion;
    }

    @Basic
    @Column(name = "WORK_PERMIT", nullable = false)
    public Byte getWorkPermit() {
        return workPermit;
    }

    public void setWorkPermit(Byte workPermit) {
        this.workPermit = workPermit;
    }

    @Basic
    @Column(name = "VISA_OFFICER", nullable = false, length = 45)
    public String getVisaOfficer() {
        return visaOfficer;
    }

    public void setVisaOfficer(String visaOfficer) {
        this.visaOfficer = visaOfficer;
    }

    @Basic
    @Column(name = "VISA_STATUS", nullable = false, length = 45)
    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    @Basic
    @Column(name = "PASSPORT_ID", nullable = false, length = 50)
    public String getPassportPassportId() {
        return passportPassportId;
    }

    public void setPassportPassportId(String passportPassportId) {
        this.passportPassportId = passportPassportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisaEntity that = (VisaEntity) o;
        return Objects.equals(visaId, that.visaId) &&
                Objects.equals(visaType, that.visaType) &&
                Objects.equals(validity, that.validity) &&
                Objects.equals(issueDate, that.issueDate) &&
                Objects.equals(durationOfStay, that.durationOfStay) &&
                Objects.equals(issueOffice, that.issueOffice) &&
                Objects.equals(fees, that.fees) &&
                Objects.equals(numberOfEntries, that.numberOfEntries) &&
                Objects.equals(companion, that.companion) &&
                Objects.equals(workPermit, that.workPermit) &&
                Objects.equals(visaOfficer, that.visaOfficer) &&
                Objects.equals(visaStatus, that.visaStatus) &&
                Objects.equals(passportPassportId, that.passportPassportId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(visaId, visaType, validity, issueDate, durationOfStay, issueOffice, fees, numberOfEntries, companion, workPermit, visaOfficer, visaStatus, passportPassportId);
    }

    @Basic
    @Column(name = "AGENCY_NUMBER")
    public String getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    @Basic
    @Column(name = "PAYMENT_NUMBER", nullable = false, length = 50)
    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    @Basic
    @Column(name="VISA_URL" , nullable = true , length = 1000)
    public String getVisaURL() {
        return visaURL;
    }

    public void setVisaURL(String visaURL) {
        this.visaURL = visaURL;
    }
}
