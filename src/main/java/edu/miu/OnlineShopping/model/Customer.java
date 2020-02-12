package edu.miu.OnlineShopping.model;

import java.time.LocalDate;

import javax.persistence.Entity;
@Entity
public class Customer  extends User{
	private String name;
	private LocalDate purchaseDate;
	private int quantity;

}
