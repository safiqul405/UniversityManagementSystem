package com.spring.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.INoticeController;
import com.spring.main.entity.Notice;
import com.spring.main.service.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController implements INoticeController {

	@Autowired
	NoticeService noticeService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("notice/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		noticeService.save(request);
		return new ModelAndView("notice/create");
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable String id) {
		Notice n = noticeService.getNoticeById(id);		
		return new ModelAndView("notice/edit","n",n);
	}

	@Override
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		noticeService.update(request);
		List<Notice> nList = noticeService.getAll();
		return new ModelAndView("notice/view","nList",nList);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		noticeService.delete(id);
		List<Notice> nListd = noticeService.getAll();
		return new ModelAndView("notice/view","nListd",nListd);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Notice> nList = noticeService.getAll();
		return new ModelAndView("notice/view","nList",nList);
	}
	
	@GetMapping("/viewS")
	public ModelAndView getAlls() {
		List<Notice> nList = noticeService.getAllByStudentPrivilege();
		return new ModelAndView("sNotice/view","nList",nList);
	}
	@GetMapping("/viewF")
	public ModelAndView getAllF() {
		List<Notice> nList = noticeService.getAllByFacultyPrivilege();
		return new ModelAndView("fNotice/view","nList",nList);
	}
}
