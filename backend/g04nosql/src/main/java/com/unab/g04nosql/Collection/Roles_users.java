package com.unab.g04nosql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Roles_users")
public class Roles_users {
	
	@Id
    private String id;

	@DBRef
	private Users usuarioId;
	
	@DBRef
	private Roles rolId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Users getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Users usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Roles getRolId() {
		return rolId;
	}

	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}
	
}
