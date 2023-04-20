package com.multi.travel;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class CourseController {
	
	@Autowired
	CourseDAO dao; 
	
	@RequestMapping("insert")
	public void insert(CourseVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
	}

	@RequestMapping("update")
	public void update(CourseVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println(id);
		CourseVO vo= dao.one(id);
		model.addAttribute("vo", vo);
		//view아래까지 전달할 데이터를 model개체를를 이용하여 속성으로 지정
	}
	
	
	@RequestMapping("list")
	public void list( Model model) {
		List<CourseVO> list= dao.list();
		//views아래까지 전달할 데이터를 model객체를 이용해서
		//속성으로 지정해주세요.
		model.addAttribute("list", list);
		
	}
}