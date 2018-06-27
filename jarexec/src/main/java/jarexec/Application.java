package jarexec;

import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    
    private static final  Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("Initializing Spring context.");
        
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("jarexec", "fr.norsys.jarexec");
        
        LOGGER.info("Spring context initialized.");
        
        Map<String, JarExec> beans = applicationContext.getBeansOfType(JarExec.class);
        
        for (Entry<String, JarExec> entry : beans.entrySet()) {
            LOGGER.info("Bean : {} / {} : {}", entry.getKey(), entry.getValue(), entry.getValue().calculRemun(null));
        }

    }

}
