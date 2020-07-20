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
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;

    private String name;

    @Column(columnDefinition = "int default'0'")
    private int delFlag;

    public Tag(String name, int delFlag) {
        this.name = name;
        this.delFlag = delFlag;
    }
}
