
package alpha;
import org.apache.logging.log4j.*;


public class DemoAlphaLogging {

	private static Logger log = LogManager.getLogger(DemoAlphaLogging.class.getName());
	public static void main (String args[]) {
		
		log.debug("Iam Debugging");
		log.info("Iam Info");
		log.error("Iam Error");
		log.fatal("This a fatal");
		
		
		
	}
}
