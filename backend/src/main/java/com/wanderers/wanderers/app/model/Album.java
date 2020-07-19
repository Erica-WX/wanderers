package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.app.dao.AlbumRepository;
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
public class Album{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;
    private String name;
    private String avatarUrl;
    private int like;

    private int delFlag;

    //外键
    private Long userId;
    private Long bandId;
    private Long tagId;

    public Album(String name, String avatarUrl, int like, int delFlag, Long userId, Long bandId, Long tagId) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.like = like;
        this.delFlag = delFlag;
        this.userId = userId;
        this.bandId = bandId;
        this.tagId = tagId;
    }
}
