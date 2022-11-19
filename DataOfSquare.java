import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	
	//ArrayList that'll contain the colors
	ArrayList<Color> colors =new ArrayList<Color>();
	int color; //2: snake , 1: food, 0:empty 
	SquarePanel square;
	public DataOfSquare(int col){
		
		//Lets add the color to the arrayList
		colors.add(Color.darkGray);//0
		colors.add(Color.BLUE);    //1
		colors.add(Color.white);   //2
		color=col;
		square = new SquarePanel(colors.get(color));
	}
    public void lightMeUp(int c){
        square.ChangeColor(colors.get(c));
    }
}