package com.codedecode.testemail.services;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
