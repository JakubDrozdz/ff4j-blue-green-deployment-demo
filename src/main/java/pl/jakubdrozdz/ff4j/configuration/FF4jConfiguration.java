package pl.jakubdrozdz.ff4j.configuration;

import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.ff4j.core.FlippingStrategy;
import org.ff4j.strategy.time.ReleaseDateFlipStrategy;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class FF4jConfiguration {
    public static String NEW_API = "NEW_API";
    @Bean
    public FF4j getFF4j(){
        FF4j ff4j = new FF4j();
        FlippingStrategy flippingStrategy = new ReleaseDateFlipStrategy("2023-09-04-19:40");
        Feature feature = new Feature(NEW_API);
        feature.setEnable(true);
        feature.setFlippingStrategy(flippingStrategy);
        ff4j.createFeature(feature);
        return ff4j;
    }
}
