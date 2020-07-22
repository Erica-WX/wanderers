package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;

    //@Column(columnDefinition = "varchar(36) default'佚名'")
    private String name;
    private String avatarUrl;
    private String introduction;
    private int followerNum;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    //外键
    /*@OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "leader_id")

    private Users leader;*/
    private int leaderId;

    public Band(String name, String avatarUrl, String introduction, int followerNum, int delFlag, int leaderId) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.introduction = introduction;
        this.followerNum = followerNum;
        this.delFlag = delFlag;
        this.leaderId = leaderId;
    }

    public Band() {
        this.bid = (long)1;
        this.name = "name";
        this.avatarUrl = "avatarUrl";
        this.introduction = "introduction";
        this.followerNum = 0;
        this.delFlag = 0;
        this.leaderId = 1;
    }
}
