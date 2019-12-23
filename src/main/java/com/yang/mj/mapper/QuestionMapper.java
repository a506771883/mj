package com.yang.mj.mapper;

import com.sun.tracing.dtrace.ModuleAttributes;
import com.yang.mj.Entity.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    @Insert("insert into (title.description,gmt_create,gmt_modified,creator,tag) values(#{title},#{description}," +
            "#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);
}
