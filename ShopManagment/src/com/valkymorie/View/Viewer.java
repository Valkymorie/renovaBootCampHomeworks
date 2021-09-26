package com.valkymorie.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import com.valkymorie.Model.Company;
import com.valkymorie.Model.Customer;
import com.valkymorie.Model.Hardware;
import com.valkymorie.Model.Individual;
import com.valkymorie.Model.Manual;
import com.valkymorie.Model.Order;
import com.valkymorie.Model.OrderItem;
import com.valkymorie.Model.Product;
import com.valkymorie.Model.Software;

public class Viewer {
	
	JFrame mainFrame;
	JFrame secondFrame;
	static List<Customer> customerList = new ArrayList<Customer>();
	static List<Order> orderList = new ArrayList<Order>();
	static List<Product> productList = new ArrayList<Product>();
	static List<OrderItem> orderItemList = new ArrayList<OrderItem>();
	
	
	public void configurations() {  // ANA SAYFA 
				
		
		mainFrame =new JFrame("Anasayfa");	
		mainFrame.setSize(700,700);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JButton customerAddButton = new JButton("Customer Ekle");
		customerAddButton.setName("Customer");
		customerAddButton.setBounds(290, 250, 120, 40);
		mainFrame.getContentPane().add(BorderLayout.CENTER, customerAddButton);	
		
		JButton orderButton = new JButton("Order Ekle");
		orderButton.setName("Order");
		orderButton.setBounds(290, 300, 120, 40);
		mainFrame.getContentPane().add(BorderLayout.CENTER, orderButton);	
		
		JButton productButton = new JButton("Product Ekle");
		productButton.setName("Product");
		productButton.setBounds(290, 350, 120, 40);
		mainFrame.getContentPane().add(BorderLayout.CENTER, productButton);	
		
		
		
		//mainframe.add(BorderLayout.PAGE_START,button);
		//mainFrame.add(BorderLayout.CENTER, textField);
		
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
				
		
		customerAddButton.addActionListener(new ActionListener() {
			
			@Override  // CUSTOMER OPTIONS SAYFASINA GIDER
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				mainFrame.setVisible(false);				
				secondFrame = new JFrame(customerAddButton.getName()+" sayfasi");
				customerAddPage();
							
			}
		});
		
		orderButton.addActionListener(new ActionListener() { // ORDER LISTESINE GIDER
			
			@Override  // 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				mainFrame.setVisible(false);				
				secondFrame = new JFrame(orderButton.getName()+" sayfasi");
				orderAddPage();
							
			}
		});

		
		productButton.addActionListener(new ActionListener() {
	
			@Override  // CUSTOMER OPTIONS SAYFASINA GIDER
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				mainFrame.setVisible(false);				
				secondFrame = new JFrame(productButton.getName()+" sayfasi");
				productAddPage();
					
			}
		});
			
	
	}
	
	public void productAddPage() {   // PRODUCT EKLEME SAYFASI HARDWARE, MANUAL, SOFTWARE
		
		secondFrame.setTitle("Product Ekleme sayfasi");
		
		secondFrame.setSize(700,700);
		secondFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		JButton backButton = new JButton("Geri");
		backButton.setBounds(50, 600, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, backButton);
		
		JButton addButton = new JButton("Ekle");
		addButton.setBounds(600, 600, 60, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, addButton);
		
		JRadioButton hardwareButton=new JRadioButton("Hardware");
		hardwareButton.setBounds(50, 50, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_START, hardwareButton);
		
		JRadioButton manualButton=new JRadioButton("Manual");
		manualButton.setBounds(150, 50, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_START, manualButton);

		JRadioButton softwareButton=new JRadioButton("Software");
		softwareButton.setBounds(250, 50, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_START, softwareButton);
		
		JTextField descriptionField = new JTextField("Description input...");
		descriptionField.setBounds(60,100, 140, 30);
		descriptionField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, descriptionField);
		
		JTextField idField = new JTextField("ID input...");
		idField.setBounds(60,150, 140, 30);
		idField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, idField);
		
		JTextField nameField = new JTextField("Name input...");
		nameField.setBounds(60,200, 140, 30);
		nameField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, nameField);
		
		JTextField retailPriceField = new JTextField("Retail Price input...");
		retailPriceField.setBounds(60,250, 140, 30);
		retailPriceField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, retailPriceField);
		
		JTextField licenseField = new JTextField("License input...");
		licenseField.setBounds(60,300, 140, 30);
		licenseField.setVisible(false);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, licenseField);
		
		JTextField warrantyPeriodField = new JTextField("Warranty Period input...");
		warrantyPeriodField.setBounds(60,300, 160, 30);
		warrantyPeriodField.setVisible(false);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, warrantyPeriodField);
		
		JTextField publisherField = new JTextField("Publisher input...");
		publisherField.setBounds(60,300, 140, 30);
		publisherField.setVisible(false);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, publisherField);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(softwareButton);
		buttonGroup.add(manualButton);
		buttonGroup.add(hardwareButton);
		
		hardwareButton.addActionListener(new ActionListener() {  // HARDWARE INPUT PRODUCT GOSTERIR
			
			@Override
			public void actionPerformed(ActionEvent e) { // warrantyPeriod
				// TODO Auto-generated method stub
				
				if(hardwareButton.isSelected()) {
					publisherField.setVisible(false);
					licenseField.setVisible(false);
					warrantyPeriodField.setVisible(true);		
				}
				
			}
		});
		
		softwareButton.addActionListener(new ActionListener() {  // HARDWARE INPUT PRODUCT GOSTERIR
			
			@Override
			public void actionPerformed(ActionEvent e) { //license
				// TODO Auto-generated method stub
				
				if(softwareButton.isSelected()) {
					publisherField.setVisible(false);
					warrantyPeriodField.setVisible(false);
					licenseField.setVisible(true);						
				}
			}
		});
		
		manualButton.addActionListener(new ActionListener() {  // HARDWARE INPUT PRODUCT GOSTERIR
			
			@Override
			public void actionPerformed(ActionEvent e) {  // publisher
				// TODO Auto-generated method stub
				
				if(manualButton.isSelected()) {
					warrantyPeriodField.setVisible(false);
					licenseField.setVisible(false);
					publisherField.setVisible(true);					
				}
				
			}
		});
		
		descriptionField.addFocusListener(new FocusListener() {  //DESCRIPTION INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(descriptionField.getText().equals(""))
					descriptionField.setText("Description input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(descriptionField.getText().equals("Description input..."))
					descriptionField.setText("");
			}
		});
		
		idField.addFocusListener(new FocusListener() {  //ID INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(idField.getText().equals(""))
					idField.setText("ID input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(idField.getText().equals("ID input..."))
					idField.setText("");
			}
		});
		
		nameField.addFocusListener(new FocusListener() {  //NAME INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(nameField.getText().equals(""))
					nameField.setText("Name input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(nameField.getText().equals("Name input..."))
					nameField.setText("");
			}
		});
		
		retailPriceField.addFocusListener(new FocusListener() {  //RETAIL PRICE INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(retailPriceField.getText().equals(""))
					retailPriceField.setText("Retail Price input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(retailPriceField.getText().equals("Retail Price input..."))
					retailPriceField.setText("");
			}
		});
		
		licenseField.addFocusListener(new FocusListener() {  //LICENSE INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(licenseField.getText().equals(""))
					licenseField.setText("License input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(licenseField.getText().equals("License input..."))
					licenseField.setText("");
			}
		});
		
		warrantyPeriodField.addFocusListener(new FocusListener() {  //WARRANTY PERIOD INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(warrantyPeriodField.getText().equals(""))
					warrantyPeriodField.setText("Warranty Period input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(warrantyPeriodField.getText().equals("Warranty Period input..."))
					warrantyPeriodField.setText("");
			}
		});
		
		publisherField.addFocusListener(new FocusListener() {  //PHONE INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(publisherField.getText().equals(""))
					publisherField.setText("Publister input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(publisherField.getText().equals("Publisher input..."))
					publisherField.setText("");
			}
		});


		
		
		
		
		secondFrame.setLayout(null);
		secondFrame.setVisible(true);
		
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(hardwareButton.isSelected() && !warrantyPeriodField.getText().equals("Warranty Period input...")) {
					productList.add(new Hardware(descriptionField.getText(), Integer.parseInt(idField.getText()), nameField.getText(), Double.parseDouble(retailPriceField.getText()), Integer.parseInt(warrantyPeriodField.getText()))); 
				}else if(softwareButton.isSelected() && !licenseField.getText().equals("Warranty Period input...")) {
					productList.add(new Software(descriptionField.getText(), Integer.parseInt(idField.getText()), nameField.getText(), Double.parseDouble(retailPriceField.getText()), licenseField.getText()));
				}else if(manualButton.isSelected() && !publisherField.getText().equals("Warranty Period input...")) {
					productList.add(new Manual(descriptionField.getText(), Integer.parseInt(idField.getText()), nameField.getText(), Double.parseDouble(retailPriceField.getText()), publisherField.getText()));
				}else {
					System.out.println("BOS KALAN KISIMLARI DOLDURUNUZ");
				}
				
			}
		});
		
		backButton.addActionListener(new ActionListener() {
			
			@Override  // ANASAYFAYA GIDER
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondFrame.getContentPane().removeAll();
				secondFrame.setVisible(false);
				mainFrame.setVisible(true);
			}
		});


	}

	public void orderAddPage() {  //ORDER ITEMLARI LISTESI GOZUKUR
		
		if(customerList.size()== 0) {
			customerList.add(new Company("add", 1, "name1", "phone1", "cont1", 1));
			customerList.add(new Individual("add2", 2, "name2", "phone2", "licenseNumber1"));		
		}
		
		if(productList.size() ==0) {
			productList.add(new Hardware("des1", 1, "name1", 5, 3));
			productList.add(new Manual("des2", 2, "name2", 6, "pub1"));
			productList.add(new Software("des3", 3, "name3", 7, "lic1"));
		}
		

		String[] column = {"des","price"};
		
		secondFrame.setTitle("Order List sayfasi");

		secondFrame.setSize(700,700);
		secondFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		
		JButton backButton = new JButton("Geri");
		backButton.setBounds(50, 600, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, backButton);
		
		JButton listButton = new JButton("Order Listele");
		listButton.setBounds(500, 600, 140, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, listButton);
		
		
		
		DefaultTableModel tableModel = new DefaultTableModel(column,0);				
		JTable orderListTable = new JTable(tableModel);
		
		
		orderListTable.setBounds(100, 100, 300, 300);
		
		for(int i =0; i<productList.size(); i++) {
			
			String description = productList.get(i).getDescription();
			double price = productList.get(i).getRetailPrice();
			Object[] data = {description, price};
			
			tableModel.addRow(data);
		}
		
		secondFrame.getContentPane().add(BorderLayout.CENTER, orderListTable);
		
		secondFrame.setLayout(null);
		secondFrame.setVisible(true);
		
		orderListTable.setRowSelectionAllowed(true);
		ListSelectionModel selectModel = orderListTable.getSelectionModel();
		selectModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		selectModel.addListSelectionListener(new ListSelectionListener() { //LISTEDEN ITEM AL
			
			@Override
			public void valueChanged(ListSelectionEvent e) {   // ORDER ITEM ICIN LISTEYE ITEM EKLE, SONRA ITEM LISTESINI ORDER LISTESINE EKLE
				// TODO Auto-generated method stub
				orderItemList.add(new OrderItem(1, productList.get(e.getFirstIndex()), 3));
				orderList.add(new Order(customerList.get(0), 1, orderItemList, new Date(1), 1));
				
				//System.out.println(orderList.get(0).getItems().get(0).getUnitPrice());
			}
		});
		
		backButton.addActionListener(new ActionListener() {  // ANASAYFAYA GIDER
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondFrame.getContentPane().removeAll();
				secondFrame.setVisible(false);
				
				mainFrame.setVisible(true);
			}
		});
		
		listButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				secondFrame.getContentPane().removeAll();
				secondFrame.setVisible(false);
				
				secondFrame.setVisible(true);
				showOrderPage();
			}
		});
		
		
	}
	
	public void showOrderPage() { // ORDER LISTELEME SAYFASI
		
			secondFrame.setTitle("Customer List sayfasi");
			
			if(orderList.size() == 0) {
				orderList.add(new Order(customerList.get(0), 1, orderItemList, new Date(1), 1));
			}

			secondFrame.setSize(700,700);
			secondFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			
			JButton backButton = new JButton("Geri");
			backButton.setBounds(50, 600, 100, 30);
			secondFrame.getContentPane().add(BorderLayout.PAGE_END, backButton);
			
			String[] column = {"Customer","id", "orderItem", "orderDate"};
			
			DefaultTableModel tableModel = new DefaultTableModel(column, 0); // 0 column OLACAK
			JTable orderListTable = new JTable(tableModel);
			
			orderListTable.setBounds(100, 100, 300, 300);
			
			for (int i = 0; i < orderList.size(); i++) {
				
				String customerName = orderList.get(i).getCustomer().getName();
				int id = orderList.get(i).getId();
				String orderItemDescription = orderList.get(i).getItems().get(0).getProduct().getDescription();
				Date date = orderList.get(i).getOrderDate();
				
				Object[] data = {customerName, id, orderItemDescription, date};
				tableModel.addRow(data);
			}
			
			secondFrame.getContentPane().add(BorderLayout.CENTER, orderListTable);
			
			secondFrame.setLayout(null);
			secondFrame.setVisible(true);
			
			backButton.addActionListener(new ActionListener() {  // ORDERITEM LIST SAYFASINA GIDER
				
				@Override 
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					secondFrame.getContentPane().removeAll();
					secondFrame.setVisible(false);
				
					secondFrame.setVisible(true);
					orderAddPage();
				}
			});
		
	}

	public void customerAddPage() {  //CUSTOMER ADD VE LISTELEME SAYFASINA  GIDER
		
		secondFrame.setTitle("Customer giris sayfasi");
		
		secondFrame.setSize(700,700);
		secondFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		JButton backButton = new JButton("Geri");
		backButton.setBounds(50, 600, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, backButton);

		JButton customerAddButton = new JButton("Yeni Customer");
		customerAddButton.setBounds(200, 100, 150, 30);
		customerAddButton.setName("Yeni Customer");
		secondFrame.getContentPane().add(BorderLayout.CENTER, customerAddButton);
		
		JButton customerListButton = new JButton("Cutomerlari Listele");
		customerListButton.setBounds(200, 200, 150, 30);
		customerListButton.setName("Customer List");
		secondFrame.getContentPane().add(BorderLayout.CENTER, customerListButton);
		
		secondFrame.setLayout(null);
		secondFrame.setVisible(true);
		
		backButton.addActionListener(new ActionListener() {
			
			@Override  // ANASAYFAYA GIDER
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondFrame.getContentPane().removeAll();
				secondFrame.setVisible(false);
				mainFrame.setVisible(true);
			}
		});
		
		customerListButton.addActionListener(new ActionListener() {
			
			@Override  // YENI CUSTOMER EKLEME SAYFASINA GIDER
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondFrame.getContentPane().removeAll();
				secondFrame.setTitle(customerListButton.getName() +" sayfasi");
				secondFrame.setVisible(false);
				
				secondFrame.setVisible(true);
				showCustomerPage();
			}
		});
		
		customerAddButton.addActionListener(new ActionListener() {
			
			@Override  // YENI CUSTOMER EKLEME SAYFASINA GIDER
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondFrame.getContentPane().removeAll();
				secondFrame.setTitle(customerAddButton.getName() +" sayfasi");
				secondFrame.setVisible(false);
				
				secondFrame.setVisible(true);
				addCustomer();
			}
		});
			
		
	}
	
	public void showCustomerPage() { // CUSTOMER LISTELEME SAYFASI
		
		secondFrame.setTitle("Customer List sayfasi");

		secondFrame.setSize(700,700);
		secondFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		JButton backButton = new JButton("Geri");
		backButton.setBounds(50, 600, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, backButton);
		
		String[] column = { "address",  "id", "name", "phone"};
		
		DefaultTableModel tableModel = new DefaultTableModel(column,0); // 0  column OLACAK
		JTable customerListTable = new JTable(tableModel);
		
		customerListTable.setBounds(100, 100, 300, 300);
		
		for(int i =0; i< customerList.size(); i++) {
			String address = customerList.get(i).getAddress();
			int id = customerList.get(i).getId();
			String name = customerList.get(i).getName();
			String phone = customerList.get(i).getPhone();
			
			Object[] data = {address, id, name, phone};
			tableModel.addRow(data);
		}
		
		secondFrame.getContentPane().add(BorderLayout.CENTER, customerListTable);
		
		secondFrame.setLayout(null);
		secondFrame.setVisible(true);
		
		
		backButton.addActionListener(new ActionListener() {  // Customer SELECTION SAYFASINA GIDER
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondFrame.getContentPane().removeAll();
				secondFrame.setVisible(false);
			
				secondFrame.setVisible(true);
				customerAddPage();
			}
		});
		
	}

	public void addCustomer() {  // YENI CUSTOMER
		
		
		
		JRadioButton companyButton=new JRadioButton("Company");
		companyButton.setBounds(50, 50, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_START, companyButton);
		
		JRadioButton individualButton=new JRadioButton("Individual");
		individualButton.setBounds(150, 50, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_START, individualButton);
		
		JTextField contactField = new JTextField("Contact input...");
		contactField.setBounds(60,300, 140, 30);
		contactField.setVisible(false);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, contactField);
		
		JTextField licenseNumberField = new JTextField("License Number input...");
		licenseNumberField.setBounds(60,300, 160, 30);
		licenseNumberField.setVisible(false);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, licenseNumberField);
		
		JTextField discountField = new JTextField("Discount input...");
		discountField.setBounds(60,350, 140, 30);
		discountField.setVisible(false);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, discountField);

		
		JTextField addressField = new JTextField("Address input...");
		addressField.setBounds(60,100, 140, 30);
		addressField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, addressField);
		
		JTextField nameField = new JTextField("Name input...");
		nameField.setBounds(60,150, 140, 30);
		nameField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, nameField);
		
		JTextField idField = new JTextField("ID input...");
		idField.setBounds(60,200, 140, 30);
		idField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, idField);
		
		JTextField phoneField = new JTextField("Phone input...");
		phoneField.setBounds(60,250, 140, 30);
		phoneField.setVisible(true);
		secondFrame.getContentPane().add(BorderLayout.LINE_START, phoneField);
		
		
		
		
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(individualButton);
		buttonGroup.add(companyButton);
		
		companyButton.addActionListener(new ActionListener() { // COMPANY  CUSTOMER INPUT GOSTERIR
			
			@Override
			public void actionPerformed(ActionEvent arg0) { // contact discount
				// TODO Auto-generated method stub
				if(companyButton.isSelected()) {
					licenseNumberField.setVisible(false);
					contactField.setVisible(true);
					discountField.setVisible(true);
					
				}
			}
		});
		
		individualButton.addActionListener(new ActionListener() { // INDIVIDIAL  CUSTOMER INPUT GOSTERIR
			
			@Override
			public void actionPerformed(ActionEvent e) { // license number
				// TODO Auto-generated method stub
				if(individualButton.isSelected()) {
					contactField.setVisible(false);
					discountField.setVisible(false);
					licenseNumberField.setVisible(true);					
				}
			}
		});
		
		
		licenseNumberField.addFocusListener(new FocusListener() {  //CONTACT INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(licenseNumberField.getText().equals(""))
					licenseNumberField.setText("License Number input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(licenseNumberField.getText().equals("License Number input..."))
					licenseNumberField.setText("");
			}
		});
		
		discountField.addFocusListener(new FocusListener() {  //CONTACT INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(discountField.getText().equals(""))
					discountField.setText("Discount input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(discountField.getText().equals("Discount input..."))
					discountField.setText("");
			}
		});
		
		contactField.addFocusListener(new FocusListener() {  //CONTACT INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(contactField.getText().equals(""))
				contactField.setText("Contact input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(contactField.getText().equals("Contact input..."))
					contactField.setText("");
			}
		});
		
		addressField.addFocusListener(new FocusListener() {  //ADDRESS INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(addressField.getText().equals(""))
					addressField.setText("Address input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(addressField.getText().equals("Address input..."))
					addressField.setText("");
			}
		});
		
		nameField.addFocusListener(new FocusListener() {  //NAME INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(nameField.getText().equals(""))
					nameField.setText("Name input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(nameField.getText().equals("Name input..."))
					nameField.setText("");
			}
		});
		
		idField.addFocusListener(new FocusListener() {  //ID INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(idField.getText().equals(""))
					idField.setText("ID input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(idField.getText().equals("ID input..."))
					idField.setText("");
			}
		});
		
		phoneField.addFocusListener(new FocusListener() {  //PHONE INPUT 
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if(phoneField.getText().equals(""))
					phoneField.setText("Phone input...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(phoneField.getText().equals("Phone input..."))
					phoneField.setText("");
			}
		});
			


		JButton backButton = new JButton("Geri");
		backButton.setBounds(50, 600, 100, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, backButton);
		
		JButton addButton = new JButton("Ekle");
		addButton.setBounds(600, 600, 60, 30);
		secondFrame.getContentPane().add(BorderLayout.PAGE_END, addButton);
		
		
		
		addButton.addActionListener(new ActionListener() {  // LISTELERE NESNE EKLENMESI YAPILAN YER
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(companyButton.isSelected() && !idField.getText().equals("ID input...") && !phoneField.getText().equals("Phone input...") ) {
				customerList.add(new Company(addressField.getText(), Integer.parseInt(idField.getText()), nameField.getText(), phoneField.getText(), discountField.getText(), Integer.parseInt(discountField.getText())));							
				}else if(individualButton.isSelected() && !idField.getText().equals("ID input...") && !phoneField.getText().equals("Phone input...")) {
				customerList.add(new Individual(addressField.getText(), Integer.parseInt(idField.getText()), nameField.getText(), phoneField.getText(), licenseNumberField.getText()));
				}else {
					System.out.println("BOS KALAN KISIMLARI DOLDURUNUZ");
				}				
			}
		});
		
		backButton.addActionListener(new ActionListener() {  // CUSTOMER OPTIONS SAYFASINA GIDER
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				secondFrame.getContentPane().removeAll();
				secondFrame.setVisible(false);		
				
				secondFrame.setVisible(true);
				customerAddPage();
			}
		});

	}
	
	
	
	
	
	

}
