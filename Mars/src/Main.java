
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the MARS Interviewing Systems");
		System.out.println(" Can I learn your name");
		
		String name = input.nextLine();
		if(name.equalsIgnoreCase("no")) {
			System.out.println("Okay, your choice.");
		}else {
		System.out.println("Hello "+ name +"."+ " How old are you?");
		int age = input.nextInt();
		String j = input.nextLine();
		if(age<=18) {
			System.out.println("Your age is not valid for job application");
		}else if(age>18) {
			System.out.println("Which job do you want to apply for?");
			
			String job = input.nextLine();
			 
			if(job.equalsIgnoreCase("Software Engineer")) {
				System.out.println("Nice, do you have university degree");
				String degree = input.nextLine();
				
				if(degree.equalsIgnoreCase("no")) {
					System.out.println("Bye Bye.");
				}
				else if(degree.equalsIgnoreCase("yes")) {
					System.out.println("Which degree do you have?");
					String which = input.nextLine();
					
					if(which.equalsIgnoreCase("Computer Science")) {
						System.out.println("Do you know Java?");
						String java = input.nextLine();
						
						if(java.equalsIgnoreCase("yes")) {
							System.out.println("Do you know Javascript");
							String javascript = input.nextLine();
							if(javascript.equalsIgnoreCase("yes")) {
								System.out.println("You're hired");
							}else {
								System.out.println("Do you know C");
								String c = input.nextLine();
								if(c.equalsIgnoreCase("yes")) {
									System.out.println("You're hired");
								}else {
									System.out.println("Bye Bye");
								}
							}
						}
						else {
							System.out.println("Do you know Javascript");
							String js = input.nextLine();
							if(js.equalsIgnoreCase("yes")) {
								System.out.println();
								System.out.println("Do you know C");
								String c2 = input.nextLine();
								if(c2.equalsIgnoreCase("yes")) {
									System.out.println("You're hired");
								}
								else if(c2.equalsIgnoreCase("no")) {
									System.out.println("Bye Bye");
								}
							}
						}
					}
					else {
						System.out.println("Bye Bye");
					}
				}
			}else if(job.equalsIgnoreCase("Accountant")) {
				System.out.println("Do you have a degree");
				String acdegree = input.next();
				if(acdegree.equalsIgnoreCase("yes")) {
					System.out.println("Do you know Excel well");
					String exc= input.next();
					if(exc.equalsIgnoreCase("yes")) {
						System.out.println("Do you have fluent English skill or a friend \nwith this skill who can help you?");
							String eng= input.next();
							if(eng.equalsIgnoreCase("yes")) {
								System.out.println("Do you have two friends from our company");
								String tani=input.next();
								if(tani.equalsIgnoreCase("yes")) {
									System.out.println("Do you have a driving license");
									String license= input.next();
									if(license.equalsIgnoreCase("yes")) {
										System.out.println("You're hired");
									}else {
										System.out.println("Bye Bye");
									}
								}else {
									System.out.println("Bye Bye");
								}
							}else {
								System.out.println("Bye Bye");
							}
					}else {
						System.out.println("Bye Bye");
					}
				}
				else {
					System.out.println("Bye Bye");
				}
			}else if(job.equalsIgnoreCase("academic")) {
				System.out.println("Do you speak English");
				String english = input.next();
				if(english.equalsIgnoreCase("yes")) {
					System.out.println("How many papers of you published?");
					int published= input.nextInt();
					if(published>=3) {
						System.out.println("Do you love teaching");
						String love= input.next();
						if(love.equalsIgnoreCase("yes")) {
							System.out.println("You're hired");
						}else {
							System.out.println("Bye Bye");
						}
					}else {
						System.out.println("Bye Bye");
					}
				}else {
					System.out.println("Bye Bye");
				}
				
			}else {
				System.out.println("There is no other position we need beside 'Software Engineer',\n 'Accountant' or 'Academic'");
			}
		}
		
	}

}}
