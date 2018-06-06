package com.votebot.site.Service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Configuration
@EnableWebSecurity
class PasswordEncrypter : WebSecurityConfigurerAdapter(){

    @Override
    protected override fun configure(httpSecurity: HttpSecurity) {
        httpSecurity.authorizeRequests()
                .antMatchers("/**").permitAll()
    }

    @Bean
    fun passowrdEncoder() : PasswordEncoder{
        return BCryptPasswordEncoder()
    }

}