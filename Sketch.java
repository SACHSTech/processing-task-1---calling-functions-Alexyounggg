import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255,250,250);
    
    // White background
    noStroke();
    fill(40, 50, 200);
    rect(0, 0, 400, 200);
    
    stroke(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  // Bottom snow ball
	  fill(255,250,250);
	  ellipse(200, 200, 150, 150);
	  
	  // Middle snow ball
	  fill(255,250,250);
	  ellipse(200, 100, 100, 100);
	  
	  // Top snow ball
	  fill(255,250,250);
	  ellipse(200, 50, 75, 75);
	  
	  // Left eye
	  fill(0,0,0);
	  ellipse(190, 40, 5, 5);
	  
	  // Right eye
	  fill(0,0,0);
	  ellipse(215, 40, 5, 5);
	  
	  // Bottom button
	  fill(0,0,0);
	  ellipse(200, 215, 15, 15);
	  
	  // Middle button 
	  fill(0,0,0);
	  ellipse(200, 180, 15, 15);
	  
	  // Top button
	  fill(0,0,0);
	  ellipse(200, 110, 15, 15);
	  
	  // Smile
	  fill(0,0,0);
	  arc(200, 50, 10, 10, 0, PI); 
	  
	  // Sun
	  fill(255,255,0);
	  ellipse(390, 10, 50, 50);
	  
	  // Left arm
	  line(50, 50, 150, 100);
	  
	  // Right arm
	  line(250, 100, 350, 50);
	  
	  
	 
  }
  
  
  
}