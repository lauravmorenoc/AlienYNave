/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase011018;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        //Layout
        Pane pane1=new Pane();
        Canvas canvas; //Creacion del tablero de 300px por 300px
        canvas = new Canvas(300, 300);
        pane1.getChildren().add(canvas);
        
        Scene scene= new Scene(pane1, 300, 300, Color.WHITESMOKE);
        
        GraphicsContext gc= canvas.getGraphicsContext2D(); //lapiz para dibujar sobre el tablero
        gc.setFill(Color.PURPLE);
       // gc.fillRect(10, 10, 20, 20); //Posicion x, posicion y, ancho, alto (rectángulo) -->posicion de la esquina
        //gc.fillOval(30, 30, 20, 20); //Posicion x, posicion y, ancho, alto (rectángulo)
        //gc.fillOval(50, 30, 20, 20);
        //gc.strokeLine(38, 55, 60, 55); //xy inicial y xy final
       // Color arbitrario =new Color(50, 50, 50, 0); //Primeros tres rgb, último trasparencia 
       
      // double xpoints[]={10, 30, 20, 10}; //Coordenadas de los vertices del polígono
       //double ypoints[]={20, 40, 15, 10};
      // gc.strokePolygon(xpoints, ypoints, xpoints.length); //El último parámetro es la cantidad de puntos
        //cuando tiene stroke es vacío, fill es lleno
        
        LoopJuego loop=new LoopJuego(gc);
        loop.start();
        
        stage.setTitle("Ejemplo Canvas"); //aparece en la parte superior de la ventana
        stage.setScene(scene);
        stage.show();
        
    } 
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
