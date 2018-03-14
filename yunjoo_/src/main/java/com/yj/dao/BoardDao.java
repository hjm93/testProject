package com.yj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yj.db.YjManager;
import com.yj.vo.BoardVo;

@Repository
public class BoardDao {

	public static List<BoardVo> listBoard() {
		// TODO Auto-generated method stub
		return YjManager.listBoard();
	}

}
