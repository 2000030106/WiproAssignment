package springprograms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("freshman")
public class FreshMan {

    @Value("Satya Sai")  
    private String name;

    @Autowired
    @Qualifier("room2")  
    private DormRoom room;

    public String getName() {
        return name;
    }

    public DormRoom getRoom() {
        return room;
    }
}
