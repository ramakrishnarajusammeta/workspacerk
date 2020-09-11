
package beta;
import org.apache.logging.log4j.*;


public class DemoBetaLogging {

	private static Logger log = LogManager.getLogger(DemoBetaLogging.class.getName());
	public static void main (String args[]) {
		
		log.debug("Iam Debugging");
		log.info("Iam Info");
		log.error("Iam Error");
		log.fatal("This a fatal");
		
		
		
	}
}
