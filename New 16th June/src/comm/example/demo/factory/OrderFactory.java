package comm.example.demo.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import comm.example.demo.model.Order;
import comm.example.demo.service.OrderService;
import comm.example.demo.service.OrderServiceImpl;

public class OrderFactory {
	
	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
    private File file;
    private static Scanner scanner=new Scanner(System.in);
    private final String fileName;
    
    {
    	fileName="order.ser";
    	
    	try 
    	{
    		file = new File(fileName);
    		fileOutputStream = new FileOutputStream(file);
    		objectOutputStream = new ObjectOutputStream(fileOutputStream);
    	} catch (Exception e) {
    		e.printStackTrace();
    	  }
  
    }
    public void saveOrder(List<Order> list) throws IOException {
    	objectOutputStream.writeObject(list);
    	System.out.println("Order saved successfully");
    }
    public List<Order> displayAllOrders() throws ClassNotFoundException, IOException {
    	fileInputStream=new FileInputStream(file);
    	objectInputStream=new ObjectInputStream(fileInputStream);
    	List<Order> orders=(List<Order>) objectInputStream.readObject();
    	return orders;
    }
}