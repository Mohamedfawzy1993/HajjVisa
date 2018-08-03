package model.dao;

import model.dto.VisaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VisaEntityRepository extends CrudRepository<VisaEntity, Long> {

    public VisaEntity getAllByVisaId(int visaId);
    public List<VisaEntity> findAllByVisaStatus(String visaStatus);

}
