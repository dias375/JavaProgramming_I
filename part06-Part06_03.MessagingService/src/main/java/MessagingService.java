
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class MessagingService {

    //private Message message;
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<Message>();
    }

    public void add(Message message) {
        String messageContent = message.getContent();
        int charactersLong = messageContent.length();

        if (charactersLong <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

}
