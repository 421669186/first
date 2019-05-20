package com.service;

import com.pojo.Paper;

import java.util.List;

/**
 * @author lcy
 * @version V1.0
 * @Package com.service
 * @date 2019/5/17 15:17
 * @Copyright © 华据
 */
public interface PaperService {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
