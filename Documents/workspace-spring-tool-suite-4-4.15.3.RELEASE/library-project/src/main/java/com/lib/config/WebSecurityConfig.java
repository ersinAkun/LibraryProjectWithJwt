package com.lib.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.lib.security.AuthTokenFilter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	 
	@Autowired
	private UserDetailsService userDetailService;  // AllArgsCons   yazildigi icin injection olmus oldu
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.csrf().disable().  //method method rol vermek icin disable yapiyoruz
	    sessionManagement().
	    sessionCreationPolicy(SessionCreationPolicy.STATELESS).  //rest mimari stateless
		and().
		authorizeHttpRequests().
		antMatchers("/register","/login").permitAll().  //bunlarda authorize sorma
		anyRequest().authenticated();
	    
	    http.addFilterBefore(authTokenFilter(), UsernamePasswordAuthenticationFilter.class);
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
	}
	
	@Bean
	public AuthTokenFilter authTokenFilter() {
		
		return new AuthTokenFilter();
	}

	@Bean
	protected AuthenticationManager authenticationManager()throws Exception{
		return super.authenticationManager();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}





}
