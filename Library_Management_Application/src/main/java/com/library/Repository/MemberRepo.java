package com.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Member;

public interface MemberRepo extends JpaRepository<Member, Integer> {

}
