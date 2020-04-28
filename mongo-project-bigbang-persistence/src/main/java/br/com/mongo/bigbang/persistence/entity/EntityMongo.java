package br.com.mongo.bigbang.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.mongodb.lang.NonNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
public abstract class EntityMongo implements Serializable {

	@Id
	private String id;

	@CreatedDate
	@NonNull
	private Date createdDate;

	@LastModifiedDate
	private Date lastModifiedDate;

	public EntityMongo() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NonNull
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(@NonNull Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		EntityMongo that = (EntityMongo) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "EntityMongo{" + "id='" + id + '\'' + ", createdDate=" + createdDate + ", lastModifiedDate="
				+ lastModifiedDate + '}';
	}

}
