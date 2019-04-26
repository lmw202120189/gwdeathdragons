import java.util.*;

class GW_DeathDragons {

   Scanner input = new Scanner (System.in);

   String name = "null";
   String label = "null";
   String button1Text = "null";
   String button2Text = "null";

   
   GW_DeathDragons(){
      setUp();
   }
   
   public void setUp(){
   
      System.out.println("What would you like to be called?");
      name = input.next();
      System.out.println("exposition exposition exposition exposition");
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
      
      String labelStr = "description+would you like to visit the seer or whatevs";
      setLabel(labelStr);
      
      String b1Str = "yes";
      setButton1Text(b1Str);
      
      String b2Str = "no";
      setButton2Text(b2Str); }
      

      
      }

