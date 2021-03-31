import java.util.ArrayList;
import java.util.*;


public class chat {

    public static void main(String[] args) {

        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        ChatRoomMethods cm = new ChatRoomMethods();

        while(!quit){
            System.out.println("1. Create a ChatRoom \n 2. Add the User \n3. User login\n 4.Send a message \n 5. Display the messages from a specific chatroom\n 6. List down all users belonging to the specified chatroom.\n 7. Logout\n 8. Delete an user.\n 9. Delete the chatRoom\n 10. QUIT APPLICATION");
            System.out.println("Select an option: ");
            int option = sc.nextInt();
            sc.hasNextLine();

            switch (option){
                case 1:
                    cm.createChatRoom();
                    break;

                case 2:
                    cm.addUser();
                    break;

                case 3:
                    cm.userLogin();
                    break;

               case 4:
                    cm.sendMessage();
                    break;

               case 5:
                    cm.displayMessagesOfChatroom();
                   break;

                case 6:
                    cm.listUsers();
                    break;

                case 7:
                    cm.logout();
                    break;

                case 8:
                    cm.deleteUser();
                    break;

                case 9:
                    cm.deleteChatRoom();
                    break;

               case 10:
                   System.out.println("Exiting App !");
                   quit = true;
           }
       }
    }
}

 class ChatRoom {

     String chatroomName;
    ArrayList<String> users = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
     boolean chatRoomStatus;
     boolean userLoginStatus;

     boolean isUserLoginStatus() {
        return userLoginStatus;
    }

     void setUserLoginStatus(boolean userLoginStatus) {
        this.userLoginStatus = userLoginStatus;
    }

     void login(String name){
        System.out.println(name+" Logged IN !");
    }

    boolean isChatRoomStatus() {
        return chatRoomStatus;
    }

   void setChatRoomStatus(boolean chatRoomStatus) {
        this.chatRoomStatus = chatRoomStatus;
    }

     ArrayList<String> getMessages() {
        return messages;
    }

    void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    ArrayList<String> getUsers() {
        return users;
    }

     void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    ChatRoom(String chatroomName) {
        this.chatroomName = chatroomName;
    }

String getChatroomName() {
        return chatroomName;
    }

     void setChatroomName(String chatroomName) {
        this.chatroomName = chatroomName;
    }

    @Override
    public String toString() {
        return "ChatRoom{" +
                "users=" + users +
                '}';
    }
}



 class ChatRoomMethods {
    public Scanner sc = new Scanner(System.in);

    ArrayList<ChatRoom> cl = new ArrayList<>();
    


    public void createChatRoom() {
        System.out.println("Enter name: ");
        String n = sc.nextLine();
        cl.add(new ChatRoom(n));
        System.out.println(n +" ChatRoom Created ! ");
    }

    public void addUser() {
        System.out.println("Enter ChatRoom name: \n");
        String cn = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter user name: ");
        String un = sc.nextLine();
        if (cl.isEmpty()) {
            System.out.println("No Chat Rooms present");
        } else
            for (ChatRoom e : cl) {
                if (e.getChatroomName().equalsIgnoreCase(cn)) {
                    System.out.println(cn + " ChatRoom Available");
                    e.users.add(un);
                    System.out.println(un +" Added !");
                }
            }
    }



    void userLogin(){
        System.out.println("Enter ChatRoom name: \n");
        String cn = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter user name: ");
        String un = sc.nextLine();
        for (ChatRoom e: cl) {
            if ((e.getChatroomName().equalsIgnoreCase(cn))) {
                System.out.println("Welcome to: "+e.getChatroomName());
                int index = e.users.indexOf(un);
                if(e.users.isEmpty()){
                    System.out.println("No users present !");
                } else if(un.equalsIgnoreCase(e.users.get(index))){
                    e.login(un);
                    System.out.println(un+ " Logged in !");
                    e.setUserLoginStatus(true);
                    e.setChatRoomStatus(true);
                }
            }
        }
    }

    void sendMessage(){
        userLogin();
        System.out.println("Enter Message: ");
        String msg = sc.nextLine();
        for(ChatRoom c: cl){
            if(c.isChatRoomStatus() && c.isUserLoginStatus()){
                System.out.println(c.getChatroomName()+" is active !");
                c.messages.add(msg);
                System.out.println("Message added.");
            }
        }
   }

    void displayMessagesOfChatroom(){
       userLogin();
       System.out.println("Enter ChatRoom name for MESSAGES: \n");
       String cn = sc.nextLine();
       for (ChatRoom c: cl) {
           if(c.getChatroomName().equalsIgnoreCase(cn) && c.isChatRoomStatus()){
               System.out.println(c.getMessages());
           }
       }
   }

    void logout(){
       for (ChatRoom c:cl) {
           if(c.isUserLoginStatus()){
               System.out.println("Logged out !");
               c.setUserLoginStatus(false);
           }
       }
   }

   void listChatrooms(){
       for (ChatRoom c: cl) {
           System.out.println(c.getChatroomName());
       }
   }

  void listUsers(){
       for (ChatRoom c:cl) {
           System.out.println(c.users.toString());
       }
   }

 void deleteChatRoom(){
       System.out.println("Enter Chatroom Name to DELETE: ");
       String cn = sc.nextLine();
       for (ChatRoom c: cl) {
           if(c.getChatroomName().equalsIgnoreCase(cn)){
               cl.remove(c);
               System.out.println(c.getChatroomName() + "Deleted !!");
           } else
                System.out.println(c.getChatroomName() + "Not Available");
       }
   }

   void deleteUser(){
       System.out.println("Enter ChatRoom name: \n");
       String cn = sc.nextLine();
       sc.nextLine();
       System.out.println("Enter user name: ");
       String un = sc.nextLine();
       for (ChatRoom c: cl) {
           int index = c.users.indexOf(un);
           if(c.users.get(index).equalsIgnoreCase(un)){
               c.users.remove(index);
               System.out.println(un +" DELETED");
           }else
               System.out.println("User not Available");
       }
   }
}


