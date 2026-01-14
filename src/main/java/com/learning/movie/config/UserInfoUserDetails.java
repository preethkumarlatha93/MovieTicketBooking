//package com.learning.movie.config;
//
//import java.io.Serial;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import com.learning.movie.entities.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//
//public class UserInfoUserDetails implements UserDetails {
//
//	@Serial
//    private static final long serialVersionUID = -8773921465190832995L;
//	private final String name;
//	private final String password;
//	private final List<GrantedAuthority> authorities;
//
//	public UserInfoUserDetails(User userInfo) {
//		name = userInfo.getEmailId();
//		password = userInfo.getPassword();
//		authorities = Arrays.stream(userInfo.getRoles().split(","))
//				.map(SimpleGrantedAuthority::new)
//				.collect(Collectors.toList());
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return authorities;
//	}
//
//	@Override
//	public String getPassword() {
//		return password;
//	}
//
//	@Override
//	public String getUsername() {
//		return name;
//	}
//
//}
