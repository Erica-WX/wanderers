package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AlbumTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int delFlag;

    //外键
    private Long albumId;
    private Long tagId;

    public AlbumTag(int delFlag, Long albumId, Long tagId) {
        this.delFlag = delFlag;
        this.albumId = albumId;
        this.tagId = tagId;
    }
}
