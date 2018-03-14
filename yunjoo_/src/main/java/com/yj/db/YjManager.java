package com.yj.db;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yj.vo.BoardVo;

public class YjManager {

	static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/yj/db/MapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<BoardVo> listBoard() {
		// TODO Auto-generated method stub
		SqlSession session = factory.openSession();
		List<BoardVo> list = session.selectList("listBoard");
		session.close();
		return list;
	}
	
}
