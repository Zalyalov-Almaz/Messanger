package tech.itpark.meneger;

import tech.itpark.model.Message;
import java.util.ArrayList;

public class MessageManager {
    private long nextId = 1;
    private ArrayList<Message> messages = new ArrayList<>();

    public Message save(Message message) {
        message.setId(nextId);
        nextId++;
        messages.add(message);
        message.setStatus("SENT");
        return message;
    }
    public void removeByID(long id) {
//        messages.removeIf(message -> message.getId() == id);
//        for (int i = 0; i < messages.size(); i++) {
//            Message message = messages.get(i);
//            if (message.getId() == id) {
//                messages.remove(i);
//                return;
//            }
//        }
        int index = indexOf(id);
        if (index != -1) {
            messages.remove(index);
        }
    }
    public void update(long id) {
       messages.get(messages.indexOf(id)).setContent("Content updated");
       messages.get(messages.indexOf(id)).setId(id + 1L);
        //написать дома
    }
    public ArrayList<Message> getMessages(long fromID, int count) {
        int index = indexOf(fromID);
        return (ArrayList<Message>) messages.subList(index, index + count);
    }
    public int indexOf(long id) {
        for (int i = 0; i < messages.size(); i++) {
            Message message = messages.get(i);
            if (message.getId() == id) {
                return i;
            }
        }
        return -1; //если сообщения с таким id не существует в коллекции, возвращаем -1
    }
}
