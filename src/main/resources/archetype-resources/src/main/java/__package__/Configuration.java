package ${package};

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Configuration class to hold the module specific configuration properties. The properties are read from the
 * application.properties file and start with the prefix "${configPrefix}".
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "${configPrefix}")
public class Configuration {

}
