package com.multi.travel;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Component
public class CourseDAO { 
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(CourseVO bag) {
		my.insert("course.create", bag);
	}
	
	public void delete(String id) {
		int result =my.delete("course.del", id);
		System.out.println(result);
	}	
	
	public void update(CourseVO bag) {
		int result =my.update("course.up", bag);
		System.out.println(result);
	}
	
	public CourseVO one(String id) {
		CourseVO vo = my.selectOne("course.one", id);
		System.out.println(vo);
		return vo;
	}

	public List<CourseVO> list() {
		List<CourseVO> list = my.selectList("course.all");
		System.out.println(list.size());
		return list;
	}
}