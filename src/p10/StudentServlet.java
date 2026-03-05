package com.servlet;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;

import java.io.IOException;
import java.util.*;

//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	 private static ArrayList<Student> students = new ArrayList<>();

	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

	        if (students.isEmpty()) {
	            res.getWriter().println("No records found");
//	            return;
	        }
	        else {
			        for (Student s : students) {
			            res.getWriter().println(
			                "id: " + s.id + " name: " + s.name + " age: " + s.age
			            );
			        }
	        }
	    }

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse res)
	            throws IOException {

//	        res.setContentType("text/plain");
//
//	        // IMPORTANT
//	        req.setCharacterEncoding("UTF-8");
//
//	        // DEBUG LINE (VERY IMPORTANT)
//	        System.out.println("POST METHOD HIT");

	        String idStr = req.getParameter("id");
	        String name = req.getParameter("name");
	        String ageStr = req.getParameter("age");

//	        // DEBUG VALUES
//	        System.out.println("id=" + idStr + ", name=" + name + ", age=" + ageStr);
//
//	        if (idStr == null || name == null || ageStr == null) {
//	            res.getWriter().println("POST DATA NOT RECEIVED");
//	            return;
//	        }

	        int id = Integer.parseInt(idStr);
	        int age = Integer.parseInt(ageStr);

	        students.add(new Student(id, name, age));
	        res.getWriter().println("Student added successfully");
	    }


	    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws IOException {

	        int id = Integer.parseInt(req.getParameter("id"));
	        String name = req.getParameter("name");
	        int age = Integer.parseInt(req.getParameter("age"));

	        for (Student s : students) {
	            if (s.id == id) {
	                s.name = name;
	                s.age = age;
	                break;
	            }
	        }

	        res.getWriter().println("Student updated");
	    }

	    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {

	        int id = Integer.parseInt(req.getParameter("id"));

	        students.removeIf(s -> s.id == id);

	        res.getWriter().println("Student deleted");
	    }
}
