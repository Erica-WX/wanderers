package com.wanderers.wanderers.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Long id;

    private String username;

    private String password;

    private int role;

    private String avatarUrl;

    private String introduction;

    private Long followerNum;

    @ManyToOne(cascade={CascadeType.MERGE}, fetch= FetchType.EAGER)
    @JoinColumn(name="bid") // 外键设置为f_id
    private Band band;

    public Users(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

}
