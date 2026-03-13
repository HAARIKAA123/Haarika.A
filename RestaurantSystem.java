import java.util.*;
class FoodMenu{
	int id;
	String name;
	double price;
	
	FoodMenu(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}

class ItemOrder{
	FoodMenu item;
	int quantity;
	
	ItemOrder(FoodMenu item,int quantity){
		this.item=item;
		this.quantity=quantity;
	}
}

public  class RestaurantSystem{
		static Scanner sc=new Scanner(System.in);
		static boolean a=false;
		static ArrayList<FoodMenu> foodmenu=new ArrayList<>();
		static ArrayList<ItemOrder> itemorder=new ArrayList<>(); 
		static final String adminPassword="admin@123";
		
		public static void main(String args[]){
			foodmenu.add(new FoodMenu(1,"Dosa",45.0));
		    foodmenu.add(new FoodMenu(2,"Idly",20.0));
		    foodmenu.add(new FoodMenu(3,"Upma",30.0));
		    foodmenu.add(new FoodMenu(4,"Poori",40.0));
		    foodmenu.add(new FoodMenu(5,"Chapathi",40.0));
		    foodmenu.add(new FoodMenu(6,"Fried Rice",70.0));
		    foodmenu.add(new FoodMenu(7,"Veg Rice",75.0));
		    foodmenu.add(new FoodMenu(8,"Tomato Rice",50.0));
		    foodmenu.add(new FoodMenu(9,"Biryani",120.0));
	     	foodmenu.add(new FoodMenu(10,"Chicken Rice",90.0));
	     	foodmenu.add(new FoodMenu(11,"Pepsi",25.0));
	    	foodmenu.add(new FoodMenu(12,"Chips",30.0));
	    	foodmenu.add(new FoodMenu(13,"Ice-cream",55.0));
		
		    while(true){
				System.out.println("-*-*-*-*-*-*-*😋:)Welcome to Foodies Restaurant:)😋-*-*-*-*-*-*-*-*");
			    System.out.println("1. Customer panel");
			    System.out.println("2. Admin panel");
			    System.out.println("3. Exit");
			    System.out.println("choose an Action");
		    	int choice=sc.nextInt();
				if(choice==1){
					customerpanel();
				}
			    else if(choice==2){
					adminLogin();
				}
					
				else if(choice==3){
					if(a){
						System.out.println("Thank you! Visit Again!");
					    break;
					}
					else{
						System.out.println("You cannot exit without paying bill:");
						printBill();
					}
				}
				else{
					System.out.println("Invalid option.");
				}
			}
		}
		static void customerpanel(){
			a=false;
			while(true){
				System.out.println("\n---Customer Menu---");
				System.out.println("1.View Menu");
				System.out.println("2.place order");
				System.out.println("3.view Bill");
				System.out.println("4.Back to Main Menu");
				System.out.println("Enter your choice:");
				int choice=sc.nextInt();
				
				if(choice==1){
					displayMenu();
				}
				else if(choice==2){
					placeOrder();
				}
				else if(choice==3){
					printBill();
				}
				else if(choice==4){
					break;
				}
				else{
					System.out.println("Invalid choice!");
				}
			}
		}
		
		static void adminLogin(){
			System.out.println("Enter Admin Password:");
			sc.nextLine();
			String password=sc.nextLine();
			if(password.equals(adminPassword)){
				adminPanel();
			}
			else{
				System.out.println("Incorrect Password!");
			}
		}
		
		static void adminPanel(){
			while(true){
				System.out.println("\n---Admin Panel---");
				System.out.println("1.View Menu");
				System.out.println("2.Add Menu Item:");
				System.out.println("3.Remove Menu Item:");
				System.out.println("4.Back to Main Menu");
				System.out.println("Enter your choice:");
				int adminChoice=sc.nextInt();
				
				if(adminChoice==1){
					displayMenu();
				}
				else if(adminChoice==2){	
				
					addMenuItem();
				}
				else if(adminChoice==3){
					removeMenuItem();
				}
				else if(adminChoice==4){
					break;
				}
				else{
					System.out.println("Invalid choice!");
				}
			}
		}
		
		static void displayMenu(){
			System.out.println("\n----MENU----");
			for(FoodMenu item:foodmenu){
				System.out.printf("%d.%s-₹%.2f\n",item.id,item.name,item.price);
			}
		}
		
		static void placeOrder(){
			System.out.println("Enter item ID to order:");
			int id = sc.nextInt();
			FoodMenu ChoosenItem=null;
			for(FoodMenu item:foodmenu){
				if(item.id==id){   
					ChoosenItem=item;
					break;
				}
			}
			
			if(ChoosenItem!=null){
				System.out.println("Enter Quantity:");
				int qt=sc.nextInt();
				itemorder.add(new ItemOrder(ChoosenItem,qt));
				System.out.println("Item added to Order!");
			}
			else{
				System.out.println("Invalid item ID:");
			}
		}
static double total=0;
		static void printBill(){
			System.out.println("\n---BILL---");
		    total=0;
			for(ItemOrder o:itemorder){
				double amount=o.item.price*o.quantity;
				total+=amount;
				System.out.printf("%sx%d -->₹%.2f\n",o.item.name,o.quantity,amount);
			}
			System.out.printf("Total Amount: ₹%.2f\n",total);
			paidBill();
			
		}
		static void paidBill(){
			while(true){
				a=true;
				System.out.println("please pay the bill:)");
				try{
					 double bill=sc.nextDouble();				   
			         if(bill==total){
						 System.out.println("Bill paid,Thank you :)");
					     itemorder.clear();
				         break;
					    }
					 else if(bill==0){
						 System.out.println("You're Exiting without paying the bill..!,please pay the bill!");
					     break;
			            }
				     else{
						 System.out.println("Bill not paid!");
				        }
				}
				catch(Exception e){
					System.out.println("InputMismatach Exception..");
					sc.next();
				}
			}
		}
		
		static void addMenuItem(){
			System.out.println("Enter new item name:");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter price:");
			double price=sc.nextDouble();
			int newID=foodmenu.size()>0 ?foodmenu.get(foodmenu.size()-1).id+1:1;
			foodmenu.add(new FoodMenu(newID,name,price));
			System.out.println("Item added successfully :)");
		}
			
	
		static void removeMenuItem(){
			displayMenu();
			System.out.print("Enter item ID to remove:");
			int id=sc.nextInt();
			boolean removed=false;
			
			Iterator<FoodMenu> it=foodmenu.iterator();
			while(it.hasNext()){
				if(it.next().id==id){
					it.remove();
					removed=true;
					break;
				}
			}
			
			if(removed){
				System.out.println("Item Removed successfully:");
			}
			else{
				System.out.println("Item not found:");
			}
		}
    }