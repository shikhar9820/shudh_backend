package com.shudh.application.service;

import java.util.List;

import com.shudh.application.model.ShudhUser;

public interface ShudhUserService {

	public List<ShudhUser> getAllShudhUser();
	public ShudhUser getShudhUserById(Integer userId);
	public ShudhUser createShudhUser(ShudhUser shudhUser);
	public ShudhUser updateShudhUSer(ShudhUser shudhUser);
	public ShudhUser deleteShudhUser(ShudhUser shudhUser);
	public List<ShudhUser> getAllShudhUser(Integer start, Integer end);
	
}
