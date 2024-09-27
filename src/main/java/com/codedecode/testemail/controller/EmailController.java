package com.codedecode.testemail.controller;


import com.codedecode.testemail.resources.EmailMassage;
import com.codedecode.testemail.services.EmailSenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("sendEmail")
    public String sendEmail(){
        emailSenderService.sendEmail("asachini095@gmail.com","User Login Successfully!! Thank you! \uD83E\uDD1D❤\n","Test Subject");
        return "Send Successfully!!";
    }

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send-email")
    public ResponseEntity sendEmail(@RequestBody EmailMassage emailMassage) {
        this.emailSenderService.sendEmail(emailMassage.getTo(),emailMassage.getMessage(),emailMassage.getSubject());
        return ResponseEntity.ok("Send Successfully!!");
    }

}
