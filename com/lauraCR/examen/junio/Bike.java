/**
 * Se ha creado un nuevo repositorio para poder hacer dicho ejercicio
 * @author laura caballero ruiz
 */
package com.lauraCR.examen.junio;
/**
 * Nombramos el speend y el gear
 * @author laura
 *
 */
class Bike {  
  int speed;
  int gear;
    /**
     * introducimos un nuevo parametro
     * @param newGear
     */
  public void changeGear(int newGear){     
      gear = newGear;
  }
    
  /**
   * incrementamos el speed
   * @param increment
   */
  public void speedUp(int increment){
      speed = speed + increment;
  }
  /**
   * aplicamos recreos en el speed  
   * @param decrement
   */
  public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
   /**
    * aplicamos este apartado para que se muestre el speed y el gear 
    */
  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

/**
 * devuelve un toString
 * @return
 */
@Override
public String toString() {
	return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
}
  
}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of Bicycle
//      // doing some operations
//      Bicycle bicycle = new Bicycle();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("Bicycle present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}