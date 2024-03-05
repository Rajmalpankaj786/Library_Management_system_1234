package com.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Member;
import com.library.Exception.NotFoundException;
import com.library.Repository.MemberRepo;

@Service
public class MemberService {

	@Autowired
	private MemberRepo memberRepo;
	
	public Member addMember(Member member) {
		return memberRepo.save(member);
	}
	
	public List<Member> viewAllMember(){
		return memberRepo.findAll();
	}
	
	public Member updateMember(Member member) {
		Optional<Member> mem = memberRepo.findById(member.getMemberId());
		if(mem.get() != null) {
			return memberRepo.save(member);
		}
		
		throw new NotFoundException("given member id : " + mem.get() +"does't exist");
	}
}
