package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Band extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;
    private String name;
    private String avatarUrl;
    private String introduction;
    private int followerNum;

    //外键
    private Long leaderId;

    public Band(String name, String avatarUrl, String introduction, int followerNum, Long leaderId) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.introduction = introduction;
        this.followerNum = followerNum;
        this.leaderId = leaderId;
    }
}
