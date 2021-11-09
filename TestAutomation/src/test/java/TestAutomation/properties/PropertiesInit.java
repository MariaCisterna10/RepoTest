package TestAutomation.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInit {

    private static Properties parametros;
    private String lblFirstName;
    private String lblLastName;
    private String lblEmail;
    private String lblStartDate;
    private String btnCreate;
    private String btnEdit;
    private String btnSave;
    private String btnCancel;
    private String btnDelete;
    private String btnLogout;

    public PropertiesInit() {
        Properties parametros;
        File propFileName = new File("src/test/resources/config/TextValidation.properties").getAbsoluteFile();
        FileInputStream inputStream;

        try {
            inputStream = new FileInputStream(propFileName);
            parametros = new Properties();
            parametros.load(inputStream);

            setLblFirstName(parametros.getProperty("lblFirstName"));
            setLblLastName(parametros.getProperty("lblLastName"));
            setLblEmail(parametros.getProperty("lblEmail"));
            setLblStartDate(parametros.getProperty("lblStartDate"));
            setBtnCreate(parametros.getProperty("btnCreate"));
            setBtnEdit(parametros.getProperty("btnEdit"));
            setBtnSave(parametros.getProperty("btnSave"));
            setBtnCancel(parametros.getProperty("btnCancel"));
            setBtnDelete(parametros.getProperty("btnDelete"));
            setBtnLogout(parametros.getProperty("btnLogout"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getParametros() {
        return parametros;
    }

    public static void setParametros(Properties parametros) {
        PropertiesInit.parametros = parametros;
    }

    public String getLblFirstName() {
        return lblFirstName;
    }

    public void setLblFirstName(String lblFirstName) {
        this.lblFirstName = lblFirstName;
    }

    public String getLblLastName() {
        return lblLastName;
    }

    public void setLblLastName(String lblLastName) {
        this.lblLastName = lblLastName;
    }

    public String getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(String lblEmail) {
        this.lblEmail = lblEmail;
    }

    public String getLblStartDate() {
        return lblStartDate;
    }

    public void setLblStartDate(String lblStartDate) {
        this.lblStartDate = lblStartDate;
    }

    public String getBtnCreate() {
        return btnCreate;
    }

    public void setBtnCreate(String btnCreate) {
        this.btnCreate = btnCreate;
    }

    public String getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(String btnEdit) {
        this.btnEdit = btnEdit;
    }

    public String getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(String btnSave) {
        this.btnSave = btnSave;
    }

    public String getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(String btnCancel) {
        this.btnCancel = btnCancel;
    }

    public String getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(String btnDelete) {
        this.btnDelete = btnDelete;
    }

    public String getBtnLogout() {
        return btnLogout;
    }

    public void setBtnLogout(String btnLogout) {
        this.btnLogout = btnLogout;
    }
}
