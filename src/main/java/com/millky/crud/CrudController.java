package com.millky.crud;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrudController {

	@Autowired
	NoteDao noteDao;

	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("noteList", noteDao.findAll());
		return "hello";
	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(Note note) {
		note.setCreatedAt(new Date());
		note.setUpdateAt(LocalDateTime.now());
		noteDao.save(note);
		return "redirect:/";
	}

	@RequestMapping("/{id}/delete")
	public String delete(@PathVariable int id) {
		noteDao.delete(id);
		return "redirect:/";
	}
}
