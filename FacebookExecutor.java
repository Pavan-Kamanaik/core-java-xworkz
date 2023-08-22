class FacebookExecutor {
    public static void main(String connect[]){
        System.out.println("Welcome to facebook");
        login("knaikpavan939@gmail.com","password123");
        login(958674512354L,"password345");
        // Facebook.login("kaniakpavan949@gmail.com","pavan2002");
    }
    
    public static void login(String emailID,String password){
        // class has a main method and two overload logi methods.
        System.out.println("Login with emailID");
    }
    public static void login(long phoneNumber,String password){
        System.out.println("Login with phone Number");
    }
}
