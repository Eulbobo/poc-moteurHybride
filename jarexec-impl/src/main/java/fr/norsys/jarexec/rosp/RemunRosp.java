package fr.norsys.jarexec.rosp;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import jarexec.JarExec;
import jarexec.RemunContext;

@Component
public class RemunRosp implements JarExec {

    public BigDecimal calculRemun(RemunContext context) {
        return BigDecimal.ONE;
    }

}
