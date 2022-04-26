// Student Number: 21130736 (Steven O'Donoghue)
// Question 1 (a) - Using assigned item 'password' as penultimate digit is 3.
public class ItemGenerator{
    //Variables 
    //Vars Q1
    private String name;
    private String password;
    private StringBuffer genPass;
    private int elimCount;
    //Vars Q2
    private int consCount;
    private char [] constsCap = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    private char [] constsLow = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    //Constructor - Give initial values to vars. 
    public ItemGenerator(){
        name=" ";
        password="";
        elimCount=0;
    }
    //Setter - Allow name value to be the same as the name value in the app class. 
    public void setName(String name){
        this.name=name;
    }
    //Compute - Carry out the process of changing the name to a password. 
    public void computePass(){
        //Initilise the StringBuffer.
        genPass=new StringBuffer();
        //Parse through the inputted name.
        for(int i=0;i<name.length();i++){
            //To remove char a,e and t. 
            if(name.charAt(i)=='a'||name.charAt(i)=='e'|name.charAt(i)=='t'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='T'){
                genPass.delete(1,1);
                //Add to amount of deleted chars.
                elimCount++;
            }
            //To add double letters for i, o and u. 
            else if(name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'){
                for(int j=0;j<2;j++){
                    genPass.append(name.charAt(i));
                }
            }
            //To add S&? in place of spaces. 
            else if(name.charAt(i)==' '){
                genPass.append("S&?");
            }
            //To add letters that are not a,e and t. 
            else if(name.charAt(i)!='a'||name.charAt(i)!='e'||name.charAt(i)!='t'||name.charAt(i)!='A'||name.charAt(i)!='E'||name.charAt(i)!='T'){
                genPass.append(name.charAt(i));
            }
        }
        //Add amount of deleted chars at the end.
        genPass.append(elimCount);
        //Move created string buffer to password value. 
        password=genPass.toString();
        //Reset amount deleted for next name.
        elimCount=0;
        //Reset the string buffer to take in new names.
        genPass.delete(0,genPass.length());
    }
    //Getter - Returning the value of password to the app class. 
    public String getPass(){
        return password;
    } 
// Question 2
// Part a - Using the functionality ID F3 as penultimate digit is 3.
    //Q2 Single Method
    public int numConsonants(String paragraph){
        //Reset the counter each time method is called.  
        consCount=0;
        //Parse through the paragraph letters.
        for(int i=0;i<paragraph.length();i++){
            //Parse through the array of consonants. 
            for(int j=0;j<constsCap.length;j++){
                //Compare against the lower and upper case letters; increase counter if there is a match.
                if(paragraph.charAt(i)==constsCap[j]||paragraph.charAt(i)==constsLow[j]){
                        consCount++;
                    }
                }
            }
        //Return the value of the counter for this paragraph. 
        return consCount;
    }
}