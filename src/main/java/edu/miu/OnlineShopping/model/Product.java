package edu.miu.OnlineShopping.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private LocalDate manufacturedDate;
	private LocalDate expiredDate;
	private double price;
	private int quantity;

}
