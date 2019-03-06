package bean;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendMail {
    
    public void sendMail(String para, String assunto, String mensagem){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "true");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("douglasaxelkjellin2@gmail.com", "@Douglas1337");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("douglasaxelkjellin2@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(para));
            message.setSubject(assunto);
            message.setText(mensagem);

            Transport.send(message);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro\n" + e);
        }
    }
}
