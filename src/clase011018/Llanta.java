/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase011018;

/**
 *
 * @author Estudiante
 */
public class Llanta {
    int x;
    int y;
    public Llanta(int x, int y){
        this.x=x;
        this.y=y;
    } 
    public void mover(int newX, int newY){
        this.x=newX;
        this.y=newY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
