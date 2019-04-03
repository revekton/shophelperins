package hello;

public class Greeting {

    private final long id;
    private final String content;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getData(){
        String content = new String(Files.readAllBytes(Paths.get("json.txt")));
        //
        //String jsondata= ;

        //
            return content;
    }

}
