//package ylu6.org.servermonitor.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//@Configuration
//@EnableWebSecurity
//public class BasicSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
////    private static final String ENCODED_PASSWORD = "$2a$10$cA8yjRU0/P8JBc5pQAxIn.z10zTqkd/j.Om4hqJoJfz8G0qC2r2dC";
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        PasswordEncoder passwordEncoder = passwordEncoder();
////        String ENCODED_PASSWORD = passwordEncoder.encode("sllyq");
//
//        auth.inMemoryAuthentication()
//                .withUser("yeqing").password("sllyq").roles("ADMIN", "USER");
//
////                .passwordEncoder(passwordEncoder())
////                .withUser("yeqing").password(passwordEncoder().encode("sllyq")).roles("ADMIN", "USER");
//    }
//
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http
////                .authorizeRequests()
////                .anyRequest()
////                .authenticated()
////                .and()
////                .httpBasic();
//
//        http
//                .authorizeRequests()
//                .antMatchers("/**").permitAll()
////                .antMatchers("/api/admin/**").permitAll()
////                .antMatchers("/api/admin/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
////        formLogin().permitAll();
//    }
//}
