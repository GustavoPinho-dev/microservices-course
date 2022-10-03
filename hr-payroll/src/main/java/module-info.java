module com.devsuperior.hrpayroll {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.devsuperior.hrpayroll to javafx.fxml;
    exports com.devsuperior.hrpayroll;
}