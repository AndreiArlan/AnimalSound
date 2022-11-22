import java.util.Scanner;
public class RunAnimal{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
	
	System.out.println("Choose an Animal:");
	System.out.print("Press B for Bird, C for Cat, or D for Dog ");
	String pick = sc.nextLine();
	
	if(pick.equalsIgnoreCase("B")){
	Bird bird = new Bird();
	bird.eat();
	bird.sleep();
	bird.makeSound();
	}
	else if(pick.equalsIgnoreCase("C")){
	Cat cat = new Cat();
	cat.eat();
	cat.sleep();
	cat.makeSound();
}
	else if(pick.equalsIgnoreCase("D")){
	Dog dog = new Dog();
	dog.eat();
	dog.sleep();
	dog.makeSound();
	}
}
}
