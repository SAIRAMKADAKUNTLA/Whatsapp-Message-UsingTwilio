package com.bridgelabz.integratingwithwhatsapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WhatsappRequest {
    private String number;
    private String message;
}
