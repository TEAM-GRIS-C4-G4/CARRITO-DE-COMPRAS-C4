package com.unab.g04nosql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Roles_permissions")
public class Roles_permissions {
	
	@Id
    private String id;
	
	@DBRef
	private Roles rolId;
	
	@DBRef
	private Permissions permisoId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Roles getRolId() {
		return rolId;
	}

	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}

	public Permissions getPermisoId() {
		return permisoId;
	}

	public void setPermisoId(Permissions permisoId) {
		this.permisoId = permisoId;
	}
}
