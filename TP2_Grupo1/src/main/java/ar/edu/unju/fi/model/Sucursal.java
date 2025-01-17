package ar.edu.unju.fi.model;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class Sucursal {
    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "La calle es requerida")
    private String calle;

    @NotEmpty(message = "La provincia no debe estar vacía")
    private String provincia;

    @NotEmpty(message = "El día de apertura no debe estar vacío")
    private String diaApertura;

    @NotEmpty(message = "El día de cierre no debe estar vacío")
    private String diaCierre;

    @Min(value = 0, message = "La hora de apertura debe ser mayor o igual a 0")
    @Max(value = 23, message = "La hora de apertura debe ser menor o igual a 23")
    private int horaApertura;

    @Min(value = 0, message = "La hora de cierre debe ser mayor o igual a 0")
    @Max(value = 23, message = "La hora de cierre debe ser menor o igual a 23")
    private int horaCierre;

    @NotBlank(message = "El teléfono no debe estar en blanco")
    private String telefono;

    private Integer id;

    public Sucursal() {

    }
	public Sucursal(String nombre, String calle, String provincia, String diaApertura, String diaCierre, int horaApertura, int horaCierre,String telefono, int id) {

				this.nombre = nombre;
        this.calle = calle;
        this.provincia = provincia;
        this.diaApertura = diaApertura;
        this.diaCierre = diaCierre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.telefono = telefono;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDiaApertura() {
        return diaApertura;
    }

    public void setDiaApertura(String diaApertura) {
        this.diaApertura = diaApertura;
    }

    public String getDiaCierre() {
        return diaCierre;
    }

    public void setDiaCierre(String diaCierre) {
        this.diaCierre = diaCierre;
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
