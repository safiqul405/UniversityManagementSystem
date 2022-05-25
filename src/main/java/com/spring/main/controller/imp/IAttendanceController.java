package com.spring.main.controller.imp;

import org.springframework.web.servlet.ModelAndView;

import com.spring.main.common.ICommonController;

public interface IAttendanceController extends ICommonController {

	ModelAndView getStudentByCode();

}
