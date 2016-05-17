package com.twist.springBoot;

import com.twist.springBoot.config.AuthorSettings;
import com.twist.springBoot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Application {

	/*@Value("${author}")
	private String author;
	@Value("${date}")
	private String date;*/

	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping("/")
	String index(Model model) {
//		return "author:" + author + ";in date: " + date + ".";
//		return "author:" + authorSettings.getAuthor() + ";in date: " + authorSettings.getDate() + ".";
		Person single = new Person("aa",11);

		List<Person> people = new ArrayList<>();
		Person p1 = new Person("xx",11);
		Person p2 = new Person("yy",12);
		Person p3 = new Person("zz",13);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson",single);
		model.addAttribute("people", people);
		return "index";

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
