/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase011018;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private GraphicsContext gc;
    private Carro carro;
    private Rectangulo rectAlien;
    private Rectangulo rectNave;
    private Image fondo;
    private Image alien;
    private Image nave;
    private Image PartesCasa;
    private int contador;
    private int cambio;
    
    public LoopJuego(GraphicsContext gc){
        this.gc=gc;
        this.carro=new Carro(10, 40);
        this.rectAlien=new Rectangulo(32, 96);
        this.rectNave=new Rectangulo(120, 105);
        this.fondo=new Image("Image/bg5.jpg");
        this.alien=new Image("Image/alien.png");
        this.nave=new Image("Image/spaceship.png");
        this.PartesCasa=new Image("Image/PartesCasa.png");
        this.contador=0;
        this.cambio=0;
        //Buscar parallel scroll
    }
    
    @Override
    public void handle(long l){
        double xpoints[]={carro.getChasis().getX(), carro.getChasis().getX()+20, carro.getChasis().getX()+50, carro.getChasis().getX()+70, carro.getChasis().getX()}; //Coordenadas de los vertices del polígono
       double ypoints[]={carro.getChasis().getY(), carro.getChasis().getY()-20, carro.getChasis().getY()-20, carro.getChasis().getY(), carro.getChasis().getY()};
        //gc.fillPolygon(ypoints, ypoints, xpoints.length);
        
        gc.clearRect(0, 0, 700, 700);
        gc.drawImage(fondo, 0, 0);
        gc.setFill(Color.BLACK);
        gc.fillRect(rectAlien.getX()+5, rectAlien.getY()+14, 22, 35);
        gc.drawImage(alien, 32*cambio, 48, 32, 48, rectAlien.getX(), rectAlien.getY(), 32, 48); //Imagen, posicion en la imagen, ancho y largo, posicion en el canvas
        gc.fillRect(rectNave.getX(), rectNave.getY(), 40, 40);
        gc.drawImage(nave, rectNave.getX(), rectNave.getY(), 40, 50);
        
        Shape alienRectangulo=new Rectangle(rectAlien.getX(), rectAlien.getY(),22,35);
        Shape naveRectangulo=new Rectangle(rectNave.getX(), rectNave.getY(), 40, 40);
        Shape interseccion=SVGPath.intersect(alienRectangulo, naveRectangulo);
        if(interseccion.getBoundsInLocal().getWidth()!=-1){
            stop();
        }
        
        gc.setFill(Color.PURPLE);
        //gc.fillPolygon(xpoints, ypoints, xpoints.length);
        //gc.fillRect(carro.getChasis().getX()-20, carro.getChasis().getY(), 110, 20);
        //gc.setFill(Color.WHITE);
        //gc.fillOval(carro.getLlantas()[0].getX(), carro.getLlantas()[0].getY(), 20, 20);
        //gc.fillOval(carro.getLlantas()[1].getX(), carro.getLlantas()[1].getY(), 20, 20);
        //carro.moverEnX();
       rectAlien.moverEnX();
       //rectNave.moverEnX();
       contador++;
       
       
       if(contador%10==0){
           cambio++;
       }
       if(cambio>2){
           cambio=0;
       }
        
}
}