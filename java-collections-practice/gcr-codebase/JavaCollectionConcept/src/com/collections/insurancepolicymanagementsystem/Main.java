package com.collections.insurancepolicymanagementsystem;


/*Insurance Policy Management System

Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
policies.
*/

import java.util.*;
import java.time.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InsurancePolicyManager manager = new InsurancePolicyManager();
		
		System.out.println("===== Welcome to Insurance Policy Management =====");
		
		while(true) {
			
			System.out.println("1. Add Policy");
			System.out.println("2. Display All with HashSet");
			System.out.println("3. Display All with LinkedHash Set");
			System.out.println("4. Display All with Tree Set");
			System.out.println("5. Show Expiring Soon (within 30 Days)");
			System.out.println("6. Filter by Coverage Type");
			System.out.println("7. Performance Test");
			System.out.println("8. Exit");
			System.out.print("\nChoice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Policy Number: ");
				String number = sc.nextLine();
				
				System.out.print("Policyholder Name: ");
				String name = sc.nextLine();
				
				System.out.print("ExpiryDate: ");
				LocalDate expiryDate = LocalDate.parse(sc.nextLine());
				
				System.out.print("Coverage Type: ");
				String coverageType = sc.nextLine();
				
				System.out.print("Premium Amount: ");
				double premiumAmount = sc.nextDouble();
				
				Policy policy = new Policy(number, name, expiryDate, coverageType, premiumAmount);
				manager.addPolicy(policy);
				
				System.out.println("Policy Added Successfully");
				break;
				
			case 2:
				manager.displayAll(manager.getHashSet());
				break;
				
			case 3: 
				manager.displayAll(manager.getLinkedHashSet());
				break;
				
			case 4:
				manager.displayAll(manager.getTreeSet());
				break;
				
			case 5:
				manager.showExpiringSoon();
				break;
				
			case 6:
				System.out.print("Enter Coverage Type: ");
				String coverage = sc.nextLine();
				manager.filterByCoverage(coverage);
				break;
				
			case 7:
				manager.performanceTest();
				break;
				
			case 8:
				System.out.println("Thank You For Using Insurance Policy Management");
				return;
				
			default: 
				System.out.println("Invalid choice");
			}
		}
	}
}
