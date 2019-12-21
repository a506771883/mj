package com.yang.mj.mj.Entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String account;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
