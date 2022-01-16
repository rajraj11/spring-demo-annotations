package org.readPropertiesfile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.readPropertiesfile")
@PropertySource("classpath:sport.properties")
public class Config {
}
