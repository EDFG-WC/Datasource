package com.digitalbase.datasource.beans.business;

import lombok.Data;

/**
 * @author Alex
 */
@Data public class ParamsBean {
    // 必须属性

    private String dsName;
    private int port;
    private String taskId;
    private String baseName;

    private String para1;
    private int para2;
}
