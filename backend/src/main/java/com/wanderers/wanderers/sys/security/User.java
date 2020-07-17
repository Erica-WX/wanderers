package com.wanderers.wanderers.sys.security;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.lang.Long;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel implements UserDetails {

    private Long id;
    private String username;
    private String password;
    private int status;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){return  null;}

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public int getStatus() {return this.status;}

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled(){
        return  "0".equals(this.delFlag);
    }



}
