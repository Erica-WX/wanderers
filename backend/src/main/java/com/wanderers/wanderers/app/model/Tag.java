package com.wanderers.wanderers.app.model;

import com.wanderers.wanderers.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Tag extends BaseModel{
    private int tagID;
//    private int mscID;
//    private int mscnID;
//    private int bandID;
    private int tagNum;
}
