package Messenger;
/**
 *
 * @author Aida Muflihah
 */
    public class Sender {
    public static void main(String[] args) {
        StdMessenger aidaStd = new StdMessenger(); 
        MailMessenger aidaMail = new MailMessenger();
        
//        StdMessenger Test
        System.out.println("= Test_Std_Messenger_Started =");
        System.out.println("Sending a Messege");
        aidaStd.sendMessege("Gais", "Mari bermain","Ke coffee shop");
        System.out.println("= Test_Std_Messenger_Finished =");
        System.out.println(""); System.out.println("");
//        Mail Messenger Test
        System.out.println("= Test_Mail_Messenger_Started =");
        System.out.println("Sending a Messege"); // Not Connected Yet.
        aidaMail.sendMessege("Gais", "Gih aph nich", "Ak gbut bgd?");
        
        aidaMail.disconnect(); //Disconnecting
        
        System.out.println("Connecting"); // Connecting
        aidaMail.connect(); //Connected
        
//        Resend
        System.out.println("Resend a Messege");
        aidaMail.sendMessege("Gais", "Gih aph nich", "Ak gbut bgd?");
        System.out.println("= Test_Mail_Messenger_Finished =");
        }
    }