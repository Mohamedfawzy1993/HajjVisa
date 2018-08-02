package model.dao;

import model.dto.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, Long> {

    public List<UserEntity> getAllByUserFname(String fname);
}
