package com.skdjq.community.dao;

import com.skdjq.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    // 动态sql  userId可有可无
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit") int limit);

    // 查询一共有多少数据
    int selectDiscussPostRows(@Param("userId") int userId);
}
