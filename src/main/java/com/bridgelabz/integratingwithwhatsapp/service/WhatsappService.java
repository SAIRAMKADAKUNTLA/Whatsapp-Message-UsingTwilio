package com.bridgelabz.integratingwithwhatsapp.service;

import com.bridgelabz.integratingwithwhatsapp.dto.WhatsappRequest;
import com.bridgelabz.integratingwithwhatsapp.utility.WhatsappSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhatsappService {

    @Autowired
    WhatsappSender whatsappSender;

    public void sent(WhatsappRequest whatsappRequest){
        whatsappSender.sentMessage(whatsappRequest.getNumber(),whatsappRequest.getMessage());
    }
}
