package model.dao;

import model.dto.PassportEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassportEntityRepository extends CrudRepository<PassportEntity , Long> {

    public List<PassportEntity> getByPassportId(String passportID);
}
