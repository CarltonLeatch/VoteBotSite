package com.votebot.site

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = arrayOf("com.votebot"))
@ComponentScan(basePackages = arrayOf("com.votebot"))
class SiteApplication

fun main(args: Array<String>) {
    runApplication<SiteApplication>(*args)
}
