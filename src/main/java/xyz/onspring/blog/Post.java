package xyz.onspring.blog;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data // ①
@Entity
public class Post {

	@Id
	@GeneratedValue
	int id;

	String title;
	String name;
	String content;
	Date createdAt;
}
