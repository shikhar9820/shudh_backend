package com.shudh.application.dao;

import java.util.List;

public interface Dao {

	public Object getEntityById(Integer entityId);
	public List<Object> getAllEntities(Integer start, Integer count);
	public Object updateEntity(Object entity);
	public void deleteEntity(Object entity);
	public Object createEntity(Object entity);
	
}
