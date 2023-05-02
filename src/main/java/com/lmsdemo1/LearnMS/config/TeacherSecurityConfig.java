//package com.lmsdemo1.LearnMS.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class TeacherSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain SecurityFilterChain2(HttpSecurity http) throws Exception {
//
////         Permit All Requests inside the Web Application
//        http.csrf().disable().authorizeHttpRequests()
//
////                .requestMatchers("/StudentDashboard/**").permitAll()
//                .requestMatchers("/TeacherDashboard/**").permitAll()
//                .requestMatchers("/Registration").permitAll()
//                .requestMatchers("/style.css").permitAll()
////                .requestMatchers("/Login").permitAll()
//                .requestMatchers("/LoginT").permitAll()
////                .requestMatchers("/StudentD").authenticated()
//                .requestMatchers("/TeacherD").authenticated()
//                .requestMatchers("/RegistrationT").permitAll()
//                .requestMatchers("/LogoutT").permitAll()
//                .requestMatchers("/saveMsg").permitAll()
//
////                .and()
////
////                .formLogin().loginPage("/Login")
////                .defaultSuccessUrl("/StudentD")
////                .failureUrl("/Login?error=true").permitAll()
////                .and().logout().logoutSuccessUrl("/Login?logout=true").invalidateHttpSession(true).permitAll()
//
//
//                .and().formLogin().loginPage("/LoginT")
//                .defaultSuccessUrl("/TeacherD")
//                .failureUrl("/LoginT?error=true").permitAll()
//                .and().logout().logoutSuccessUrl("/LoginT?logout=true").invalidateHttpSession(true).permitAll()
//                .and().httpBasic();
//
//
//
//
//
////         Deny All Requests inside the Web Application
////          http.authorizeHttpRequests().anyRequest().permitAll()
////                             .and().formLogin()
////                    .and().httpBasic();
////
//        return http.build();
//
//    }
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailstService() {
//
//        UserDetails student = User.withDefaultPasswordEncoder()
//                .username("harshal")
//                .password("Harshal@123")
//                .roles("STUDENT")
//                .build();
//        UserDetails teacher = User.withDefaultPasswordEncoder()
//                .username("123456")
//                .password("Harshal@123")
//                .roles("TEACHER")
//                .build();
//        return new InMemoryUserDetailsManager(student,teacher);
//    }
////    protected void configure(HttpSecurity http) throws Exception {
//    // Permit All Requests inside the Web Application
////        http.authorizeRequests().
////                anyRequest().permitAll().
////                and().formLogin()
////                .and().httpBasic();
//    // Deny All Requests inside the Web Application
////        http.authorizeRequests().
////                anyRequest().denyAll().
////                and().formLogin()
////                .and().httpBasic();
////    }
//}