import java.util.*;
class Registeration{
	public static void main(String[] args){
		String email,password;
		String[][] userinfo = { {"uoeuauo@gmail.com","uoeauoeu"}, {"oeueauoeu@hotmail.com","oeuoeuoeu"},{"eoauuoau@yahoo.com","uoeauoaeuoe"},
        {"uoaeuoeu@gmail.com","oeuoeuoeu"},{"oeuoaueoau@gmail.com", "oaueuoeu"}};

            System.out.println("welcome to pakistan ARMY'S WEBSITE ");
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter Your Email Address: ");
			email = obj.next();
            System.out.println("Enter Your Password: ");
			password = obj.next();
        
                int i;
                boolean AccountExists = false;

                for( i=0;i< userinfo.length;i++){
                    if(userinfo[i][0].equals(email)) {
                        AccountExists = true;
                        
                        if( userinfo[i][1].equals(password))  {
                            System.out.println(" you are login ");
                            break;
                        }
                    }
                }
                if(i == userinfo.length)  
                  System.out.println(":Invalid Credentials");

                if(AccountExists)  
                  System.out.println(":Account Exists");
                else
                  System.out.println(":Account Doesn't exists");
 
        }
}
