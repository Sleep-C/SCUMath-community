package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Picture;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface PictureMapper {

    int insertPicture(Picture picture);
    int updateFather(int id,int fatherid,int fathertype);
    int deleteByFather(int fatherid,int fathertype);
    int deleteById(int id);
    Picture selectBySaveName(String savename);
    List<Picture> selectByType(int fathertype);
    List<Picture> selectByFather(int fatherid,int fathertype);
    List<Picture> selectByTime(Date date1, Date date2);
}
