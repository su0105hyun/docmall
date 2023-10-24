package com.docmall.controller;

import org.apache.tomcat.util.http.ResponseUtil;

import com.docmall.service.MemberService;
import com.docmall.service.RequiredArgsConstructor;

@RequiredArgsConstructor
@Log4j
@RequestMapping("/member/*")
@Controller // https://dev-coco.tistory.com/70
public class MemberController {
	
	private final MemberService memberservice;
	
	@GetMapping("/join")
	public void join() {
		
		log.info("called... join");
	}
	
	// 비동기 방식. ajax문법으로 호출.
	
	@GetMapping("idCheck")
	public ResponseEntity<String> idCheck(String mbsp_id) {
		
		log.info("아이디: " + mbsp_id);
		
		ResponseUtil<String> entity = null;
		
		// 서비스 메소드 호출구문작업.
		
		return entity;
	}
}
