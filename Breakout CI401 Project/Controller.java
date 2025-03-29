// The breakout controller converts key presses from the user (received by the View object)
// into commands for the game (in the Model object)

// we need to use on JavaFX class
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Controller
{
  // instance variables for the two other components of the MVC model  
  public Model model;
  public View  view;
  public GameObj gameobj;
  public int width;
  public int height; 
  

  
  
  
 
 public Controller( int w, int h )
    {
        Debug.trace("Model::<constructor>");  
        width = w; 
        height = h;
}
  // we don't really need a constructor method, but include one to print a 
  // debugging message if required
  public Controller()
  {
    Debug.trace("Controller::<constructor>");
  }
   
        
  
  // This is how the View talks to the Controller
  // AND how the Controller talks to the Model
  // This method is called by the View to respond to key presses in the GUI
  // The controller's job is to decide what to do. In this case it converts
  // the keypresses into commands which are run in the model
  public void userKeyInteraction (KeyEvent event )
  {
    // print a debugging message to show a key has been pressed
    Debug.trace("Controller::userKeyInteraction: keyCode = " + event.getCode() );
   
    
    // KeyEvent objects have a method getCode which tells us which key has been pressed.
    // KeyEvent also provides variables LEFT, RIGHT, F, N, S (etc) which are the codes
     // for individual keys. So you can add keys here just by using ther name (which you
    // can find out by googling 'JavaFX KeyCode')
    
    switch ( event.getCode())             
    {
      case LEFT:                     // Left Arrow
        model.moveBat( -1);
        
        break;
      
          
      case RIGHT:                    // Right arrow
        model.moveBat( +1 );      // Move bat right
        break;
      
      case P:
        model.BALL_MOVE=0;
        model.BAT_MOVE=0;
        break;
        
      case C:
        model.BALL_MOVE=3;
        model.BAT_MOVE=5;
        break;
      
      case F :
        // Very fast ball movement
        model.setFast(true);
        break;
      case N :
        // Normal speed ball movement
        model.setFast(false);
        break;
      case S :
        // stop the game
        model.setGameState("finished");
        break;
    }
  }
}
