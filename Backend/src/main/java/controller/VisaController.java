package controller;

import model.dao.PassportService;
import model.dao.UserService;
import model.dao.VisaService;
import model.dto.PassportEntity;
import model.dto.UserEntity;
import model.dto.VisaEntity;
import model.dto.VisaFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import pdf.sample;

import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class VisaController {

    @Autowired
    public VisaService visaService;
    @Autowired
    public PassportService passportService;
    @Autowired
    public UserService userService;

//    @GetMapping(path = "/**")
//    public @ResponseBody
//    List<VisaEntity> userEntityList() {
//        return this.visaService.findAll();
//    }

    @PostMapping(path = "/visa/**", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public VisaEntity saveVisaApplication(@RequestBody VisaFormDTO visaDTO) {
        UserEntity userEntity = this.userService.insertUser(visaDTO.getUserData());

        PassportEntity passportEntity = visaDTO.getPassportData();
        passportEntity.setUserUserId(userEntity.getUserId());
        passportEntity = this.passportService.insertPassport(passportEntity);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        VisaEntity visaEntity = visaDTO.getVisaData();
        visaEntity.setPassportPassportId(passportEntity.getPassportId());
        visaEntity = this.visaService.insertVisa(visaEntity);
        String fileName = visaEntity.getVisaId()+"VisaIssue.pdf";
        sample sample = new sample(userEntity.getUserFname(), userEntity.getUserMname(), userEntity.getUserLname(),
                userEntity.getPlaceOfBirth(), simpleDateFormat.format(userEntity.getDateOfBirth()), userEntity.getEmail().substring(0 , 10),
                userEntity.getPhoneNo(), userEntity.getNationality(), passportEntity.getPassportId(), simpleDateFormat.format(passportEntity.getPassportIssueDate()),
                simpleDateFormat.format(passportEntity.getPassportExpireDate()), passportEntity.getPassportType(), visaEntity.getVisaId().toString(), visaEntity.getVisaType(),
                simpleDateFormat.format(visaEntity.getIssueDate()), visaEntity.getValidity().toString(), visaEntity.getIssueOffice(), visaEntity.getVisaType(), visaEntity.getFees(),
                visaEntity.getNumberOfEntries().toString(), visaEntity.getCompanion().toString(), visaEntity.getWorkPermit().toString(), visaEntity.getVisaOfficer(), visaEntity.getVisaStatus() , fileName);
        sample.create();
        visaEntity.setVisaURL("src/main/resources/img/"+sample.getVisaUrl());
        visaEntity = this.visaService.updateVisa(visaEntity);
        System.out.println("src/main/resources/img/"+visaEntity);
        return visaEntity;
    }

    @GetMapping(value = "/check/**", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    VisaEntity checkVisa(@RequestParam("visa") int visa) {
        return this.visaService.findbyVisaIDAndPassportID(visa);
    }

    @GetMapping(value = "/download")
    public ResponseEntity<Object> downloadFile(@RequestParam String fileName) throws FileNotFoundException {
        FileWriter filewriter =  null;
        File file = new File(fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(MediaType.parseMediaType(MediaType.APPLICATION_PDF_VALUE)).body(resource);
        return responseEntity;
    }

   @GetMapping("/visas")
    public List<VisaEntity> getAllVisas() {
        return this.visaService.getAllPending();
   }

    @GetMapping("/visas/user")
    public UserEntity getUserID(@RequestParam("passport") String passportIDx) {
        PassportEntity passportID = this.passportService.getPassportEntityByPassportId(passportIDx);
        UserEntity userEntity = this.userService.getUserEntityByUserId(passportID.getUserUserId().toString());
        return userEntity;
    }

}
