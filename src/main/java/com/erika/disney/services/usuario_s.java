package com.erika.disney.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.erika.disney.models.usuario_m;
import com.erika.disney.repositories.usuario_r;

import java.util.List;

@Service
public class usuario_s implements UserDetailsService{

    @Autowired
    private usuario_r us;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        usuario_m usuario = us.findByName(username);

        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));

        UserDetails udet = new User(usuario.getName(), usuario.getPassword(), roles );
        return udet;
    }
    
}
