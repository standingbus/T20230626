package com.yedam.common;

import java.util.List;

import com.yedam.board.persistence.BoardDAO;
import com.yedam.board.vo.BoardVO;

public class TestMain {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		
		BoardVO brd = new BoardVO();
		brd.setBrdContent("내용테스트입니다21");
//		brd.setBrdWriter("newbie");
		brd.setBrdNo(4);
		brd.setBrdTitle("제목테스트21");
		
		if(dao.selectBoard(brd.getBrdNo()) != null){
			System.out.println("조회성공..");
		}
		
		List<BoardVO> list = dao.boardList();
		for(BoardVO vo : list) {
			System.out.println(vo.toString());
		}
	}
}
