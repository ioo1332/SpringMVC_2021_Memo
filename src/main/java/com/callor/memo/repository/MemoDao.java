package com.callor.memo.repository;

import com.callor.memo.model.MemoVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoDao extends JpaRepository<MemoVO, Long> {
}
