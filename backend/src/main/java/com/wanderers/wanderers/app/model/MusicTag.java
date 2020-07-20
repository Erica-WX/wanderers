package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MusicTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    //外键
    @OneToOne
    @JoinColumn(name = "mid")
    private Music music;

    @OneToOne
    @JoinColumn(name = "tid")
    private Tag tag;

    public MusicTag(int delFlag, Music music, Tag tag) {
        this.delFlag = delFlag;
        this.music = music;
        this.tag = tag;
    }
}
