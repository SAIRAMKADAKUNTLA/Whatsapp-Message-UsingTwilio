package com.bridgelabz.integratingwithwhatsapp.utility;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Component;

@Component
public class WhatsappSender {
    public void sentMessage(String to,String body){
        Twilio.init("AC4861ee03fad62a9ee6983dc5a1d3a456","bde6fa01064ab2dc8658e93772e9251f");
        Message message=Message.creator(new  com.twilio.type.PhoneNumber("whatsapp:"+to),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                body).create();
    }

}
