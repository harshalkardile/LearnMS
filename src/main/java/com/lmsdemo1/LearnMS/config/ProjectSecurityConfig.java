package com.lmsdemo1.LearnMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
//
//
@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

//         Permit All Requests inside the Web Application
        http.csrf().disable().authorizeHttpRequests()
                .requestMatchers("/StudentDashboard/**").permitAll()
                .requestMatchers("/TeacherDashboard/**").permitAll()
                .requestMatchers("/Registration").denyAll()
                .requestMatchers("/style.css").permitAll()
                .requestMatchers("/Login").permitAll()
                .requestMatchers("/StudentD").authenticated()
                .requestMatchers("/TeacherD").authenticated()
                .requestMatchers("/RegistrationT").permitAll()

                .requestMatchers("/saveMsg").permitAll()

                .and().formLogin().loginPage("/Login")
                .defaultSuccessUrl("/StudentD").failureUrl("/Login?error=true").permitAll()
                .and().logout().logoutSuccessUrl("/Login?logout=true").invalidateHttpSession(true).permitAll()
                .and().httpBasic();

//         Deny All Requests inside the Web Application
//          http.authorizeHttpRequests().anyRequest().permitAll()
//                             .and().formLogin()
//                    .and().httpBasic();
//
        return http.build();

    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("harshal")
                .password("Harshal@123")
                .roles("USER")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("123456")
                .password("Harshal@123")
                .roles("USER","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
//    protected void configure(HttpSecurity http) throws Exception {
        // Permit All Requests inside the Web Application
//        http.authorizeRequests().
//                anyRequest().permitAll().
//                and().formLogin()
//                .and().httpBasic();
        // Deny All Requests inside the Web Application
//        http.authorizeRequests().
//                anyRequest().denyAll().
//                and().formLogin()
//                .and().httpBasic();
//    }
}