package comm.example;

import java.util.*;
import java.io.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString



public class Account {
	
	private String accountID;
	private String accountHolderName;
	private double balance;
	private String addressline1;
	private String addressline2;
	enum city
	{
		MUMBAI, CHENNAI, KOLKATA, HYDERABAD;
	}
	private Address address(String addressline1, String addressline2)
	{
		city c1=city.CHENNAI;
	    city c2=city.HYDERABAD;
	    city c3=city.KOLKATA;
	    city c4=city.MUMBAI;
	}
	
	
	enum accountType
	{
		SAVINGS, CREDIT_CARD, LOAN, CURRENT;
	}
    
	public int deposit()
	{
		accountType a1=accountType.SAVINGS;
		accountType a2=accountType.CREDIT_CARD;
		accountType a3=accountType.LOAN;
		accountType a4=accountType.CURRENT;
		return a1+a4;
		
	}
	public int withdraw()
	{
		accountType a1=accountType.SAVINGS;
		accountType a2=accountType.CREDIT_CARD;
		accountType a3=accountType.LOAN;
		accountType a4=accountType.CURRENT;
		return a1-a3;
	}
	

}