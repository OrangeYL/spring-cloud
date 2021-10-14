package com.orange.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipment implements Serializable {

    private Long id;
    private String equipmentName;
    private String equipmentType;

}
