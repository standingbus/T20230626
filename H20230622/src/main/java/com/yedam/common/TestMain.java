package com.yedam.common;

import java.util.List;

import com.yedam.board.persistence.BoardDAO;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;

public class TestMain {
	public static void main(String[] args) {
		BoardService service = new BoardServiceMybatis();
//		BoardVO vo = new BoardVO();
//		
//		
//		vo.setBrdTitle("홍규요미통팥츄");
//		vo.setBrdWriter("홍준표");
//		vo.setBrdContent("홍구리당당");
		PageDTO dto = new PageDTO(3, service.totalCnt());
		System.out.println(dto);
		
		}
	}

