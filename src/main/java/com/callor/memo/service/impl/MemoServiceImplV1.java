package com.callor.memo.service.impl;

import com.callor.memo.model.MemoVO;
import com.callor.memo.repository.MemoDao;
import com.callor.memo.service.MemoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memoServiceV1")
public class MemoServiceImplV1 implements MemoService {

    private final MemoDao memoDao;

    public MemoServiceImplV1(MemoDao memoDao) {
        this.memoDao = memoDao;
    }

    @Override
    public List<MemoVO> selectAll() {
        return memoDao.findAll();
    }

    @Override
    public MemoVO findById(Long m_seq) {
        return memoDao.findById(m_seq).get();
    }

    @Override
    public void insert(MemoVO memoVO) {
        memoDao.save(memoVO);

    }

    @Override
    public void update(MemoVO memoVO) {
        memoDao.save(memoVO);

    }

    @Override
    public void delete(Long m_seq) {
        memoDao.deleteById(m_seq);

    }

}
