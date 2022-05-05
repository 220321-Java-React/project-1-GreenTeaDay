package com.revature.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import DAOs.ErsUserDAO;
import DAOs.RoleDAO;
import DAOs.UserLoginDAO;

public class Menu {
	
	//instantiating an EmployeeDAO object so that we can use it's methods
	ErsUserDAO eDAO = new ErsUserDAO();
	//instantiating a RoleDAO object so that we can use its methods
	RoleDAO rDAO = new RoleDAO();
	//instantiating a UserDAO object so that we can use its method
	UserLoginDAO uDAO = new UserLoginDAO();
	

	//All of the menu display options and control flow are contained within this method
	public void displayMenu() {
		
		boolean displayLogin = true;//we're going to use this to toggle whether the user can use the application or not
		boolean displayMenu = true; //we're going to use this to toggle whether the menu continues after user input
		Scanner scan = new Scanner(System.in); //Scanner object to parse (read) user input
		
		//pretty greeting
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("WELCOME to the ERS - Employee Management System");
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		
		System.out.println("Hello, pleas log in.");
		
		
		//display the login prompt, and not let the user access the rest of the application until they log in
		while(displayLogin) {
			
			System.out.println("USERNAME:");
			
			String username = scan.nextLine();
			
			System.out.println("PASSWORD:");
			
			String password = scan.nextLine();
			
			//control flow based on whether the user provided accurate login credentials
			if(uDAO.login(username, password)) {
				System.out.println("Thank you for logging in.");
				displayLogin = false;
				break;
			}
			
			System.out.println("Please try again.");
			
		}
		
		
		//display the menu as long as the displayMenu boolean is true
		while(displayMenu) {
			
			//tell the user to choose an option
			System.out.println("----------------");
			System.out.println("SELECT AN OPTION");
			System.out.println("----------------");
			
			
			//list out the user's options for them to choose
			System.out.println("1: get greeted");
			System.out.println("2: exit the application");
			System.out.println("3: show all users");
			System.out.println("4: show all roles");
			System.out.println("5: get role by ID");
			System.out.println("6: update role salary");
			System.out.println("7: add user");
			System.out.println("8: remove user");
			System.out.println("9: select users by role title");
			
			
			//parse the user's input after they choose option, and put it in a int variable
			int input = scan.nextInt();
			scan.nextLine(); //without nextLine(), the application won't move to the next line... so we need it!
			
			//switch statement - depending on the user's input, do some functionality
			switch(input) {
			
			case 1: {
				System.out.println("Painless reimbursements. Done right. Everytime.");
				break;
			}
			
			case 2: {
				System.out.println("Bye for now!");
				displayMenu = false; //remember, the while loop depends on displayMenu being true. so this ends the loop.
				break;
			}
			
			case 3: {
				//call the getEmployees() method from the EmployeeDAO, put the results into a variable
				List<ErsUser> ErsUsers = eDAO.getAllUsers();
				
				//print out the values of our employees variables in a forEach
				//I'm sure you all can find even cleaner ways to print this data out ;)
				ErsUsers.forEach(ErsUser -> {
					System.out.println("----------------------");
					System.out.println(ErsUser.getErsUserid());
					System.out.println(ErsUser.getUserFirstName());
					System.out.println(ErsUser.getUserLastName());
					System.out.println(ErsUser.getErsUserRolesFk());
					System.out.println("----------------------");
				});
				
				break;
			}
			
			case 4: {
				
				//get the ArrayList of roles from the roleDAO
				ArrayList<ErsUserRoles> ErsUsers = rDAO.getRoles();
				
				//enhanced for loop to print out our role data one by one
				for(ErsUserRoles role : ErsUsers) {
					System.out.println(role);
				}
				
				break;
			}
			
			case 5: {
				
				System.out.println("What is the role id?");
				
				int idInput = scan.nextInt(); //we get the user's input for ID
				scan.nextLine(); //we still need nextLine() to move to the next line
				
				//what if the user enters a String? the program will crash
				//it's up to you to polish your P0 and add some foolproofing to cases like this
				
				//creating a new Role object, using the getRoleById method in the Role DAO
				ErsUserRoles role = rDAO.getRoleById(idInput);
				
				//simply print out our new role object
				System.out.println(role);
				
				break;
			}
			
			case 6: {
				// gut this
				System.out.println("Which role would you like to change?");
				
				//take in the user's input for the role they want to change
				String password = scan.nextLine();
				
				System.out.println("What is the new salary?");
				
				//take in the user's input for the new salary
				int ers_userid = scan.nextInt();
				scan.nextLine();
				
				eDAO.updateUserPassword(ers_userid, password);
				
				break;
			}
			
			case 7: {
				
				//take user input for employee first_name and last_name
				System.out.println("Enter Employee First Name");
				String fName = scan.nextLine();
				
				System.out.println("Enter Employee Last Name");
				String lName = scan.nextLine();
				
				//take user input for the employee's role
				//not the prettiest design here, but otherwise the user doesn't know the different roles
				System.out.println("Enter Employee Role");
				System.out.println("Manager = 1 | Fry Cook = 2 | Cashier = 3 | Marketing = 4");
				
				int roleId = scan.nextInt();
				//Ben is confused on why we don't need nextLine() in these cases he'll come back to this comment
				
				ErsUser emp = new ErsUser(fName, lName, null);
				//why null for the role object?? We're going to use the user-inputted role_id instead
				//this agrees better with the DB, since the User has role_id_fk, not a Role object
				
				eDAO.insertEmployee(emp, roleId);
				
				break;
			}
			
			case 8: {
				
				System.out.println("Power trip huh? Enter the ID of the employee you want to delete");
				
				int idInput = scan.nextInt();
				
				eDAO.removeEmployee(idInput);
				
				break;
			}
			
			case 9: {
				
				//prompt the user to enter a Role to search for
				System.out.println("Which Role would you like to search for?");
				System.out.println("CaSe SeNsItIve!!! E.g. \" Fry Cook \"");
				
				//taking the user input
				String roleInput = scan.nextLine();
				
				//make an ArrayList, fill it with the results of the DAO method that gets employees by role title
				ArrayList<ErsUser> userList = eDAO.getEmployeesByRole(roleInput);
				
				//"for every Employee that we'll call "e" in the employeeList", do something
				for(ErsUser e : userList) {
					
					System.out.println("-----------------------");
					System.out.println(e.getErsUserid());
					System.out.println(e.getUserFirstName());
					System.out.println(e.getUserLastName());
					System.out.println(e.getErsUserRolesFk());
					System.out.println("-----------------------");
					
				}
				
				break;
			}
			
			default: {
				//this default block will run if the user inputs a number that isn't one of the options
				System.out.println("What did you say?? Try again. Do better...");
				break;
			}
			
			} //switch statement ends here
			
		} //while loop ends here
		
	} //method ends here
	
} //class ends here