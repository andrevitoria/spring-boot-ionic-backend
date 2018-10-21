package com.andrevitoria.cursomc.services;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;



public class SmtpEmailService extends AbstractEmailService {
	@Autowired
	private MailSender mailSender;
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(SmtpEmailService.class);

	@Override
	public void sendMail(SimpleMailMessage msg) {
		// TODO Auto-generated method stub
		LOG.info("Enviando de email...");
		mailSender.send(msg);
		LOG.info("Email enviado!");

	}

}
