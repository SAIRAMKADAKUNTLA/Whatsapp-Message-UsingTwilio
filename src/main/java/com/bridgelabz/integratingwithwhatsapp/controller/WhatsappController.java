package com.bridgelabz.integratingwithwhatsapp.controller;

import com.bridgelabz.integratingwithwhatsapp.dto.WhatsappRequest;
import com.bridgelabz.integratingwithwhatsapp.service.WhatsappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappController {

    @Autowired
    WhatsappService whatsappService;

    @PostMapping ("/send")
    public String sendTo(@RequestBody WhatsappRequest whatsappRequest){
        whatsappService.sent(whatsappRequest);
        return "message sent successfully";
    }
}
