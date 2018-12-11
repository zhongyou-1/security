package com.qidian.server;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qidian.dao.NoteDao;

@Service
public class NoteService {

	@Autowired
	NoteDao noteDao;
	
	public Object getNoteAll(){
		return noteDao.getNotes();
	}
	
	public Object getNoteById(long id){
		return noteDao.getNoteById(id);
	}
	
	public Object getNotesByType(String type){
		return noteDao.getNotesByType(type);
	}
	
	public Object delNoteById(long id){
		return noteDao.delNoteById(id);
	}
	
	public Object updateNote(Map<String,Object> map){
		map.put("updateAt", new Date());
		return noteDao.updateNote(map);
	}
	
	public Object addNote(Map<String,Object> map){
		map.put("uuid", UUID.randomUUID().toString());
		map.put("createAt",new Date());
		map.put("updateAt", new Date());
		return noteDao.addNote(map);
	}
	
	public Object noteMark(int value,long id){
		return noteDao.noteMark(value,id);
	}
	
	public Object getNoteTypes(){
		return noteDao.getNoteTypes();
	}
	
	public Object delNoteTypeById(long id){
		return noteDao.delNoteTypeById(id);
	}
	
	public Object getNoteTypeById(long id){
		return noteDao.getNoteTypeById(id);
	}
	
}
