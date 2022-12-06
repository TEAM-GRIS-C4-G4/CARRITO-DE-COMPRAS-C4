package com.unab.g04sql.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="roles_users")
public class Roles_users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "usuario_id", nullable = false)
	private Users usuarioId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "rol_id", nullable = false)
	private Roles rolId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
