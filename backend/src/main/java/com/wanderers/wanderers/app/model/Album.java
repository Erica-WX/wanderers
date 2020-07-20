package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.app.dao.AlbumRepository;
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
public class Album{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;
    private String name;
    private String avatarUrl;
    private int like;

    private int delFlag;

    //外键
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user;
    @ManyToOne
    @JoinColumn(name = "bid")
    private Band band;
    @OneToOne
    @JoinColumn(name = "tid")
    private Tag tag;

    public Album(String name, String avatarUrl, int like, int delFlag, Users user, Band band, Tag tag) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.like = like;
        this.delFlag = delFlag;
        this.user = user;
        this.band = band;
        this.tag = tag;
    }
}
