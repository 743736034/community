package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //实现查用户主页发布帖子的功能，也可以直接查首页，这时候不需要userId；动态SQL
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    //用动态SQL时在<if>里使用，如果方法只传入一个参数，这时必须要加@Param，否则会报错
    //@Param是用于给参数取别名的
    int selectDiscussPostRows(@Param("userId") int userId);

}
