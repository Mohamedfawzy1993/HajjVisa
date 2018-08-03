package model.dao;

import model.dto.PassportEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassportService {

    private PassportEntityRepository passportEntityRepository;

    @Autowired
    public PassportService(PassportEntityRepository passportEntityRepository) {
        this.passportEntityRepository = passportEntityRepository;
    }

    public PassportEntity insertPassport(PassportEntity passportEntity) {
        return this.passportEntityRepository.save(passportEntity);
    }
    public List<PassportEntity> getAllPassports()
    {
        return (List<PassportEntity>)this.passportEntityRepository.findAll();
    }

    public PassportEntity getPassportEntityByPassportId(String passportID) {
      return this.passportEntityRepository.getPassportEntityByPassportId(passportID);
    }

}
