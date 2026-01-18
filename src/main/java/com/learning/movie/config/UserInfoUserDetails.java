package com.learning.movie.config;

import java.io.Serial;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

import com.learning.movie.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserInfoUserDetails implements UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities;

    public UserInfoUserDetails(User user) {

        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        this.username = user.getEmailId();
        this.password = user.getPassword();

        this.authorities = Arrays.stream(user.getRoles().split(","))
                .map(String::trim)
                .map(role -> role.startsWith("ROLE_")
                        ? role
                        : "ROLE_" + role)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    // --- Recommended defaults for JWT / Stateless apps ---

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
