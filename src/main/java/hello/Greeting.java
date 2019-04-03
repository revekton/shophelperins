package hello;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public String getContent() throws IOException {
        return content;
    }
    public String getData() throws IOException{
        String content = new String(Files.readAllBytes(Paths.get("json.txt")));
        //
        //String jsondata= ;

        //
            return content;
    }

}
