package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Music extends BaseModel{
    private int mscID;
    private String mscName;
    private String mscAvatar;
    private String mscIntr;
    private int mscListens;
    private int mscDownloads;
    private int mscPrices;
    private List<Tag> tagList;
    private int del_Flag;
    private String mscSrc;

    private List<Musician> musicianList;
    private Album album;
    private Band band;
}
