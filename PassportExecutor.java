class PassportExecutor {

    public static void main(String verify[]){
         Passport details1 =new Passport("Bangalore","Pavan K","Kamanaik","02/05/2005","knaikpavan@gmail.com","Helpmegod@123","Helpmegod@123");
                                //constructor--same as method but with specilized method 
                                //same as className with no return type                   ;
         details1.passportOffice="Bangalore";
         details1.givenName="Pavan K";
         details1.surName="Kamanaik";
         details1.dob="02/05/2005";
         details1.email="knaikpavan@gmail.com";
         details1.password="Helpmegod@123";
         details1.confirmPassword="Helpmegod@123";
         details1.validatePassword(details1.password,details1.confirmPassword);

        //  Passport.validatePassword(details1.password,details1.confirmPassword);
        }
}