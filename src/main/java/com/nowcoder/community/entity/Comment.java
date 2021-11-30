package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {

    private int id;
    private int userId;
    private int entityType;  //实体类型，比如帖子、帖子下的评论、课程
    private int entityId;    //某个实体类型的具体指向目标
    private int targetId;    //帖子指向的某个人
    private String content;  //评论
    private int status;      //状态 0正常 1拉黑
    private Date createTime;
}
