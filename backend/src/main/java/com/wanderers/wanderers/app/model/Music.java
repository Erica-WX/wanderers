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
public class Music extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
    private String musicUrl;
    private String avatarUrl;
    private String name;
    private int likeNum;

    private int delFlag;

    //外键
    private Long albumId;

    public Music(String musicUrl, String avatarUrl, String name, int likeNum, Long albumId) {
        this.musicUrl = musicUrl;
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.likeNum = likeNum;
        this.albumId = albumId;
    }
}
