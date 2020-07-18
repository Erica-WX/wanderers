package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Musician extends BaseModel{

    private String mscnName;
    private String mscnHome;
    private String mscnAvatar;
    private String mscnIntr;
    private int mscnFollows;
    private int mscnViews;
    private int mscnListens;
    private int mscnDownloads;

    private Band band;

}
