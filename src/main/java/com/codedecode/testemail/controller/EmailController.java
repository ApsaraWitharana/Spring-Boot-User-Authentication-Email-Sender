package com.codedecode.testemail.controller;


import com.codedecode.testemail.services.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String sendEmail(){
        sendEmailService.sendEmail("asachini095@gmail.com","User Login Successfully!! Thank you! \uD83E\uDD1D❤\n","Test Subject");
        return "Send Successfully!!";
    }


}
