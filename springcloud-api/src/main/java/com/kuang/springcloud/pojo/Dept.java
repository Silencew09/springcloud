package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Silence_w
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptNum;

    private String deptName;

    private String db_source;

    public Dept(String deptName){
        this.deptName = deptName;
    }

}
