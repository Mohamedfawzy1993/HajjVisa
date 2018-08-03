package model.dao;

import model.dto.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    private UserEntityRepository userEntityRepository;

    @Autowired
    public UserService(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    public List<UserEntity> getUserByfName(String fname) {
        return this.userEntityRepository.getAllByUserFname(fname);
    }


    public UserEntity insertUser(UserEntity userEntity) {
        return this.userEntityRepository.save(userEntity);
    }

    public UserEntity getUserEntityByUserId(String userID) {
       return this.userEntityRepository.getUserEntityByUserId(userID);
    }
}
