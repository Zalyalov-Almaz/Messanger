package tech.itpark;

import tech.itpark.meneger.MessageManager;
import tech.itpark.model.Message;

public class Main {
    public static void main(String[] args) {
        MessageManager messageManager = new MessageManager();
        Message first = new Message(0, "first message", 0, "SENDING");
        messageManager.save(first);
        Message second = new Message(0, "second message", 0, "SENDING");
        messageManager.save(second);

        messageManager.removeByID(second.getId());

    }
}
