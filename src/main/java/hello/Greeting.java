package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String jsondata;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
public Greeting(){
this.jsondata="is it really hard to get some data done ffs;
}

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getData(){
    return jsondata;
    }

}
