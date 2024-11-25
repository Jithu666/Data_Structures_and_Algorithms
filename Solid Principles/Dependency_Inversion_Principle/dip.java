package SOLID_Principles.Dependency_Inversion_Principle;

        // Dependency Inversion Principle

    // Dependency Inversion Principle is one of the Software Development principle used in Object Oriented programming Design. Dependency Inversion Principle states that
    // High level modules should not depend on Low level Modules, both High level modules and Low level Modules should depend on Abstraction.
    // Abstraction should not depend on details, But Details should depend on Abstraction.

interface NotificationService{
    void send(String Message);
}

class EmailService implements NotificationService  {

    @Override
    public void send(String Message) {
        System.out.println("Email sent " + Message);
    }
}

class SMSService implements NotificationService{

    @Override
    public void send(String Message) {
        System.out.println("SMS sent " + Message);
    }
}

class UserService {
    private final NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }


    public void registerUser(String userEmail){
        notificationService.send("Welcome " + userEmail);
    }
}

class main{
    public static void main(String[] args) {

        // Using EmailService
        NotificationService emailservice = new EmailService();
        UserService userService = new UserService(emailservice);
        userService.registerUser("user@example.com");

        // Using SMS Service
        NotificationService smsService = new SMSService();
        UserService userService1 = new UserService(smsService);
        userService1.registerUser("user@example.com");
    }
}