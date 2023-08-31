class Passport {
    String passportOffice;
    String givenName;
    String surName;
    String dob;
    String email;
    String password;
    String confirmPassword;

    // validatePassword(password,confirmPassword);

    public Passport(String office,String name,String lastname,String dateOfBirth,String mail,String passwrd,String cnfrmPasswrd){
     passportOffice=office;
	 givenName=name;
	 surName=lastname;
	 dob=dateOfBirth;
	 email=mail;
	 password=passwrd;
	 confirmPassword=cnfrmPasswrd;
        System.out.println("Passport Object Created");
    }

    public boolean verifyPassword(String password, String confirmPassword) {
        boolean isPassWordVerified=false;

        //validate the length of password;
        if (password == confirmPassword) {
            isPassWordVerified=true;
            System.out.println("SUccessfully Password Matched");
             displayUserDetails();
            
        } else {
            System.out.println("Mismatch in the password...Please enter the correct password");
        }
        return isPassWordVerified;

    }

    public void displayUserDetails(){
        System.out.println("The Passport Office is " +passportOffice);
        System.out.println("The Given Name is " +givenName);
        System.out.println("The Sur name  Provided is " +surName);
        System.out.println("The Given date of birth is " +dob);
        System.out.println("The Given email is " +email);
        System.out.println("The Password is " +password);
    }

    public void validatePassword(String password,String confirmPassword){
        int minLength=6;
        int maxLength=16;
        int passwordLength=password.length();
        int confirmPasswordLength=confirmPassword.length();

        if(passwordLength>=minLength && passwordLength<=maxLength){
            if(confirmPasswordLength>=minLength && confirmPasswordLength<=maxLength){
                System.out.println("Password is valid");
                verifyPassword(password,confirmPassword);
               

            }
        }
        else{
            System.out.println("Password is not valid");
        }

}
}
