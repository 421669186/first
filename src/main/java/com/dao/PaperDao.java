package com.dao;

import com.pojo.Paper;

import java.util.List;

/**
 * @author lcy
 * @version V1.0
 * @Package com.dao
 * @date 2019/5/17 15:20
 * @Copyright © 华据
 */
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
