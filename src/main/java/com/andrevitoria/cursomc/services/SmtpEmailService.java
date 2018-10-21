package com.andrevitoria.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;



public class SmtpEmailService extends AbstractEmailService {
	@Autowired
	private MailSender mailSender;
	@Autowired
	private JavaMailSender javaMailSender;
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(SmtpEmailService.class);

	@Override
	public void sendMail(SimpleMailMessage msg) {
		// TODO Auto-generated method stub
		LOG.info("Enviando de email...");
		mailSender.send(msg);
		LOG.info("Email enviado!");

	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		// TODO Auto-generated method stub
		LOG.info("Enviando de email Html...");
		javaMailSender.send(msg);
		LOG.info("Email enviado!");
		
	}

}
