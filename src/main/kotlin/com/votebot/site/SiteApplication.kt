package com.votebot.site

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.votebot"))
class SiteApplication

fun main(args: Array<String>) {
    runApplication<SiteApplication>(*args)
}
