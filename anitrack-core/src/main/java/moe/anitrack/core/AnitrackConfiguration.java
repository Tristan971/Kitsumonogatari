package moe.anitrack.core;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import moe.anitrack.base.BaseConfiguration;
import moe.anitrack.core.persistence.PersistenceConfiguration;
import moe.anitrack.core.thirdparties.ThirdpartiesConfiguration;
import moe.anitrack.server.ServerConfiguration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Import(value = {
        BaseConfiguration.class,
        PersistenceConfiguration.class,
        ServerConfiguration.class,
        ThirdpartiesConfiguration.class
})
public class AnitrackConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnitrackConfiguration.class);

    public AnitrackConfiguration() {
    }

    @PostConstruct
    public void onInitialization() {
        LOGGER.info("Anitrack core configuration loaded.");
    }

}
