package com.rafaelcardoso.springsecurityfundamentals.security;

import com.rafaelcardoso.springsecurityfundamentals.models.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
