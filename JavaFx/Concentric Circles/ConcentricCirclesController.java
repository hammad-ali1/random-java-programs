import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;

public class ConcentricCirclesController {
    @FXML
    private BorderPane borderPane;

    @FXML
    private Canvas canvas;
    
    //enum CircleType
    private enum CircleType {Cone, Concentric};
    //height of ToolBar
    final int TOOL_BAR_HEIGHT = 40;
    //canvas height and width
    private int height;
    private int width;
    //resize canvas to fill borderPane
    private void resizeCanvas(){
        canvas.setWidth(borderPane.getWidth());
        canvas.setHeight(borderPane.getHeight() - TOOL_BAR_HEIGHT);
        height = (int) canvas.getHeight();
        width = (int) canvas.getWidth();
    }
    //clear canvas
    private void clearCanvas(){
        canvas.getGraphicsContext2D().clearRect(0, 0, width, height);
    }
    private void drawConsecutiveCircles(CircleType choice, final int GAP_BETWEEN_CIRCLES){
        int x1 = 0;
        int y1 = 0;
        int boundingRectWidth = (int) width;
        int boundingRectHeight = (int) height;
        int diameter = boundingRectWidth < boundingRectHeight? boundingRectWidth : boundingRectHeight;
        final int NUMBER_OF_CIRCLES = diameter / GAP_BETWEEN_CIRCLES;
        switch(choice){
            case Cone:
                for(int i = 0; diameter > 0 && i < NUMBER_OF_CIRCLES; i++){
                    canvas.getGraphicsContext2D().strokeOval(x1, y1, diameter, diameter);
                    diameter -= GAP_BETWEEN_CIRCLES;
                }
                break;
            case Concentric:
                for(int i = 0; diameter > 0 && i < NUMBER_OF_CIRCLES; i++){
                    canvas.getGraphicsContext2D().strokeOval(x1, y1, diameter, diameter);
                    diameter -= 2*GAP_BETWEEN_CIRCLES;
                    x1 += GAP_BETWEEN_CIRCLES;
                    y1 += GAP_BETWEEN_CIRCLES; 
                }
                break;
                
        }
    }
    @FXML
    void drawConcentricCirclesButtonPressed(ActionEvent event) {
        resizeCanvas();
        clearCanvas();
        drawConsecutiveCircles(CircleType.Concentric, 30);
    }

    @FXML
    void drawConeButtonPressed(ActionEvent event) {
        resizeCanvas();
        clearCanvas();
        drawConsecutiveCircles(CircleType.Cone, 30);
    }
}
