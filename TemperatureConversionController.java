import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TemperatureConversionController implements Initializable {

    @FXML
    private TextField lblResult;
    @FXML
    private TextField txtInput;
    @FXML
    private ComboBox comboConversion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboConversion.setItems(FXCollections.observableArrayList("Celsius to Fahrenheit", "Fahrenheit to Celcius"));
        comboConversion.setVisibleRowCount(2);

    }


    @FXML
    public void handleSelectComboBox(ActionEvent event) {
        double inputTemp = Double.parseDouble(txtInput.getText());
        double tempValue = 0;

        int selectedIndex = comboConversion.getSelectionModel().getSelectedIndex();

        switch (selectedIndex) {
            case 0:
                tempValue = TemperatureConversionModel.getTemperatureInFahrenheit(inputTemp);
                break;
            case 1:
                tempValue = TemperatureConversionModel.getTemperatureInCelsius(inputTemp);
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");
        }

        String resultText = String.valueOf(tempValue);
        lblResult.setText(resultText);
    }
}
