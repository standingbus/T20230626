package com.yedam.member.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yedam.common.Controller;
import com.yedam.member.service.MemberService;
import com.yedam.member.service.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;

public class MemberInfoControl implements Controller {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//"loginId"
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("loginId");
		
		//service(getMember) mapper(select) jsp 등록
		MemberService service = new MemberServiceImpl();
//		service.getMember(id);
		MemberVO member = service.getMember(id);
//		member.setUserAddr("대구 중구");
//		member.setUserPhone("010-2923-9494");
//		member.setUserId("user99");
//		member.setUserName("서지원");
//		member.setUserBirth(new Date());
//		member.setUserImg("다운로드5.jpg");
		
		req.setAttribute("info", member);
		
		
		req.getRequestDispatcher("WEB-INF/jsp/member/memberInfo.jsp").forward(req, resp);
	}

}
