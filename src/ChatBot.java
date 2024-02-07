import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        System.out.println("Hello! welcome to our site. whats your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Nice to meet you : "+ name +" ! Please ask your question");

        while(true){
            System.out.println(name +" : ");
            String userMessage = scan.nextLine();
            String responces = getResponces(userMessage);
            System.out.println("Bot : " +responces);

            if(userMessage.equalsIgnoreCase("Exit")){
                System.out.println("bye " + name + " !");
                break;
            }
        }
        scan.close();
    }
    public static String getResponces(String userMessage){
        if(userMessage.equalsIgnoreCase ("i want to know about my order process")){
            return "your order is in progress you definitely receive your order until tomorrow";
        } else if (userMessage.equalsIgnoreCase("its possible to cancel the order ?")) {
            return "yes its possible but you can cancel your order duration 24 hours after submitting your order";
        } else if (userMessage.equalsIgnoreCase("can i return an item ?")) {
            return "yes you can return if we deliver the item late or item has problem";
        } else if (userMessage.equalsIgnoreCase("may i add a delivery address ?")) {
            return "yes but duration 48 hours after submitting order";
        } else if (userMessage.equalsIgnoreCase("your company has deliver check ability ?")) {
            return "yes to check your order you have to install our app and track your order";
        } else {
            return "I don't understand . Please ask another question.";
        }

    }
}
