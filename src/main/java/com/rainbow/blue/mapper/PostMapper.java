package com.rainbow.blue.mapper;

import com.rainbow.blue.vo.PostVo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
    List<PostVo> AllPostList();

    PostVo getPostById(Long id);

    void deleteById(Long id);
}
