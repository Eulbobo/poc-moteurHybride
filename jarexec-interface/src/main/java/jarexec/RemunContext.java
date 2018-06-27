package jarexec;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RemunContext {

    private Map<String, BigDecimal> indicateurs = new HashMap<String, BigDecimal>();
    
    public RemunContext(Map<String, BigDecimal> indicateurs) {
        this.indicateurs.putAll(indicateurs);
    }
    
    public BigDecimal get(String value) {
        return indicateurs.get(value);
    }
}
