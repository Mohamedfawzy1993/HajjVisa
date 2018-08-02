package controller;

import model.dao.UserService;
import model.dto.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService userEntityRepository;

    @GetMapping(path = "/main/**")
    public @ResponseBody
    List<UserEntity> userEntityList(@RequestParam("name") String name) {
        return this.userEntityRepository.getUserByfName(name);
    }

    @PostMapping(path = "/user/**", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addUser(@RequestBody UserEntity userEntity) {
        try {
            this.userEntityRepository.insertUser(userEntity);
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }
}
