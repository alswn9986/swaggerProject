package com.example.sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class BasicController {
    @PostMapping("/api/member")
    @ApiOperation(value = "사용자 목록 조회", notes = "가입된 사용자 목록을 조회합니다.")
    public List<String> getMemberList() {
    	List<String> memberList = Arrays.asList("anna", "tom", "grace");
        return memberList;
    }

    @GetMapping("/api/member/{id}")
    @ApiOperation(value = "사용자 조회", notes = "ID로 사용자를 조회합니다.")
    public String getMemberById(@PathVariable("id") String id) {
    	List<String> memberList = Arrays.asList("anna", "tom", "grace");
    	return memberList.stream()
    			.filter(item -> item.equals(id))
    			.findAny()
    			.orElse(null);
    }
}