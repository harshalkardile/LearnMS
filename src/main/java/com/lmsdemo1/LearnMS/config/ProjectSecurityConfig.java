package com.lmsdemo1.LearnMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class ProjectSecurityConfig {
//    @Configuration
//@Order(1)
//public static class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.antMatcher("/StudentDashboard/**")
//                .antMatcher("/Registration")
//                .antMatcher("/style.css")
//                .antMatcher("/Login")
//                .antMatcher("/Logout")
//                .antMatcher("/saveMsg")
//                .antMatcher("/StudentD")
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
////                .formLogin()
////                .loginPage("/Login")
////                .defaultSuccessUrl("/StudentD")
////                .failureUrl("/Login?error=true")
////                .permitAll()
////                .and()
////                .logout()
////                .logoutSuccessUrl("/Login?logout=true")
////                .invalidateHttpSession(true)
////                .permitAll();
//        .formLogin().loginPage("/Login")
//                .defaultSuccessUrl("/StudentD")
//                .failureUrl("/Login?error=true").permitAll()
//                .and().logout().logoutSuccessUrl("/Login?logout=true").invalidateHttpSession(true).permitAll()
//                .and().httpBasic();
//    }
//.formLogin().loginPage("/Login")
////                .defaultSuccessUrl("/StudentD")
////                .failureUrl("/Login?error=true").permitAll()
////                .and().logout().logoutSuccessUrl("/Login?logout=true").invalidateHttpSession(true).permitAll()
//                .and().build();
    // configure authentication provider for admin security
//}

//    @Configuration
//    @Order(2)
//    public static class UserSecurityConfig extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.mvcMatcher("/TeacherDashboard/**")
//                    .antMatcher("/RegistrationT")
//                    .antMatcher("/style.css")
//                    .antMatcher("/LoginT")
//                    .antMatcher("/LogoutT")
//                    .antMatcher("/TeacherD")
//                    .authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and()
////                    .formLogin()
////                    .loginPage("/LoginT")
////                    .defaultSuccessUrl("/TeacherD")
////                    .failureUrl("/LoginT?error=true")
////                    .permitAll()
////                    .and()
////                    .logout()
////                    .logoutSuccessUrl("/LoginT?logout=true")
////                    .invalidateHttpSession(true)
////                    .permitAll();
//                    .formLogin().loginPage("/LoginT")
//                    .defaultSuccessUrl("/TeacherD")
//                    .failureUrl("/LoginT?error=true").permitAll()
//                    .and().logout().logoutSuccessUrl("/LoginT?logout=true").invalidateHttpSession(true).permitAll()
//                    .and().httpBasic();
//        }
//
//        // configure authentication provider for user security
//    }

//
//    @Bean
//    @Order(1)
//    public SecurityFilterChain SecurityFilterChain1(HttpSecurity http) throws Exception {
//
//            return http
//                    .securityMatcher("/api/**")
//                    .authorizeHttpRequests(auth -> {
//                        auth.anyRequest().authenticated();
//                    })
//                    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                    .httpBasic(withDefaults())
//                    .build();
//        }
//
////         Permit All Requests inside the Web Application
////        http.csrf().disable().authorizeHttpRequests()
////
////                .requestMatchers("/StudentDashboard/**").permitAll()
//////                .requestMatchers("/TeacherDashboard/**").permitAll()
////                .requestMatchers("/Registration").permitAll()
////                .requestMatchers("/style.css").permitAll()
////                .requestMatchers("/Login").permitAll()
//////                .requestMatchers("/LoginT").permitAll()
////                .requestMatchers("/StudentD").authenticated()
//////                .requestMatchers("/TeacherD").authenticated()
//////                .requestMatchers("/RegistrationT").permitAll()
////                .requestMatchers("/Logout").permitAll()
////                .requestMatchers("/saveMsg").permitAll()
////
////                .and()
////
////                .formLogin().loginPage("/Login")
////                .defaultSuccessUrl("/StudentD")
////                .failureUrl("/Login?error=true").permitAll()
////                .and().logout().logoutSuccessUrl("/Login?logout=true").invalidateHttpSession(true).permitAll()
////
////
//////                .and().formLogin().loginPage("/LoginT")
//////                .defaultSuccessUrl("/TeacherD")
//////               .failureUrl("/LoginT?error=true").permitAll()
//////                .and().logout().logoutSuccessUrl("/LoginT?logout=true").invalidateHttpSession(true).permitAll()
////
////
////                .and().httpBasic();
////
//////         Deny All Requests inside the Web Application
//////          http.authorizeHttpRequests().anyRequest().permitAll()
//////                             .and().formLogin()
//////                    .and().httpBasic();
//////
////        return http.build();
//
//
//
//
//
//
//        @Bean
//        @Order(2)
//        public SecurityFilterChain SecurityFilterChain2(HttpSecurity http) throws Exception {
//            return http
//                    .securityMatcher(AntPathRequestMatcher.antMatcher("/h2-console/**"))
//                    .authorizeHttpRequests( auth -> {
//                        auth.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).permitAll();
//                    })
//                    .csrf(csrf -> csrf.ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")))
//                    .headers(headers -> headers.frameOptions().disable())
//                    .build();
//////         Permit All Requests inside the Web Application
////            http.csrf().disable().authorizeHttpRequests()
////
//////                    .requestMatchers("/StudentDashboard/**").permitAll()
////                    .requestMatchers("/TeacherDashboard/**").permitAll()
//////                    .requestMatchers("/Registration").permitAll()
////                    .requestMatchers("/style.css").permitAll()
//////                    .requestMatchers("/Login").permitAll()
////                    .requestMatchers("/LoginT").permitAll()
//////                    .requestMatchers("/StudentD").authenticated()
////                    .requestMatchers("/TeacherD").authenticated()
////                    .requestMatchers("/RegistrationT").permitAll()
////                    .requestMatchers("/LogoutT").permitAll()
////                    .requestMatchers("/saveMsg").permitAll()
////
////
////                    .and().formLogin().loginPage("/LoginT")
////                    .defaultSuccessUrl("/TeacherD")
////                    .failureUrl("/LoginT?error=true").permitAll()
////                    .and().logout().logoutSuccessUrl("/LoginT?logout=true").invalidateHttpSession(true).permitAll()
////                    .and().httpBasic();
////
////
//////         Deny All Requests inside the Web Application
//////          http.authorizeHttpRequests().anyRequest().permitAll()
//////                             .and().formLogin()
//////                    .and().httpBasic();
//////
////            return http.build();
//        }
    @Bean
    @Order(1)
    public SecurityFilterChain SecurityFilterChain3(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/StudentDashboard/**")).permitAll();
                    auth.requestMatchers("/TeacherDashboard/**").permitAll();
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/Registration")).permitAll();
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/style.css")).permitAll();
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/Login")).permitAll();
                    auth.requestMatchers("/LoginT").permitAll();
                    auth.requestMatchers("/Fileserror").permitAll();
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/StudentD")).authenticated();
                    auth.requestMatchers("/TeacherD").authenticated();
                    auth.requestMatchers("/RegistrationT").permitAll();
                    auth.requestMatchers("/LogoutT").permitAll();
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/Logout")).permitAll();
                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/saveMsg")).permitAll();
//                    auth.anyRequest().authenticated();
                }
        ).formLogin().loginPage("/Login")
//                .defaultSuccessUrl("/StudentD")
//                .failureUrl("/Login?error=true").permitAll()
//                .and().logout().logoutSuccessUrl("/Login?logout=true").invalidateHttpSession(true).permitAll()
                .and().build();


    }
//    @Bean
//    @Order(2)
//    public SecurityFilterChain SecurityFilterChain2(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(auth -> {
////                            auth.requestMatchers("/StudentDashboard/**").permitAll();
//                     auth.requestMatchers("/TeacherDashboard/**").permitAll();
////                            auth.requestMatchers("/Registration").permitAll();
//                           auth.requestMatchers("/style.css").permitAll();
////                            auth.requestMatchers("/Login").permitAll();
//                     auth.requestMatchers("/LoginT").permitAll();
////                            auth.requestMatchers("/StudentD").authenticated();
//                     auth.requestMatchers("/TeacherD").authenticated();
//                     auth.requestMatchers("/RegistrationT").permitAll();
//                     auth.requestMatchers("/LogoutT").permitAll();
////                            auth.requestMatchers("/Logout").permitAll();
////                            auth.requestMatchers("/saveMsg").permitAll();
//////                    auth.anyRequest().authenticated();
//////                    auth.anyRequest().authenticated();
//                        }
//                ).build();
////                .formLogin().loginPage("/LoginT")
////                .defaultSuccessUrl("/TeacherD")
////                .failureUrl("/LoginT?error=true").permitAll()
////                .and().logout().logoutSuccessUrl("/LoginT?logout=true").invalidateHttpSession(true).permitAll()
////                .and().build();
//    }


    @Bean
    public InMemoryUserDetailsManager userDetailsService1() {

        UserDetails student = User.withDefaultPasswordEncoder()
                .username("harshal")
                .password("Harshal@123")
                .roles("STUDENT")
                .build();
        UserDetails teacher = User.withDefaultPasswordEncoder()
                .username("123456")
                .password("Harshal@123")
                .roles("TEACHER")
                .build();
        return new InMemoryUserDetailsManager(student,teacher);
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