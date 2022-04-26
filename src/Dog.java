
public class Dog {
    public static void main(String[] args) {
        String user1 = "Иван Иванов";
        String user2 = "Вован иванов";
        ChecUserName(user1, user2);
    }
    private static void ChecUserName(String user1, String user2){
        if(user1.equalsIgnoreCase(user2)==true)
        System.out.println("Выберете другое имя");
        else System.out.println("Отличное имя");

    }
}
