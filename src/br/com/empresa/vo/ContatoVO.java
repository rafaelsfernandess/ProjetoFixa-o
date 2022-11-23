package br.com.empresa.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name = "SICONTAT")
public class ContatoVO implements Serializable{
	
	private static final long serialVersionUID = 1380485615590240803L;
	
	
	//Código;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "id",nullable = false)
	@SequenceGenerator(name = "SQ_SICONTAT", sequenceName = "SQ_SICONTAT", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ_SICONTAT")
	private BigInteger id;
	
	
	//Nome do contato;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 200)
	@Column(name = "nomcon", nullable = false, length = 100)
	private String nomcon;
	
	
	//Local, evento ou grau de parentesco;
	@Column(name = "refere", length = 500)
	private String refere;
		
	@Column(name = "datnas")
	@Temporal(TemporalType.TIMESTAMP)
	//Data de nascimento;
	private Date datnas;

	public ContatoVO() {
		super();
	}

	public ContatoVO(BigInteger id) {
		super();
		this.id = id;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getNomcon() {
		return nomcon;
	}

	public void setNomcon(String nomcon) {
		this.nomcon = nomcon;
	}

	public String getRefere() {
		return refere;
	}

	public void setRefere(String refere) {
		this.refere = refere;
	}

	public Date getDatnas() {
		return datnas;
	}

	public void setDatnas(Date datnas) {
		this.datnas = datnas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContatoVO other = (ContatoVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
