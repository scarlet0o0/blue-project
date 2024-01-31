package com.rainbow.blue.mapper;

import com.rainbow.blue.vo.PostVo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PostMapper {
    //@Select("select * from post")
    List<PostVo> AllList();

}
