package programmer.fadliyandra.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRepository {
    private static final Logger log = LoggerFactory.getLogger(MyRepository.class);

    public void save(String requestId){
        log.info("{}- Repository Save", requestId);
    }

}
