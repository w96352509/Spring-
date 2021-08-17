package com.study.spring;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.reflect.*;
import com.study.spring.case04.Person;

public class JsonDBTest {

	public static void main(String[] args) throws Exception {
		//得到檔案位置
		Path path = Paths.get("src/main/java/com/study/spring/case04/person.json");
		//將檔案讀成列表
		List<String> list =Files.readAllLines(path);
		//讀檔
		//List合併String部分
		String json = list.stream().collect(Collectors.joining());
		System.out.println(json);
		//寫檔
		//轉成List<Parson>
		//取得Gson
		Gson gson = new Gson();
		//得到Array的型態(集合性資料對Gson的處理)
		Type type =  new TypeToken<ArrayList<Person>>() {}.getType();
		//準備一個Gson的集合EX:people
		List<Person> people=gson.fromJson(json, type);
		System.out.println(people);
		//新增person in people
		Person person = new Person();
		person.setName(new Faker().pokemon().name());
		person.setAge(new Random().nextInt(100)+1);
		person.setBirDate(new Faker().date().birthday());
		people.add(person);
		System.out.println(peoplee);
		
		//將people集合 回存到 Person.json
		json=gson.toJson(people);
		Files.write(path,json.getBytes("utf-8"));
		
		
		

	}

}
