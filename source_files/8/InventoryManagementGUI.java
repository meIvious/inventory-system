package InventorySystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.util.List;

import InventorySystem.InventorySystem;
import InventorySystem.Item;
import InventorySystem.Order;
import InventorySystem.Provider;



public class InventoryManagementGUI {
	InventorySystem myInventory = new InventorySystem();
	Order myOrder = new Order();
	
	Provider myProvider = new Provider();
    private JFrame frame;
    private JTextArea textArea;

    public InventoryManagementGUI() {
        initialize();
    }

    public void showAddServiceDialog() {
    	
		
        JTextField nameField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField quantityField = new JTextField();

        Object[] message = {
                "Name:", nameField,
                "Price:", priceField,
                "Quantity:", quantityField
        };
        String serviceType = JOptionPane.showInputDialog(null,
                "Enter service type (1. Item / 2. Streaming / 3. Food Delivery):",
                "Service Type", JOptionPane.INFORMATION_MESSAGE);
       
                String itemName = nameField.getText();
                double itemPrice = Double.parseDouble(priceField.getText());
                int itemQuantity = Integer.parseInt(quantityField.getText());

                
                if (serviceType != null) {
                    switch (serviceType) {
                        case "1":
                            // Handle item type (Physical/Digital)
                            String itemType = JOptionPane.showInputDialog(null,
                                    "Enter item type (Physical/Digital):", "Item Type", JOptionPane.INFORMATION_MESSAGE);

                            if (itemType != null) {
                                if (itemType.equalsIgnoreCase("Digital")) {
                                    // Handle DigitalItem
                                    double diskSpace = Double.parseDouble(JOptionPane.showInputDialog(null,
                                            "Enter disk space:", "Digital Item", JOptionPane.INFORMATION_MESSAGE));

                                    DigitalItem digItem = new DigitalItem(itemName, itemPrice, itemQuantity, diskSpace);
                                    // Call a method in your InventorySystem to add the item
                                    // Example: myInventory.addItem(digItem);
                                    // Display a success message
                                    JOptionPane.showMessageDialog(null, "Digital item added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                } else if (itemType.equalsIgnoreCase("Physical")) {
                                    // Handle PhysicalItem
                                    double width = Double.parseDouble(JOptionPane.showInputDialog(null,
                                            "Enter width:", "Physical Item", JOptionPane.INFORMATION_MESSAGE));
                                    double length = Double.parseDouble(JOptionPane.showInputDialog(null,
                                            "Enter length:", "Physical Item", JOptionPane.INFORMATION_MESSAGE));
                                    double height = Double.parseDouble(JOptionPane.showInputDialog(null,
                                            "Enter height:", "Physical Item", JOptionPane.INFORMATION_MESSAGE));

                                    PhysicalItem phyItem = new PhysicalItem(itemName, itemPrice, itemQuantity, width, length, height);
                                    // Call a method in your InventorySystem to add the item
                                    // Example: myInventory.addItem(phyItem);
                                    // Display a success message
                                    JOptionPane.showMessageDialog(null, "Physical item added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Invalid item type.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            break;

                        case "2":
                        	String title = JOptionPane.showInputDialog(null, "Enter title:", "Streaming Service", JOptionPane.INFORMATION_MESSAGE);
                            String category = JOptionPane.showInputDialog(null, "Enter category:", "Streaming Service", JOptionPane.INFORMATION_MESSAGE);
                            double perDay = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter cost per day:", "Streaming Service", JOptionPane.INFORMATION_MESSAGE));
                            int days = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter days:", "Streaming Service", JOptionPane.INFORMATION_MESSAGE));

                            Streaming streamItem = new Streaming();
                            myOrder.addStream(title, category, perDay, days);
                            JOptionPane.showMessageDialog(null, "Streaming service added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case "3":
                        	String foodName = JOptionPane.showInputDialog(null, "Enter food name:", "Food Delivery Service", JOptionPane.INFORMATION_MESSAGE);
                            String restaurantName = JOptionPane.showInputDialog(null, "Enter restaurant name:", "Food Delivery Service", JOptionPane.INFORMATION_MESSAGE);
                            double mealPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter meal price:", "Food Delivery Service", JOptionPane.INFORMATION_MESSAGE));
                            int foodCount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter food count:", "Food Delivery Service", JOptionPane.INFORMATION_MESSAGE));

                            FoodDelivery foodItem = new FoodDelivery();
                            myOrder.addFood(foodName, restaurantName, mealPrice, foodCount);
                            JOptionPane.showMessageDialog(null, "Food delivery service added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Invalid service type.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }
            } 

        
    public void showAddOrderDialog() {
        JTextField serviceNameField = new JTextField();
        JTextField quantityField = new JTextField();

        Object[] message = {
                "Service Name:", serviceNameField,
                "Quantity:", quantityField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Add Order", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String serviceName = serviceNameField.getText();
            int quantity;

            try {
                quantity = Integer.parseInt(quantityField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the service exists in the inventory
            if (!myInventory.serviceExists(serviceName)) {
                JOptionPane.showMessageDialog(null, "Service not found in the inventory.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the quantity is valid
            if (quantity <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity must be greater than 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the requested quantity is available in the inventory
            if (myInventory.getQuantity(serviceName) < quantity) {
                JOptionPane.showMessageDialog(null, "Insufficient quantity in the inventory.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            
            myOrder.addItemGUI(serviceName, quantity);
            JOptionPane.showMessageDialog(null, "Order added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void initialize() {
    	InventorySystem myInventory = new InventorySystem();
    	Order myOrder = new Order();
		Provider myProvider = new Provider();
        frame = new JFrame("Online Shop Inventory Management System");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        JMenu inventoryMenu = new JMenu("Inventory");
        menuBar.add(inventoryMenu);
        
        /*showAddServiceDialog();*/

        JMenuItem addServiceMenuItem = new JMenuItem("Add Service");
        inventoryMenu.add(addServiceMenuItem);

        JMenu customerMenu = new JMenu("Customer");
        menuBar.add(customerMenu);

        JMenuItem addOrderMenuItem = new JMenuItem("Add Order");
        customerMenu.add(addOrderMenuItem);

        JPanel buttonPanel = new JPanel();
        frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);

        JButton displayServicesButton = new JButton("Display Services");
        buttonPanel.add(displayServicesButton);

        JButton displayOrderCostsButton = new JButton("Display Order Costs");
        buttonPanel.add(displayOrderCostsButton);

        JButton displayShippingFeeButton = new JButton("Display Shipping Fee above a Limit");
        buttonPanel.add(displayShippingFeeButton);
        textArea = new JTextArea();
        frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton multithreadSearchButton = new JButton("Multithread Search");
        buttonPanel.add(multithreadSearchButton);
        multithreadSearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalOrders = myOrder.getTotalNumberOfOrders();
                if (totalOrders < 8) {
                    JOptionPane.showMessageDialog(null, "Please create at least 8 orders first.", "Insufficient Orders", JOptionPane.WARNING_MESSAGE);
                } else {
                    String cityName = JOptionPane.showInputDialog(null, "Enter a city name for multithreaded search:");
                    if (cityName != null && !cityName.isEmpty()) {
                        performMultithreadedSearch(cityName);
                    }
                }
            }
        });
        
		/*Order myOrder = new Order();
		Provider myProvider = new Provider();*/
        // Add action listeners for the menu items and buttons
        exitMenuItem.addActionListener(e -> System.exit(0));
        /*addServiceMenuItem.addActionListener(e -> showAddServiceDialog());*/
        addServiceMenuItem.addActionListener(e -> myInventory.addNewService());
        /*addOrderMenuItem.addActionListener(e -> showAddOrderDialog()); */
        displayServicesButton.addActionListener(e -> displayAllItemsInTextArea(myInventory));
        displayOrderCostsButton.addActionListener(e -> displayOrderCostsInTextArea()); 
        multithreadSearchButton.addActionListener(e -> displayOrderIDsInTextArea()); 
        /*displayShippingFeeButton.addActionListener(e -> displayShippingFee());  */
        addOrderMenuItem.addActionListener(e -> showAddOrderDialog());
    }
    

    private void performMultithreadedSearch(String cityName) {
     
        displayOrderIDsInTextArea();
    }
    
    private void displayOrderIDsInTextArea() {
        // Assuming you have a JTextArea in your GUI
        JTextArea textArea = new JTextArea();
        textArea.setText("Order IDs found:\n");

        for (int i = 0; i < 2; i++) {
            textArea.append("Order ID: " + i + "\n");
        }

    }

    private void displayAllItemsInTextArea(InventorySystem myInventory) {
        String itemsInformation = myInventory.displayAllItemsGUI();
        textArea.setText(itemsInformation);
    }
    
    private void displayOrderCostsInTextArea() {
        int lastOrderIndex = myOrder.getTotalNumberOfOrders() - 1;

        // Check if there is at least one order
        if (lastOrderIndex >= 0) {
            List<String> itemNames = myOrder.getItemName2();
            List<Integer> quantities = myOrder.getItemQuantity2();

            // Check if the indices are valid
            if (lastOrderIndex < itemNames.size() && lastOrderIndex < quantities.size()) {
                String itemName = itemNames.get(lastOrderIndex);
                int quantity = quantities.get(lastOrderIndex);

                // Check if the item name and quantity are valid
                if (itemName != null && quantity >= 0) {
                    // Calculate the order cost based on the item name and quantity
                    double orderCost = myOrder.calculateOrderCostGUI(myInventory.getPriceGUI(itemName), quantity);

                    // Display the result in the text area
                    textArea.setText("Order Cost:\nItem Name: " + itemName + "\nQuantity: " + quantity + "\nTotal Cost: $" + orderCost);
                } else {
                    textArea.setText("Invalid order details. Please enter a valid order first.");
                }
            } else {
                textArea.setText("Invalid order index. Please enter a valid order first.");
            }
        } else {
            textArea.setText("No orders found. Please enter an order first.");
        }
    }
    /*private void displayShippingFee() {
        JTextField limitField = new JTextField();

        Object[] message = {
                "Enter a limit:", limitField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Shipping Fee Limit", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            try {
                double limit = Double.parseDouble(limitField.getText());

                if (limit > 0) {
                    // Assuming you have a method to get shipping fees from your inventory
                    double maxShippingFee = myInventory.getMaxShippingFee();
                    
                    if (limit > maxShippingFee) {
                        JOptionPane.showMessageDialog(null, "There is no item with a shipping fee over this limit.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Items with shipping fees over " + limit + ".");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid positive limit.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }*/


    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}