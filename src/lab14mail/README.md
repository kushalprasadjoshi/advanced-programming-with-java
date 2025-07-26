# Lab 14 - Java Mail API

## Objectives

1. Implement the Java Mail API.

---

## Implementation

```java
package lab14mail;

import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.util.Properties;

public class SendEmail {
    public static void main(String[] args) {
        final String username = "youraddress@gmail.com";
        final String password = "your-app-password";
        String to = "recipient@example.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to)
            );
            message.setSubject("Test Email");
            message.setText("Hello, this is a test email from JavaMail API!");

            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
```

---

## Output

```output
Email sent successfully.
```

---