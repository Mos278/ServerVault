package com.vault.client.Controller

import com.vault.client.Config.TestConfig
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
@RequestMapping("test")
class TestController(var testConfig: TestConfig) {

    @GetMapping()
    fun test(): ResponseEntity<String> {
        var response = testConfig.value1 + " " + testConfig.value2 + " " + testConfig.value3
        return ResponseEntity.ok().body(response)
    }
}