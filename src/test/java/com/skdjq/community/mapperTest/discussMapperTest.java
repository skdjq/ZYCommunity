package com.skdjq.community.mapperTest;

import com.skdjq.community.CommunityApplication;
import com.skdjq.community.dao.DiscussPostMapper;
import com.skdjq.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class discussMapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void selectPostsTest() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for(DiscussPost post : list) {
            System.out.println(post);
        }
        int count = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(count);
    }
}
