package com.wanderers.wanderers.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Albums{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;

    //@Column(columnDefinition = "varchar(36) default'佚名'")
    private String name;
    private String avatarUrl;

    //@Column(columnDefinition = "int default'0'")
    private int like;

    //@Column(columnDefinition = "int default'0'")
    private int delFlag;

    //外键
    @NotNull
    @ManyToOne(cascade={CascadeType.MERGE}, fetch= FetchType.EAGER)
    @JoinColumn(name="uid")
    private Users user;

    /*@NotNull
    @ManyToOne(cascade={CascadeType.MERGE}, fetch= FetchType.EAGER)
    @JoinColumn(name="bid")
    private Band band;*/

    /*@ManyToOne(cascade={CascadeType.MERGE}, fetch= FetchType.EAGER)
    @JoinColumn(name = "tid")
    private Tag tag;*/


    public Albums(String name, String avatarUrl, int like, int delFlag, Users user) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.like = like;
        this.delFlag = delFlag;
        this.user = user;
    }

}
