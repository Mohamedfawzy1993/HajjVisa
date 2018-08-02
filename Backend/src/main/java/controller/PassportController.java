package controller;

import model.dao.PassportService;
import model.dto.PassportEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passport")
public class PassportController {

    @Autowired
    public PassportService userPassportService;

    @GetMapping(path = "/**")
    public @ResponseBody
    List<PassportEntity> getPassports() {
        return this.userPassportService.getAllPassports();
    }

    @PostMapping(path = "/**", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addUser(@RequestBody PassportEntity passportEntity) {
        try {
            this.userPassportService.insertPassport(passportEntity);
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }
}
