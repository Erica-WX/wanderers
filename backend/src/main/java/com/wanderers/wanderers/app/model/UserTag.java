package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    //外键
    @OneToOne
    @JoinColumn(name = "id")
    private Users user;

    @OneToOne
    @JoinColumn(name = "tid")
    private Tag tag;

    public UserTag(int delFlag, Users user, Tag tag) {
        this.delFlag = delFlag;
        this.user = user;
        this.tag = tag;
    }
}
