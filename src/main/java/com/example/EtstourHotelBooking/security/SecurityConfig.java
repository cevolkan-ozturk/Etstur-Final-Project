package com.example.EtstourHotelBooking.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //bcryct bean definition
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // athenticationProvider bean definition

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/login-form-page").permitAll()
                .antMatchers("/", "/new-reservation\", \"/your-reservations").permitAll()
                //.hasAnyRole("EMPLOYEE")
                .and()
                .logout()
                .logoutUrl("/login-form-page")
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/403")
                .and().csrf().disable()
                .headers().disable();
    }
}
