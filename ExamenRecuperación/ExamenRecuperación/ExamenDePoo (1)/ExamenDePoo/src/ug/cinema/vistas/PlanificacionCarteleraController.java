package ug.cinema.vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ug.cinema.modelo.Cines;
import ug.cinema.modelo.Pelis;
import ug.cinema.negocios.CineFacade;
import ug.cinema.negocios.PeliculasFacade;
import ug.cinema.repositorios.CineRepositorio;
import ug.cinema.repositorios.ICineDAO;
import ug.cinema.repositorios.IPeliculasDAO;
import ug.cinema.repositorios.PeliculasRepositorio;

public class PlanificacionCarteleraController extends Application implements Initializable {

    @FXML
    private ComboBox<Cines> cmbCine;

    @FXML
    private ComboBox<Pelis> cmbPelicula;

    @FXML
    private TableColumn<Pelis, String> colHorarios;

    @FXML
    private TableColumn<Pelis, String> colPelicula;

    @FXML
    private TableColumn<Pelis, String> colPrecio;

    @FXML
    private TableColumn<Pelis, String> colSala;

    @FXML
    private TableView<Pelis> tblCartelera;

    @FXML
    private Button btnGenerarCartelera;

    @FXML
    private TextField txtUbicacion;

    @FXML
    private TextField txtVigencia; // Campo de texto para la vigencia

    ICineDAO cineDao = new CineRepositorio();
    ObservableList<Cines> cineLista = FXCollections.observableArrayList();

    IPeliculasDAO peliculaDao = new PeliculasRepositorio();
    ObservableList<Pelis> peliculaLista = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cineLista.addAll(cineDao.consultarTodos());
        peliculaLista.addAll(peliculaDao.consultarTodos());

        cmbCine.setItems(cineLista);
        cmbCine.setConverter(new CineFacade());

        cmbPelicula.setItems(peliculaLista);
        cmbPelicula.setConverter(new PeliculasFacade());

        colPelicula.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colSala.setCellValueFactory(new PropertyValueFactory<>("sala"));
        colHorarios.setCellValueFactory(new PropertyValueFactory<>("horario"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
    }

    @FXML
    void OnSeleccionarCine(ActionEvent event) {
        Cines cineSeleccionado = cmbCine.getValue();
        if (cineSeleccionado != null) {
            txtUbicacion.setText(cineSeleccionado.getUbicacion());
        }
    }

    @FXML
    void OnGenerarCartelera(ActionEvent event) {
        Pelis peliculaSeleccionada = cmbPelicula.getValue();
        if (peliculaSeleccionada != null) {
            ObservableList<Pelis> peliculaTemporalLista = FXCollections.observableArrayList();
            peliculaTemporalLista.add(peliculaSeleccionada);
            tblCartelera.setItems(peliculaTemporalLista);
    
            txtVigencia.setText(peliculaSeleccionada.getVigencia()); 
        }
    }
    

    @FXML
    void OnSeleccionarPelicula(ActionEvent event) {

    }

    @Override
    public void start(Stage cartelera) throws Exception {
        Parent raiz = FXMLLoader.load(getClass().getResource("frmCartelera.fxml"));
        Scene ventanaCine = new Scene(raiz, 1000, 650);
        cartelera.setScene(ventanaCine);
        cartelera.setTitle("Cartelera de cine");
        cartelera.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
