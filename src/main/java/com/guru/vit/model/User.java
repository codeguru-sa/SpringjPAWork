package com.guru.vit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="users")
public class User {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name="username")
		private String uname;
		
		@Column(name="password")
		private String password;
		
		@Column(name="email")
		private String email;
		
		
	
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", uname=" + uname + ", password=" + password + ", email=" + email + "]";
		}
		
}
