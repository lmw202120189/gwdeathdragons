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
      
   public int getEnd() {
   
      return(end); }

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
      
      else if(branch.equals("believe")){
         if(c == 1){
            believer();
         } else {
            nonBeliever(); }
      }
      
      else if(branch.equals("no seer")){
         if(c == 1){
            burnOutside();
         } else {
            burnInside(); }
      }

      else if(branch.equals("home or guild")){
         if(c == 1){
            doNothing();
         } else {
            guildMeeting(); }
      }
     else if(branch.equals("guild")){
         if(c == 1){
            fightAlone();
         } else {
            rallyPeople(); }
      }
     else if(branch.equals("leader")){
         if(c == 1){
            convinceKing();
         } else {
            beheadKing(); }
      }
     else if(branch.equals("loner")){
         if(c == 1){
            dodge();
         } else {
            shoot(); }
      }
     else if(branch.equals("run right")){
         if(c == 1){
            arrow();
         } else {
            sword(); }
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
      
      String labelStr = "One of the knights tells you about a dragon sighting in a nearby village and gives you the weapons you’ll need to slay it.  You travel there and when you arrive, the dragon has already begun to burn down buildings.  You pull out a bow an arrow and shoot the it in the back.  The arrow looks barely larger than a pin on its massive, scaly back.  It snaps its head around and looks directly at you.";
      setLabel(labelStr);
      
      String b1Str = "dodge to the side";
      setButton1Text(b1Str);
      
      String b2Str = "shoot another arrow";
      setButton2Text(b2Str); 
      

      }
      
   public void dodge() {
      
      branch = "dodger";
      
      String labelStr = "You dodge just in time to avoid a white hot blast of flame.  You look up at the dragon and can already see a glow emanating from its throat.  You see the what’s left of a chimney to your right, but you’re not sure if you’ll make it.  Closer to the left is a charred barn.";
      setLabel(labelStr);
      
      String b1Str = "run left";
      setButton1Text(b1Str);
      
      String b2Str = "run right";
      setButton2Text(b2Str); 
      

      } 
      
   public void rLeft() {
      
      branch = "run left";
      
      String labelStr = "You run as fast as you can and duck behind the barn.  As you do, a blast of flame hits the barn and the wall that’s protecting you burns to ash, leaving you exposed to the fire.  You died.";
      setLabel(labelStr);
      
      setEnd(1);     

      }
      
   public void rRight() {
      
      branch = "run right";
      
      String labelStr = "You run as fast as you can and duck behind the chimney.  As you do, a blast of flame hits it and the bricks heat up rapidly.  The dragon is quickly getting closer. You’re down to one arrow. Do you want to use your bow and last arrow or sacrifice the safety of range and use your sword?  ";
      setLabel(labelStr);
      
      String b1Str = "use your bow";
      setButton1Text(b1Str);
      
      String b2Str = "use your sword";
      setButton2Text(b2Str); 

      }
 
    public void arrow() { //still needs text
      
      branch = "arrow";
      
      String labelStr = ""; 
      setLabel(labelStr);
      
      String b1Str = "";
      setButton1Text(b1Str);
      
      String b2Str = "";
      setButton2Text(b2Str); 

      }

      
   public void sword() {
      
      branch = "sword";
      
      String labelStr = "";
      setLabel(labelStr);
      
      setEnd(1);     

      }
      
   public void shoot() {
      
      branch = "shooter";
      
      String labelStr = "As you pull the string back on your bow, you see flames headed directly toward you.  You try to dodge, but it’s too late.  You don’t even have time to take a breath before you’re engulfed in flames.";
      setLabel(labelStr);
      
      setEnd(1); 

      }
           
   public void rallyPeople() {
      
      branch = "leader";
      
      String labelStr = "After talking more to the members of the guild, you decide that this problem is not one that you can fight on your own. You are inspired by the so-called dragon killers, but you also know that you don’t have the years of knowledge that they do. You decide to rally your friends and family; other civilians like yourself. After weeks of travel, you reach the castle, and finally, the king himself, who has historically been a nonbeliever. \n\nDo you try to convince him that the world is in danger, or do you seize your chance to take action and behead him?";
      setLabel(labelStr);

      String b1Str = "convince king";
      setButton1Text(b1Str);
      
      String b2Str = "behead king";
      setButton2Text(b2Str); 
      

      }
      
   public void convinceKing() {
      
      branch = "not convinced";
      
      String labelStr = "The King remains unconvinced, as he is profiting heavily off of dragon eggs. He throws you out of his castle and exiles you from the kingdom. He does this to anyone who dares to suggest that the dragons are a problem, and soon the world perishes in a fiery death."; //again, needs some finesse
      setLabel(labelStr);

      setEnd(1);
           

      }

   public void beheadKing() {
      
      branch = "headless";
      
      String labelStr = "You heard from the dragon killers that the King was profiting off dragon eggs, so you knew he wouldn’t be swayed by words. Instead, you reach for your sword, and in one swift motion, behead the king. You step up in his action, ban the practice of breeding dragons, and soon the world begins to heal."; //finesse
      setLabel(labelStr);

      setEnd(1);
      

      }

      
      }
