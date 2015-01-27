package de.fnordeingang.fnordcash.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TC_BEITRAG")
public class Fee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long nhid;
	private Date gueltig_von;
	private Date gueltig_bis;
	private String name;
	
	protected Fee() {}
	
	@Override
  public String toString() {
    return String.format("Beitrag[id=%d, nhid=%d, name='%s']", id, nhid, name);
  }
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNhid() {
		return nhid;
	}

	public void setNhid(long nhid) {
		this.nhid = nhid;
	}

	public Date getGueltig_von() {
		return gueltig_von;
	}

	public void setGueltig_von(Date gueltig_von) {
		this.gueltig_von = gueltig_von;
	}

	public Date getGueltig_bis() {
		return gueltig_bis;
	}

	public void setGueltig_bis(Date gueltig_bis) {
		this.gueltig_bis = gueltig_bis;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
