package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {

    private int id;
    private int fromId;   //1代表系统用户
    private int toId;
    private String conversationId;  //双方会话ID
    private String content;
    private int status;  //0未读、1一读、2删除
    private Date createTime;
}
