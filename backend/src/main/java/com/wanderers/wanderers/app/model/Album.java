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
public class Album extends BaseModel{

    private int albumID;
    private String albumName;
    private String albumAvatar;
    private String albumIntr;
    private int albumListens;
    private int albumDownloads;

    private List<Music> musicList;
    private Musician musician;
    private Band band;
}
