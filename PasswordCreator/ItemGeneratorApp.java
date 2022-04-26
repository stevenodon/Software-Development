// Student Number: 21130736 (Steven O'Donoghue)
// Question 1 (b) - Using MFNA1 ID as last number in student num is 6.
import javax.swing.JOptionPane;
import java.util.Arrays;
public class ItemGeneratorApp{
    public static void main(String[] args){
        //Variables
        //Q1 Vars
        String name;
        String password;
        String checker;
        //Q2 Vars
        String [] paragraph;
        int [] consCount;
        int numPara;
        //Object - Create a new object from the instantiable class.
        ItemGenerator gen;
        gen=new ItemGenerator();
        //Opening message Q1
        JOptionPane.showMessageDialog(null,"Welcome to the item generator.\nFirst, you will be changing names to suitable passwords.");
        //Do while loop used; run once and there after till something else is entered. 
        do{
            //Inputs - User puts in their name; option to make another password.
            name=JOptionPane.showInputDialog(null,"Please enter the name you want to use.");
            //Setter - Send name to instantiable class. 
            gen.setName(name);
            //Compute - Use name to create a password.
            gen.computePass();
            //Getter - Recieve the password from the instantiable class. 
            password=gen.getPass();
            //Output - Output the password on the screen. 
            JOptionPane.showMessageDialog(null,"Result: "+password);
            checker=JOptionPane.showInputDialog(null,"Would you like to create another password?\nPlease enter yes or no.");
            }
        while(checker.equalsIgnoreCase("yes"));
// Question 2 (b) - User to provide paragraphs, store as an array and display on screen. 
        //Opening message Q2
        JOptionPane.showMessageDialog(null,"Now you will be asked to enter paragraphs and will recieve the amount of consonants in each.");
        //Input the amount of paragraphs required.
        numPara=Integer.parseInt(JOptionPane.showInputDialog(null,"How many paragraphs would you like to enter?"));
        //Create new arrays
        paragraph=new String[numPara];
        consCount=new int[numPara];
        //Parse through paragraph array to input values.
        for(int i=0;i<numPara;i++){
            paragraph[i]=JOptionPane.showInputDialog(null,"Please enter paragraph number "+(i+1));
        //Single method: set, compute and get each value of the consonants array. 
            consCount[i]=gen.numConsonants(paragraph[i]); 
        }
        //Output the array on screen.
        JOptionPane.showMessageDialog(null,"The results for the paragraphs you entered are: "+(Arrays.toString(consCount))+" respectively.");
        JOptionPane.showMessageDialog(null,"End of program. Thank you.");
    }        
}