package cz.jiripinkas.example.chat.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.UIDFolder;
import javax.mail.search.AndTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchTerm;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CheckingMails {

   public static void check(String host, String storeType, String user,
      String password, HttpServletRequest request) 
   {
      try {
      properties.put("mail.store.protocol", "pop3s");
      //create properties field
      Properties properties = new Properties();

      properties.put("mail.pop3.host", host);
      properties.put("mail.pop3.port", "995");
      properties.put("mail.pop3.starttls.enable", "true");
      Session emailSession = Session.getDefaultInstance(properties);
  
      //create the POP3 store object and connect with the pop server
      Store store = emailSession.getStore("pop3s");

      store.connect(host, user, password);

      //create the folder object and open it
      Folder emailFolder = store.getFolder("INBOX");
      emailFolder.open(Folder.READ_ONLY);
      
      Address senderAddress;
      String subject;
      String tekst;

      List <String> subjects = new ArrayList<String>();
      List <Address> senders = new ArrayList<Address>();
      List <String> teksts = new ArrayList<String>();     

      Message[] messages = emailFolder.getMessages();      
      Model model = null;
      System.out.println("messages.length---" + messages.length);

      for (int i = 0, n = messages.length; i < n; i++) {
         Message message = messages[i];
         System.out.println("---------------------------------");
         System.out.println("Email Number " + (i + 1));
         subject=message.getSubject();
         subjects.add(subject);
         System.out.println("Subject: " + subject);
         senderAddress=message.getFrom()[0];
         senders.add(senderAddress);
         System.out.println("From: " + senderAddress);
         tekst=message.getContent().toString();
         teksts.add(tekst);
         System.out.println("Text: " + tekst);

      }
      request.setAttribute("subject", subjects);
      request.setAttribute("senderAddress", senders);
      request.setAttribute("tekst", teksts);

      //close the store and folder objects

      emailFolder.close(true);
      store.close();

      } catch (NoSuchProviderException e) {
         e.printStackTrace();
      } catch (MessagingException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
    }
   
   @RequestMapping("/checkEmail.do")
   public static String main(String[] args ,HttpServletRequest request) {

	      String host = "pop.gmail.com";// change accordingly
	      String mailStoreType = "pop3";
	      String username = "konstr264@gmail.com";// change accordingly
	      String password = "qazplm10";// change accordingly

      check(host, mailStoreType, username, password, request);
	return "recvForm";

   }



}