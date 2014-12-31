import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dummy {

    private static final Logger logger = LogManager.getLogger(dummy.class);

    public static void main(String[] args) {

        logger.error("x");
    }
}
