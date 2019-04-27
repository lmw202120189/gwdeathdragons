import java.util.*;

class GW_DeathDragons {

   Scanner input = new Scanner (System.in);

   String name = "null";
   String label = "null";
   String button1Text = "null";
   String button2Text = "null";
   int end = 0;

   
   GW_DeathDragons(){
      setUp();
   }
   
   public void setUp(){
   
      //System.out.println("What would you like to be called?");
      //name = input.next();
      System.out.println("");
   }
   
   public String getName(){
      
      return(name); }
      
   public String getButton1Text() {
   
      return(button1Text); }
      
   public String getButton2Text() {
   
      return(button2Text); }
      
   public String getLabel() {
   
      return(label); }

   public void setName(String n) {
      
       name = n; }  
      
   public void setButton1Text(String b1) {
      
       button1Text = b1; }
       
   public void setButton2Text(String b2) {
      
      button2Text = b2; }
      
   public void setLabel(String l) {
      
      label = l; }  

   
   public void visitSeerORno() {
      
      String labelStr = "visit seer?";
      setLabel(labelStr);
      
      String b1Str = "yes";
      setButton1Text(b1Str);
      
      String b2Str = "no";
      setButton2Text(b2Str); 
      
      System.out.println(labelStr);
      System.out.println("Click 1 for yes and 0 for no");
      
      int action = input.nextInt();
      
      if(action == 1) {
         seer(); } 
      else {
         end = 1;
         noSeer(); } 

      }

   public void noSeer() {
      
      String labelStr = "Fuck you";
      setLabel(labelStr);
      
      System.out.println(labelStr);

      }
    
      
   public void seer() {
      
      String labelStr = "seer info: do you believe?";
      setLabel(labelStr);
      
      String b1Str = "yes";
      setButton1Text(b1Str);
      
      String b2Str = "no";
      setButton2Text(b2Str); 
      
      System.out.println(labelStr);
      System.out.println("Click 1 for yes and 0 for no");
      
      int action = input.nextInt();
      
      if(action == 1) {
         end = 1; //delete later
         believer(); } 
      else {
         end = 1;
         noSeer(); } 
      }
 
   public void believer() {
      
      String labelStr = "You fought the dragons and saved the World!";
      setLabel(labelStr);
      
 //     String b1Str = "yes";
 //     setButton1Text(b1Str);
      
 //     String b2Str = "no";
 //     setButton2Text(b2Str); 
      
 //     System.out.println(labelStr);
 //     System.out.println("Click 1 for yes and 0 for no");
      
 //     int action = input.nextInt();
      
 //     if(action == 1) {
 //        believer(); } //change name later
 //     else {
 //        nonBeliever(); } //change later –> doesn't compile until functs are added

      }
      
      }
