package com.slm.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = 1;
        if(errorCode != 1){
            //返回不健康的礼貌
            return Health.down().withDetail("errorCode",errorCode).build();
        }
        return Health.down().build();
    }
}
