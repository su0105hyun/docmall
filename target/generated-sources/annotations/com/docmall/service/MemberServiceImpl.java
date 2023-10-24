package com.docmall.service;

import com.docmall.mapper.MemberMapper;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {
	// 자동주입
	// @RequiredArgsConstructor : memberMapper필드를 매개변수로 하는 생성자메소드가 생성된
	private final MemberMapper memberMapper;
	/*
	private MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	*/
}
