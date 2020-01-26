package fr.rbo.elitapi.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Role {

	private static final Logger log = LoggerFactory.getLogger(Role.class);

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	private String role;
	
	public int getId() {
		return roleId;
	}
	public void setId(int id) {
		this.roleId = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
