import java.util.*;

class GW_DeathDragons {

   Scanner input = new Scanner (System.in);

   String name = "null";
   String label = "null";
   String button1Text = "null";
   String button2Text = "null";
   int end = 0;
   String branch = "null";

   
   GW_DeathDragons(){
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
      
   public void setEnd(int e) {
      end = e; } 
      
  
   public void goChoice(int c) {
      
      if(branch.equals("start seer")){
         if(c == 1){
            seer();
         } else {
            noSeer(); }
      }
      
      if(branch.equals("believe")){
         if(c == 1){
            believer();
         } else {
            nonBeliever(); }
      }
      
      if(branch.equals("no seer")){
         if(c == 1){
            burnOutside();
         } else {
            burnInside(); }
      }

      if(branch.equals("home or guild")){
         if(c == 1){
            doNothing();
         } else {
            guildMeeting(); }
      }
     if(branch.equals("guild")){
         if(c == 1){
            fightAlone();
         } else {
            rallyPeople(); }
      }
     if(branch.equals("leader")){
         if(c == 1){
            convinceKing();
         } else {
            beheadKing(); }
      }

   }

  
   public void visitSeerORno() {
      
      branch = "start seer";
      
      String labelStr = "You’ve been hearing a lot about these dragon incidents, but you don’t have a lot of information beyond vague rumors.  The Seer always has a lot to say, but not everything she says can be trusted.  Would you like to visit the Seer and find out what she knows?";
      setLabel(labelStr);
      
      String b1Str = "yes";
      setButton1Text(b1Str);
      
      String b2Str = "no";
      setButton2Text(b2Str); 

      }

  
   public void noSeer() {
      
      branch = "no seer";
      
      String labelStr = "You decide not to pursue the issue and continue to live your life as normal.  One day you wake up to the smell of smoke.  Your house is on fire!  You go to open your bedroom door, but it’s hot.  You look at your window–you live on the second floor, you could probably make it if you jumped.";
      setLabel(labelStr);
      
      String b1Str = "jump";
      setButton1Text(b1Str);
      
      String b2Str = "stay";
      setButton2Text(b2Str); 


      }

   public void burnOutside() {
      
      String labelStr = "You jump out the window and slam into the ground.  Your ankle aches as you stand up.  You look around and notice with horror that everything’s on fire.  Then you see them, dragons, and they’re everywhere.  The rumors were true and now it’s too late change anything.";
      setLabel(labelStr);

      setEnd(1);

      }   
      
   public void burnInside() {
      
      String labelStr = "You stay put as the room fills with smoke.  You’ll never know how the fire started, but you do know that your story is about to be cut short.";
      setLabel(labelStr);

      setEnd(1);

      }    
 
    public void nonBeliever() {
      
      branch = "no seer";
      
      String labelStr = "You decide that the dragon killers are deluded and leave the seer lair to continue to live your life as normal.  One day you wake up to the smell of smoke.  Your house is on fire!  You go to open your bedroom door, but it’s hot.  You look at your window–you live on the second floor, you could probably make it if you jumped.";
      setLabel(labelStr);
      
      String b1Str = "jump";
      setButton1Text(b1Str);
      
      String b2Str = "stay";
      setButton2Text(b2Str); 
      
      //setEnd(1);

      }
      
   public void seer() {
      
      branch = "believe";
      
      String labelStr = "The seer gives you conflicting information and offers to give you the location of a guild of dragon killers where you might be able to learn more.  She scrawls the location on a bit of parchment, but before she hands it to you she hesitates.  She asks: Do you believe that dragons are the problem?";
      setLabel(labelStr);
      
      String b1Str = "yes";
      setButton1Text(b1Str);
      
      String b2Str = "no";
      setButton2Text(b2Str); 
      
      }
 
  
   public void believer() {
      
      branch = "home or guild";
      
      String labelStr = "You take the parchment, but as you walk away you’re not sure if you will actually visit the guild.  You believe that dragons are burning houses, but you’ve never seen any in your town and the guild is so far away.  Can you really be expected to drop everything in your life to go fight dragons? ";
      setLabel(labelStr);
      
      String b1Str = "go home";
      setButton1Text(b1Str);
      
      String b2Str = "go to guild";
      setButton2Text(b2Str); 
      

      }
      
   public void doNothing() {
      
      branch = "no seer";
      
      String labelStr = "You go home and continue to live your life as normal.  One day you wake up to the smell of smoke.  Your house is on fire!  You go to open your bedroom door, but it’s hot.  You look at your window–you live on the first floor, you could probably make it if you jumped.";
      setLabel(labelStr);
      
      String b1Str = "jump";
      setButton1Text(b1Str);
      
      String b2Str = "stay";
      setButton2Text(b2Str); 
      

      }
      
   public void guildMeeting() {
      
      branch = "guild";
      
      String labelStr = "On the parchment is a simple note:  The Lone Tavern, Beor, nightfall.  When you arrive at the tavern you see a assortment of odd characters–knights in shiny and not so shiny armour and scientists huddled together, arguing amongst themselves, presumably about some complicated theory or another.  The meeting was long, but the message was clear: dragons are wreaking havoc on the world and must be stopped.";
      setLabel(labelStr);
      
      String b1Str = "fight alone";
      setButton1Text(b1Str);
      
      String b2Str = "rally people";
      setButton2Text(b2Str); 
      

      }
      
   public void fightAlone() {
      
      branch = "loner";
      
      String labelStr = "**Dies in dragon duel**"; //will change
      setLabel(labelStr);
      
//      String b1Str = "tbd";
//      setButton1Text(b1Str);
      
//      String b2Str = "tbd";
//      setButton2Text(b2Str); 
      

      }
      
   public void rallyPeople() {
      
      branch = "leader";
      
      String labelStr = "**takes down the government**"; //again, needs some finesse
      setLabel(labelStr);

      String b1Str = "convince king";
      setButton1Text(b1Str);
      
      String b2Str = "behead king";
      setButton2Text(b2Str); 
      

      }
      
   public void convinceKing() {
      
      branch = "not convinced";
      
      String labelStr = "**is not convinced, world ends**"; //again, needs some finesse
      setLabel(labelStr);

      setEnd(1);
           

      }

   public void beheadKing() {
      
      branch = "headless";
      
      String labelStr = "**Success!**"; //finesse
      setLabel(labelStr);

      setEnd(1);
      

      }

      
      }
      
