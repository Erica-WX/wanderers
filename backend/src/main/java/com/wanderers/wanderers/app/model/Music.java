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
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
    private String musicUrl;
    private String avatarUrl;

    //@Column(columnDefinition = "varchar(36) default'未知曲目'")
    private String name;
    private int likeNum;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    //外键
    @ManyToOne
    @JoinColumn(name = "aid")
    private Album album;

    public Music(String musicUrl, String avatarUrl, String name, int likeNum, int delFlag, Album album) {
        this.musicUrl = musicUrl;
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.likeNum = likeNum;
        this.delFlag = delFlag;
        this.album = album;
    }
}
