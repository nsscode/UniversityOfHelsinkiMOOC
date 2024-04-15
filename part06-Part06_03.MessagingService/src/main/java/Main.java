
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Message myMessage = new Message("Nine", "My first message");
        Message anotherMessage = new Message("Nine", "My second message");
        System.out.println(myMessage);

        MessagingService listofMessages = new MessagingService();

        listofMessages.add(myMessage);
        System.out.println(listofMessages.getMessages());
        listofMessages.add(anotherMessage);
        System.out.println(listofMessages.getMessages());



    }
}
