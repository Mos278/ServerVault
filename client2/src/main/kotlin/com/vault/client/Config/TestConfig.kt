package com.vault.client.Config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration

@Configuration
@RefreshScope
@ConfigurationProperties("ex-profile")
class TestConfig {
    var value1: String? = null
    var value2: String? = null
    var value3: String? = null
}