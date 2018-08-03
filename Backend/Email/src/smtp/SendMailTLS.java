package smtp;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendMailTLS {
	String xEmail;
	String Id;
	public SendMailTLS(String visaID,String Email) {
		xEmail=Email;
		Id=visaID;
	}

	public void sendEmail() {
		try {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.debug", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		//props.put("mail.smtp.localhost", "yoursite.com");
		  
		Session s = Session.getInstance(props, null);
		s.setDebug(true);
		  
		MimeMessage message = new MimeMessage(s);
		  
		InternetAddress from;

			from = new InternetAddress("hajj@visa.org",
			"Hajj visa");
		
		InternetAddress to = new InternetAddress(xEmail);
		  
		message.setSentDate(new Date());
		message.setFrom(from);
		message.addRecipient(Message.RecipientType.TO, to);
		  
		message.setSubject("Hajj Visa");
		message.setContent("your hajj visa has been issued under : "+Id +"with PDF file", "text/plain");
		 
		BodyPart messageBodyPart = new MimeBodyPart();

        // Now set the actual message
        messageBodyPart.setText("your hajj visa has been issued under : "+Id +"with PDF file");

        // Create a multipar message
        Multipart multipart = new MimeMultipart();

        // Set text message part
        multipart.addBodyPart(messageBodyPart);

        // Part two is attachment
        messageBodyPart = new MimeBodyPart();
        String filename = "..\\pdf\\"+Id+".pdf";
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);
        // Send the complete message parts
        message.setContent(multipart);
		Transport tr = s.getTransport("smtp");
		tr.connect("smtp.gmail.com", "aaawa47@gmail.com", "123456789123456789aa");
		message.saveChanges();
		tr.sendMessage(message, message.getAllRecipients());
		tr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
