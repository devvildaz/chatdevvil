package edu.devvildaz.chatdevvil.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity

import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.web.server.SecurityWebFilterChain

@EnableWebFluxSecurity
class SecurityConfiguration {
    /*
    @Bean
    fun springWebFilterChain(http: ServerHttpSecurity) : SecurityWebFilterChain {
        http.
                authorizeExchange { authorize ->
                    authorize.anyExchange().authenticated()
                }.formLogin(Customizer.withDefaults())

        return http.build()
    }
    */

    @Bean
    fun userDetailsService() : MapReactiveUserDetailsService {
        var user : UserDetails = User.withDefaultPasswordEncoder()
            .username("user2")
            .password("password")
            .roles("USER", "ADMIN")
            .build()

        return MapReactiveUserDetailsService(user)
    }
}