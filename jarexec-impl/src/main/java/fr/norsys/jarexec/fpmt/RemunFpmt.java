package fr.norsys.jarexec.fpmt;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import jarexec.JarExec;
import jarexec.RemunContext;

@Component
public class RemunFpmt implements JarExec {

    public BigDecimal calculRemun(RemunContext context) {
        return BigDecimal.TEN;
    }

}
