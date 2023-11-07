package com.deean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-06 23:37
 * FileName: src/main/java/com/deean/pojo
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Detail {
    private int detailId;
    private String stuAddress;
    private String stuTel;
    private String stuDesc;
    private String stuNum;
}
