package com.qidian.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class NoteDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Object getNotes(){
		return jdbcTemplate.queryForList("SELECT * FROM t_note");
	}
	
	public Object getNoteById(long id){
		return jdbcTemplate.queryForMap("select * from t_note where id = "+id);
	}
	
	public Object getNotesByType(String type){
		return jdbcTemplate.queryForList("SELECT * FROM t_note where type = "+type);
	}
	
	public Object delNoteById(long id){
		try {
			jdbcTemplate.execute("delete from t_note where id = "+id);
		} catch (DataAccessException e) {
			return false;
		}
		return true;
	}
	
	public Object addNote(Map<String,Object> map){
		jdbcTemplate.update("insert into t_note (uuid,type,title,content,createAt,updateAt) values(?,?,?,?,?,?)",new Object[]{
				map.get("uuid"),
				map.get("type"),
				map.get("title"),
				map.get("content"),
				map.get("creatAt"),
				map.get("updateAt")
		});
		return true;
	}
	
	public Object updateNote(Map<String,Object> map){
		jdbcTemplate.update("update t_note set title=?, content=?,updateAt=? where id = ?",new Object[]{
				map.get("title"),
				map.get("content"),
				map.get("updateAt"),
				map.get("id")
		});
		return true;
	}
	
	public Object noteMark(int value,long id){
		jdbcTemplate.update("update t_note set mark=? where id = ?",new Object[]{value,id});
		return true;
	}
	
	public Object getNoteTypes(){
		return jdbcTemplate.queryForList("SELECT * FROM t_note_type");
	}
	
	public Object delNoteTypeById(long id){
		try {
			jdbcTemplate.execute("delete from t_note_type where id = "+id);
		} catch (DataAccessException e) {
			return false;
		}
		return true;
	}
	
	public Object getNoteTypeById(long id){
		return jdbcTemplate.queryForMap("select * from t_note_type where id = "+id);
	}
	
}
