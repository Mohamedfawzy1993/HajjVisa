package model.dao;

import model.dto.VisaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VisaService {

    private VisaEntityRepository visaEntityRepository;

    @Autowired
    public VisaService(VisaEntityRepository visaEntityRepository) {
        this.visaEntityRepository = visaEntityRepository;
    }

    public void insertVisa(VisaEntity visaEntity) {
        this.visaEntityRepository.save(visaEntity);
    }

    public List<VisaEntity> findAll() {
        return (List<VisaEntity>) this.visaEntityRepository.findAll();
    }
}
