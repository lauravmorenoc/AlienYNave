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
public class Chasis {
    int x;
    int y;
    public Chasis(int x, int y){
        this.x=x;
        this.y=y;
    } 
    public void mover(int newX, int newY){
        this.x=newX;
        this.y=newY;
    }
}
