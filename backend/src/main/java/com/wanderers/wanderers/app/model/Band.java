package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;
    private String name;
    private String avatarUrl;
    private String introduction;
    private int followerNum;

    private int delFlag;

    //外键
    @OneToOne
    @JoinColumn(name = "id")
    private Users leader;

    public Band(String name, String avatarUrl, String introduction, int followerNum, int delFlag, Users leader) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.introduction = introduction;
        this.followerNum = followerNum;
        this.delFlag = delFlag;
        this.leader = leader;
    }

}
