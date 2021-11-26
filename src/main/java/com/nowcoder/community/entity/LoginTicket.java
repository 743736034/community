package com.nowcoder.community.entity;

import lombok.Data;
import java.util.Date;

@Data
public class LoginTicket {

    private int id;
    private int userId;
    private String ticket;
    private int status;  //0有效 1过期
    private Date expired; //过期时间
}
