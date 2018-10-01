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
public class Carro {
    private int x;
    private int y;
    private Llanta llantas[];
    private Chasis chasis;
    
    public Carro(int x, int y){
        this.x=x;
        this.y=y;
        this.llantas=new Llanta[2];
        this.llantas[0]=new Llanta(x, y);
        this.llantas[1]=new Llanta(x, y);
        this.chasis=new Chasis(x, y);
    } 
    public void mover(int newX, int newY){
        this.x=newX;
        this.y=newY;
        for (int i = 0; i < 2; i++) {
            this.llantas[i].mover(newX, newY);
        }
        this.chasis.mover(newX, newY);
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

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    
}
