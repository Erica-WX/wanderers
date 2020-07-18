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
public class Band extends BaseModel{
    private int bandID;
    private String bandName;
    private String bandAvatar;
    private String bandIntr;
    private int bandFollows;
    private int bandViews;
    private int bandListens;
    private int Downloads;

    private List<Musician> musicianList;
    private List<Music> musicList;
}
