package com.qidian.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qidian.entity.comm.Result;
import com.qidian.entity.comm.Results;
import com.qidian.server.NoteService;

 


/**
 * 
 * @author tanjiaqiong
 * @time 20181207
 * 
 */

@RestController
@RequestMapping("/security")
public class NoteController {

	@Autowired
	private NoteService noteService;
	
	@RequestMapping("/notes")
	@ResponseBody
	public Result getNoteAll() {
		return Results.SUCCESS.build(noteService.getNoteAll());
	}
	
	@RequestMapping("/note/{id}")
	@ResponseBody
	public Result getNoteById(@PathVariable("id") long id) {
		return Results.SUCCESS.build(noteService.getNoteById(id));
	}
	
	@RequestMapping("/note")
	@ResponseBody
	public Result getNotesByType(@RequestParam("type")String type) {
		return Results.SUCCESS.build(noteService.getNotesByType(type));
	}
	
	@RequestMapping("/deleteNote/{id}")
	@ResponseBody
	public Result delNoteById(@PathVariable("id") long id) {
		return Results.SUCCESS.build(noteService.delNoteById(id));
	}
	
	@RequestMapping(value = "/updateNote", method = {RequestMethod.PUT})
	@ResponseBody
    public Result updateNote(@RequestBody Map<String, Object> map){
		return Results.SUCCESS.build(noteService.updateNote(map));
    }
	
	@RequestMapping(value = "/addNote", method = {RequestMethod.POST})
	@ResponseBody
    public Result addNote(@RequestBody Map<String,Object> map){
		return Results.SUCCESS.build(noteService.addNote(map));
    }
	
	@RequestMapping("/note/mark")
	@ResponseBody
	public Result noteMark(@RequestParam(value="value",defaultValue="0")int value,@RequestParam("id") long id) {
		return Results.SUCCESS.build(noteService.noteMark(value,id));
	}
	
	
	@RequestMapping("/note/types")
	@ResponseBody
	public Result getNoteTypes() {
		return Results.SUCCESS.build(noteService.getNoteTypes());
	}
	
	@RequestMapping("/note/deleteType/{id}")
	@ResponseBody
	public Result delNoteTypeById(@PathVariable("id") long id) {
		return Results.SUCCESS.build(noteService.delNoteTypeById(id));
	}
	
	@RequestMapping("/note/type/{id}")
	@ResponseBody
	public Result getNoteTypeById(@PathVariable("id") long id) {
		return Results.SUCCESS.build(noteService.getNoteTypeById(id));
	}
	
}
