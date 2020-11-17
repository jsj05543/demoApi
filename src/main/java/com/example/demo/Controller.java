package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@Validated
public class Controller {

    @RequestMapping(value = "/human")
    public String all() {
	List<Member> memberList = new ArrayList<>() ;
	Human human = setHuman();
	List<Member> members = human.getMembers();
	for (Member member : members) {
	memberList.add(member);
	}
	String allData  = setListJson(memberList);
	return allData;
    }
    
    @RequestMapping(value = "/human/{contry}")
    public String findContry(@PathVariable String contry) {
	
	List<Member> memberList = new ArrayList<>() ;
	Human human = setHuman();
	List<Member> members = human.getMembers();
	for (Member member : members) {
	    if(contry.equals(member.getContry())) {
		memberList.add(member);
	    }
	}
	String data  = setListJson(memberList);
	return data;
    }
    
    @RequestMapping(value = "/human/{contry}/{name}")
    public String findName(@PathVariable String contry,@PathVariable String name) {
	List<Member> memberList = new ArrayList<>() ;
	Human human = setHuman();
	List<Member> members = human.getMembers();
	for (Member member : members) {
	    if(contry.equals(member.getContry()) && name.equals(member.getName())) {
		memberList.add(member);
	    }
	}
	String data  = setListJson(memberList);
	return data;
    }
    
    private String setListJson(List<Member> memberList) {
	String json = null;
	ObjectMapper mapper = new ObjectMapper();
	try {
	    json = mapper.writeValueAsString(memberList);
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}
	return json;
    }

    private Human setHuman() {
	Human human = new Human();
	List<Member> members = new ArrayList<>();
	Member member1 = new Member();
	member1.setName("KIN");
	member1.setAge(35);
	member1.setContry("CHINA");
	member1.setSex("F");

	Member member2 = new Member();
	member2.setName("BAI");
	member2.setAge(32);
	member2.setContry("JAPAN");
	member2.setSex("M");
	
	Member member3 = new Member();
	member3.setName("BAO");
	member3.setAge(32);
	member3.setContry("JAPAN");
	member3.setSex("M");
	members.add(member1);
	members.add(member2);
	members.add(member3);
	
	Member member4 = new Member();
	member4.setName("BAO1");
	member4.setAge(32);
	member4.setContry("JAPAN");
	member4.setSex("M");
	
	members.add(member1);
	members.add(member2);
	members.add(member3);
	members.add(member4);
	

	human.setMembers(members);

	return human;
    }

}
