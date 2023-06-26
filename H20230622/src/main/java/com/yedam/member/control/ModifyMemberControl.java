package com.yedam.member.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Controller;
import com.yedam.member.service.MemberService;
import com.yedam.member.service.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;

public class ModifyMemberControl implements Controller {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//id, phone , addr
		
		//service(modifyMember) // mapper(update)게시글 목록이동// jsp전송
		
		String id = req.getParameter("id");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		
		System.out.println(id);
		MemberService service = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		member.setUserId(id);
		member.setUserPhone(phone);
		member.setUserAddr(addr);
		
		if(service.ModifyMember(member)) {
			resp.sendRedirect("boardList.do");
		}else{
			resp.sendRedirect("modifyMember.do");
		}
//		if(member != null) {
//			resp.sendRedirect("boardList.do");
//		} else {
//			resp.sendRedirect("modifyMember.do");
//		}
	}

}
