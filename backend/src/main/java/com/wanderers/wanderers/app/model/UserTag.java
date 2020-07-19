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
public class UserTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int delFlag;

    //外键
    private Long userId;
    private Long bandId;
    private Long tagId;

    public UserTag(int delFlag, Long userId, Long bandId, Long tagId) {
        this.delFlag = delFlag;
        this.userId = userId;
        this.bandId = bandId;
        this.tagId = tagId;
    }
}
