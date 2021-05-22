package Misc;
/*
     Computational Problem to check the cheating of Gale Shapley Algorithm 
     Analysis of Test Cases and the feasibility and more details about the computational Problem are shared in the
     word fiel 
 
 */
 
public class StableMatching
{
    //  no. of men and women 
    private int n ; 
    //  Count of people that are engaged
    private int countofengaged;
    // Men Preference List 
    private String[][] manList;
    //  Women Preference List
    private String[][] womanList;

    private String[] men;

    private String[] women;
    //  Partner of the Women Partner 
    private String[] WomenPartner;
    private boolean[] menEngaged;
 
    //   Constructor to initialize the values when we call the Function of STable Matching 
    public StableMatching(String[] m, String[] w, String[][] menp, String[][] womenp)
    {


        n = menp.length; // The lenght of the string will determine the number of men and woman
        
        men = m;
        women = w;
        manList = menp; // Two dimensional String arrays like a Matrix , i/p given by the user 
        womanList = womenp; // Two dimensional string arrays like a matrix 

        menEngaged = new boolean[n]; // Either True or False 
        WomenPartner = new String[n];
        countofengaged = 0; // initialze it to 0 as initially they are all free
        checkMatches();
         // Method callled Inside the constructor 
    }
    //  Function to check all the matches
    private void checkMatches()
    {
        while (countofengaged < n) 

        {
            // Till engaged count reaches n this process is repeated after whhich it auto gets terminated with stabe Match

            int free;
            for (free = 0; free < n; free++)
                if ( !menEngaged[free])
                    break;
 


            for (int i = 0; i < n && !menEngaged[free]; i++)
            {

                // From i < n and men engaged are free we run the lop
                int index = womenIndexOf(manList[free][i]);
                if (WomenPartner[index] == null)
                {
                    WomenPartner[index] = men[free];
                    menEngaged[free] = true;
                    countofengaged++; 
                    // Increment the number of engaged 
                }
                else
                {


                    String currentPartner = WomenPartner[index];
                    if (wpreferesnewpartnerovercurr(currentPartner, men[free], index))
                    {
                        WomenPartner[index] = men[free];
                        menEngaged[free] = true;
                        menEngaged[menIndexOf(currentPartner)] = false;
                    }

                }
            }            
        }
        printCouples();
    }
     // The ith man 
     private int menIndexOf(String str)
     {
         for (int i = 0; i < n; i++)
             if (men[i].equals(str))
                 return i;
         return -1;
     }
     // The ith woman
     private int womenIndexOf(String str)
     {

         for (int i = 0; i < n; i++)
             if (women[i].equals(str))
                 return i;
         return -1;
     }


     
    private boolean wpreferesnewpartnerovercurr(String currPartner, String newPartner, int index)
    {


        //  Function to check if the women prefers the new partner that is proposing her over her current Partnetr
        for (int i = 0; i < n; i++)
        {
            
            if (womanList[index][i].equals(newPartner))
                 return true;
            if (womanList[index][i].equals(currPartner))
                 return false;
        }
        return false;
    }
   
    //  Driver Method to Print the Pairs of the Matching 


    public void printCouples()
    {
        
        for (int j = 0; j< n; j++)
        {
            System.out.println(women[j] +" --- "+ WomenPartner[j]);
        }
    }
     //  main Method 

    public static void main(String[] args) 
    {
        
        //The array of Men  
        String[] m = {"M1", "M2", "M3", "M4", "M5"};
        //  The array of Women
        String[] w = {"W1", "W2", "W3", "W4", "W5"};
 
        //  Preference List of men in the form of a matrix
        String[][] menp = {{"W2", "W3", "W4", "W5", "W1"}, 
        {"W3", "W4", "W5", "W1", "W2"}, 
        {"W5", "W1", "W4", "W2", "W3"}, 
        {"W3", "W1", "W2", "W4", "W5"},
        {"W1", "W5", "W2", "W3", "W4"}};

        //  Preference List Of Women in the form of a matrix  

        String[][] womenp = {{"M1", "M2", "M3", "M5", "M4"}, 
        {"M2", "M1", "M4", "M5", "M3"}, 
        {"M3", "M2", "M5", "M1", "M4"},
        {"M4", "M5", "M1", "M2", "M3"}, 
        {"M5", "M1", "M2", "M3", "M4"}};
 
         //  The false prefence list where Preference List of Women has been changed 

        String[][] womenpfake = {{"M1", "M2", "M3", "M4", "M5"}, 
        {"M2", "M1", "M4", "M5", "M3"}, 
        {"M3", "M2", "M5", "M1", "M4"},
        {"M4", "M5", "M1", "M2", "M3"}, 
        {"M5", "M1", "M2", "M3", "M4"}};


        System.out.println("The stable Matching is : ");
        StableMatching sb = new StableMatching(m, w, menp, womenp);  

        //  Calling the function again to check what differnce has been made after cheating 

        System.out.println("The False  Matching is : ");
        StableMatching sb1 = new StableMatching(m, w, menp, womenpfake); 

        System.out.println("There is a change in the matching if the prefernece LIST is tweaked");

    }
}