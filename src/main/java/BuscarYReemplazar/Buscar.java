package BuscarYReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Buscar extends Application {
	//DECLARAMOS LOS BOTONES , LABELS , TEXTFIELD , CHECKBOX
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazarTodoButton;
	private Button  cerrarButton;
	private Button ayudaButton;
	private Label buscarLabel;
	private Label reemplazarLabel;
	private TextField buscarText;
	private TextField reemplazarText;
	private CheckBox mayusCheckBox;
	private CheckBox expresionRegularCheckBox;
	private CheckBox buscarAtrasCheckBox;
	private CheckBox resaltarCheckBox;
	//
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
				
				//AÑADIMOS LOS TEXTFIELD DE BUSCAR  Y REEMPLAZAR
				buscarText = new TextField();
				buscarText.setPrefColumnCount(4);
				reemplazarText = new TextField();
				reemplazarText.setPrefColumnCount(4);
				
				//LE AÑADIMOS LOS LABELS ELEGIDOS
				buscarLabel = new Label("Buscar:");
				reemplazarLabel = new Label("Reemplazar con:  ");
				
				
				//COMENZAMOS CON LOS BOTONES 
				buscarButton = new Button("Buscar");
				reemplazarButton = new Button("Reemplazar");
				reemplazarTodoButton = new Button("Reemplazar todo");
				cerrarButton = new Button("Cerrar");
				ayudaButton = new Button("Ayuda");
				
				//LE DECIMOS QUE COJA EL ANCHO MAXIMO QUE PUEDA
				buscarButton.setMaxWidth(Double.MAX_VALUE);
				reemplazarButton.setMaxWidth(Double.MAX_VALUE);
				reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
				cerrarButton.setMaxWidth(Double.MAX_VALUE);
				ayudaButton.setMaxWidth(Double.MAX_VALUE);
				
				// SEGUIMOS CON LOS CHECKBOX 
				
				mayusCheckBox = new CheckBox("Mayúsculas y minúsculas");
				expresionRegularCheckBox = new CheckBox("Expresión regular");
				buscarAtrasCheckBox = new CheckBox("Buscar hacia atrás");
				resaltarCheckBox = new CheckBox("Resaltar resultados");
				
				//UNA VEZ YA TENEMOS LOS COMPONENTES , DECLARAMOS LOS VBOX Y HBOX
				
				VBox botones = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
				VBox labels = new VBox(15, buscarLabel, reemplazarLabel);
				VBox checkbox = new VBox(5, mayusCheckBox, expresionRegularCheckBox);
				VBox checkboxs = new VBox(5, buscarAtrasCheckBox, resaltarCheckBox);
				HBox checkboxes = new HBox(5, checkbox, checkboxs);
				VBox texts = new VBox(5, buscarText, reemplazarText, checkboxes);
				
				checkboxes.setStyle("-fx-background-color:#66ccff");
				botones.setStyle("-fx-background-color:red");
				texts.setStyle("-fx-background-color:blue");
				labels.setStyle("-fx-background-color:green");
				//GRIDPANE CON PADDING DE 5
				
				GridPane grid = new GridPane();
				grid.setPadding(new Insets(5));
			    //LES AÑADIMOS LAS PROPIEDADES
				grid.setVgap(5); 
			    grid.setHgap(5);
			    grid.setGridLinesVisible(false);
			    
			    grid.addRow(0, labels, texts, botones);//EN LA PRIMERA FILA AÑADIMOS:
			    // EN PRIMER LUGAR LABELS , SEGUNDO TEXTS DONDE ESTAN LOS INPUTS Y CHECKBOX , ULTIMO LOS BOTONES
			    
			    ColumnConstraints [] cols = {//DECLARAMOS QUE HAY 3 COLUMNAS
			  			new ColumnConstraints(),
			  			new ColumnConstraints(),
			  			new ColumnConstraints()
			  		};
			  	//LES AÑADIMOS LAS PROPIEDADES
			    grid.getColumnConstraints().setAll(cols);
			  	cols[1].setHalignment(HPos.CENTER);
			  	cols[1].setHgrow(Priority.ALWAYS);
			  	cols[1].setFillWidth(true);
			  	
				//
				// ESCENA
				
				Scene scene = new Scene(grid, 640, 200);

				primaryStage.setScene(scene);
				primaryStage.setTitle("Buscar y Reemplazar");
				primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
