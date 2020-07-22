package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.app.dao.AlbumRepository;
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

    //@Column(columnDefinition = "varchar(36) default'佚名'")
    private String name;
    private String avatarUrl;

    @Column(columnDefinition = "int default'0'")
    private int likes;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    //外键
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH}, fetch= FetchType.EAGER)
    @JoinColumn(name = "id")
    private Users users;
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH}, fetch= FetchType.EAGER)
    @JoinColumn(name = "bid")
    private Band band;
    @OneToOne(cascade={CascadeType.MERGE,CascadeType.DETACH}, fetch= FetchType.EAGER)
    @JoinColumn(name = "tid")
    private Tag tag;

    public Album(String name, String avatarUrl, int likes, int delFlag, Users users, Band band, Tag tag) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.likes = likes;
        this.delFlag = delFlag;
        this.users = users;
        this.band = band;
        this.tag = tag;
    }

}
