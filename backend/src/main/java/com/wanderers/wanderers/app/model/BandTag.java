package com.wanderers.wanderers.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BandTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int delFlag;

    //外键
    @OneToOne
    @JoinColumn(name = "bid")
    private Band band;

    @OneToOne
    @JoinColumn(name = "tid")
    private Tag tag;

    public BandTag(int delFlag, Band band, Tag tag) {
        this.delFlag = delFlag;
        this.band = band;
        this.tag = tag;
    }
}
