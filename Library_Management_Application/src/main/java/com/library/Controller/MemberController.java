package com.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.Entity.Member;
import com.library.Service.MemberService;

@RestController
@RequestMapping(value = "/members")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@PostMapping
	public ResponseEntity<Member> addMember(@RequestBody Member member){
		return new ResponseEntity<Member>(memberService.addMember(member) , HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Member>> viewAllMember(){
		return new ResponseEntity<List<Member>>(memberService.viewAllMember(), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Member> updateMember(@RequestBody Member member){
		return new ResponseEntity<Member>(memberService.updateMember(member) , HttpStatus.OK);
	}
}
