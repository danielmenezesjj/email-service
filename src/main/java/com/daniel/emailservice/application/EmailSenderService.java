package com.daniel.emailservice.application;

import com.daniel.emailservice.adapters.EmailSenderGateway;
import com.daniel.emailservice.core.EmailSenderUseCase;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
