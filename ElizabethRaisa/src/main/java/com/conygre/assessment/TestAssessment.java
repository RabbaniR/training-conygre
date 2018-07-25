package com.conygre.assessment;

import com.conygre.assessment.configuration.AppConfig;
import com.conygre.assessment.services.BridgeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAssessment {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BridgeService service = context.getBean(BridgeService.class);

        service.getBridges().forEach(c -> System.out.println(c.getName()));


    }
}
