package tech.itpark.model;

public class Message {

    private long id;
    private String content;
    private long created;
    private String status;

    public Message(long id, String content, long created, String status) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
