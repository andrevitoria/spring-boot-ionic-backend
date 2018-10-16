package com.andrevitoria.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.andrevitoria.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	void sendMail(SimpleMailMessage msg);
	
}
