package model.dto;

public class VisaFormDTO {

    private VisaEntity visaData = new VisaEntity();
    private PassportEntity passportData = new PassportEntity();
    private UserEntity userData = new UserEntity();

    public VisaEntity getVisaData() {
        return visaData;
    }

    public void setVisaData(VisaEntity visaData) {
        this.visaData = visaData;
    }

    public PassportEntity getPassportData() {
        return passportData;
    }

    public void setPassportData(PassportEntity passportData) {
        this.passportData = passportData;
    }

    public UserEntity getUserData() {
        return userData;
    }

    public void setUserData(UserEntity userData) {
        this.userData = userData;
    }
}
