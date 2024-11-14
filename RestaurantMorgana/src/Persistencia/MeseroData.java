
package Persistencia;

import Modelo.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date ;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class MeseroData {
    // Atributo
    private Connection con; // Conexión a la base de datos
    private static final String[] SECTORES = {"Terraza", "Patio", "Comedor"};
    private static final String[] TURNOS = {"Mañana", "Tarde"};

    // Constructor
    public MeseroData(Connection connection) {
        this.con = connection; // Asigna la conexión proporcionada
    }
    
    // 1. Guardar Mesero nuevo
    public void guardarMesero(Mesero mesero) {
         String sql = "INSERT INTO mesero (idMesero, nombre, dni, telefono, email, fechaRegistro, turno, sector, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            setMeseroParameters(ps, mesero);
            ps.executeUpdate();
            System.out.println("Mesero registrado exitosamente\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar mesero: " + ex.getMessage());
        }
    }
 
    // 2. Buscar mesero por ID
    public Mesero buscarMeseroPorId(int idMesero) {
        String sql = "SELECT * FROM mesero WHERE idMesero = ?";
        return obtenerMeseroPorParametro(sql, idMesero);
    }
    
    // 3. Buscar mesero por DNI
    public List<Mesero> obtenerMeseroPorDni(String dni) {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE dni LIKE ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dni + "%"); // Aquí usamos dni como String para el LIKE

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    meseros.add(crearMeseroDesdeResultSet(rs));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar meseros por DNI: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return meseros;
    }



    // 4. Modificar mesero
    public void modificarMesero(Mesero mesero){
        String sql = "UPDATE mesero SET nombre = ?, dni = ?, telefono = ?, email = ?, fechaRegistro = ?, turno = ?, sector = ?, estado = ? WHERE idMesero = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
        
        
        ps.setString(1, mesero.getNombre());
        ps.setInt(2, mesero.getDni());
        ps.setString(3, mesero.getTelefono());
        ps.setString(4, mesero.getEmail());
        ps.setDate(5, Date.valueOf(mesero.getFechaRegistro()));
        ps.setString(6, mesero.getTurno());
        ps.setString(7, mesero.getSector());
        ps.setBoolean(8, mesero.getEstado());
        
        ps.setInt(9, mesero.getIdMesero());
        
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Mesero modificado exitosamente.\n");
            } else {
                System.out.println("No se encontró un mesero con el ID: " + mesero.getIdMesero());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el mesero: " + ex.getMessage());
        }
    }

    // 5. Alta logica Mesero
    public void altaLogicaMesero(int id){
        String sql = "UPDATE mesero SET estado = ? WHERE idMesero = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, true); //mesero activo
            ps.setInt(2, id);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Mesero dado de alta correctamente. \n");
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de alta el mesero: " + ex.getMessage());
        }
    }

    // 6. Baja logica Mesero
    public void bajaLogicaMesero(int id) {
        String sql = "UPDATE mesero SET estado = ? WHERE idMesero = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, false); // mesero inactivo
            ps.setInt(2, id); 

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Mesero dado de baja correctamente. \n");
           
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja el mesero: " + ex.getMessage());
        }

    }
    
    // 7. Listar meseros
    public List<Mesero> listarMeseros(){
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE estado = true";

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                meseros.add(crearMeseroDesdeResultSet(rs));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los meseros: " + ex.getMessage());
        }

        return meseros;
    }
    
    // 8. Eliminar mesero por ID
    public void eliminarMesero(int id){
        String sql = "DELETE FROM mesero WHERE idMesero = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);  // Asignamos el ID del mesero a eliminar

            int filasAfectadas = ps.executeUpdate();  // Ejecutamos la eliminación

            if (filasAfectadas > 0) {
                System.out.println("Mesero eliminado correctamente.");
            } else {
                System.out.println("No se encontró un mesero con el ID: " + id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el mesero: " + ex.getMessage());
        }
    }
    
    
    
    public List<Mesero> obtenerMeseroPorNombre(String nombreMesero) {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE nombre LIKE ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreMesero + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    meseros.add(crearMeseroDesdeResultSet(rs));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar meseros por nombre: " + ex.getMessage());
        }

        return meseros;
    }
    
    private Mesero crearMeseroDesdeResultSet(ResultSet rs) throws SQLException {
        return new Mesero(
            rs.getInt("idMesero"),
            rs.getString("nombre"),
            rs.getInt("dni"),
            rs.getString("telefono"),
            rs.getString("email"),
            rs.getDate("fechaRegistro").toLocalDate(),
            rs.getString("turno"),
            rs.getString("sector"),
            rs.getBoolean("estado")
        );
    }

    private void setMeseroParameters(PreparedStatement ps, Mesero mesero) throws SQLException {
        ps.setInt(1, mesero.getIdMesero());
        ps.setString(2, mesero.getNombre());
        ps.setInt(3, mesero.getDni());
        ps.setString(4, mesero.getTelefono());
        ps.setString(5, mesero.getEmail());
        ps.setDate(6, Date.valueOf(mesero.getFechaRegistro()));
        ps.setString(7, mesero.getTurno());
        ps.setString(8, mesero.getSector());
        ps.setBoolean(9, mesero.getEstado());
    }
    
    private Mesero obtenerMeseroPorParametro(String sql, int parametro) {
        Mesero mesero = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, parametro);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    mesero = crearMeseroDesdeResultSet(rs);
                } else {
                    System.out.println("No se encontró un mesero con el parámetro dado: " + parametro);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el mesero: " + ex.getMessage());
        }

        return mesero;
    }


    public List<Mesero> listarMeserosPorEstado(boolean estado) {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE estado = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    meseros.add(crearMeseroDesdeResultSet(rs));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar meseros por estado: " + ex.getMessage());
        }

        return meseros;
    }

    public List<Mesero> listarMeserosPorSector(String sector) {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE LOWER(sector) = LOWER(?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sector); // No es necesario convertir aquí, ya que la consulta lo hace
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    meseros.add(crearMeseroDesdeResultSet(rs));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar meseros por sector: " + ex.getMessage());
        }

        return meseros;
    }


    public List<Mesero> listarMeserosPorTurno(String turno) {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE LOWER(turno) = LOWER(?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, turno); // No es necesario convertir aquí, ya que la consulta lo hace
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    meseros.add(crearMeseroDesdeResultSet(rs));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar meseros por turno: " + ex.getMessage());
        }

        return meseros;
    }

    
    public void asignarSectoresYTurnosAleatoriamente() {
        List<Mesero> meseros = listarMeseros();
        Random random = new Random();
        
        if (meseros!= null){

        for (Mesero mesero : meseros) {
            // Selección aleatoria de sector y turno
            String sector = SECTORES[random.nextInt(SECTORES.length)];
            String turno = TURNOS[random.nextInt(TURNOS.length)];

            // Asignamos sector y turno al mesero
            mesero.setSector(sector);
            mesero.setTurno(turno);

            // Actualizamos el mesero en la base de datos
            modificarMesero(mesero);    
        }
        JOptionPane.showMessageDialog(null,"Asignación aleatoria de sectores y turnos completada.");
        }else{
            JOptionPane.showMessageDialog(null,"error listar meseros");    
                }
  
    }
    
    public List<Mesero> obtenerMeseroPorTelefono(String telefono) {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero WHERE telefono LIKE ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, telefono + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    meseros.add(crearMeseroDesdeResultSet(rs));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar meseros por teléfono: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return meseros;
    }

  
    public Mesero buscarMeseroPorDni1(int dni) {
         String sql = "SELECT * FROM mesero WHERE dni = ?";
        return obtenerMeseroPorParametro(sql, dni);
    } 
}

