package com.yj.yunjoo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yj.dao.BoardDao;

@Controller
public class YjController {

	@Autowired
	private BoardDao dao;

	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listBoard.do")
	public ModelAndView listBoard()
	{
		ModelAndView view = new ModelAndView();
		List list = dao.listBoard();
		view.addObject("list", list);
		return view;
	}
}
