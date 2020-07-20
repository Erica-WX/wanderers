package com.wanderers.wanderers.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Long id;

    private String username;

    private String password;

    @Column(columnDefinition = "int default'1'")
    private int role;

    @Column(columnDefinition = "varchar(255) default ''")
    private String avatarUrl;

    @Column(columnDefinition = "varchar(255) default ''")
    private String introduction;

    @Column(columnDefinition = "int default'0'")
    private int followerNum;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST}, fetch= FetchType.EAGER)
    @JoinColumn(name="bid",columnDefinition = "bigint default 1") // 外键设置为f_id
    private Band band;

    public Users(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Users(String username, String password, int role, String avatarUrl, String introduction, int followerNum, int delFlag, Band band) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.avatarUrl = avatarUrl;
        this.introduction = introduction;
        this.followerNum = followerNum;
        this.delFlag = delFlag;
        this.band = band;
    }

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
