package cn.example.helloworld.domain;

/**
 * Created by longxianlin on 2016/12/30.
 */
public class Message {

    String name;
    String text;

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
