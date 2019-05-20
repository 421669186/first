package com.service.impl;

import com.dao.PaperDao;
import com.pojo.Paper;
import com.service.PaperService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author lcy
 * @version V1.0
 * @Package com.service.impl
 * @date 2019/5/17 15:18
 * @Copyright © 华据
 */
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDao paperDao;

    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return paperDao.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return paperDao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperDao.queryAllPaper();
    }
}
