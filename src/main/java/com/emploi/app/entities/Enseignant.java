package com.emploi.app.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import com.emploi.app.SeanceComparator;

@Entity
@Table(name="Enseignant")
public class Enseignant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
Long id_Ens;
	@Column
String nom;
	@OneToMany(mappedBy="enseignant", fetch = FetchType.EAGER)
	@Cascade(value = { CascadeType.DELETE, CascadeType.SAVE_UPDATE })
	private Collection<Seance> seances;
	public List<Seance> getSeances() {
		Collections.sort((List <Seance>)seances,new SeanceComparator());
		return (List <Seance>)this.seances;
	}
public Long getId() {
	return id_Ens;
}
public void setId(Long id) {
	this.id_Ens = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Enseignant(Long id, String nom) {
	this.id_Ens=id;
	this.nom=nom;
}
public Enseignant( String nom) {
	this.nom=nom;
}
public Enseignant() {
}
}
