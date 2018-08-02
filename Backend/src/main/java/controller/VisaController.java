package controller;

import model.dao.VisaService;
import model.dto.VisaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisaController {

    @Autowired
    public VisaService visaService;

    @GetMapping(path = "/**")
    public @ResponseBody
    List<VisaEntity> userEntityList() {
        return this.visaService.findAll();
    }
}
