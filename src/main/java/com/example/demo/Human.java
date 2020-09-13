package com.example.demo;

import java.util.List;

import javax.validation.constraints.NotBlank;

public class Human {

	@NotBlank
	public Member member;
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public List<Member> members;

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}
}
