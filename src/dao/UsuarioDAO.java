package dao;

import bean.Usuario;
import connection.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public void create(Usuario u) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into usuario(nome, sobrenome, login, senha)values(?,?,?,?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSobrenome());
            stmt.setString(3, u.getLogin());
            stmt.setString(4, u.getSenha());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no banco de dados.\n" + e);
        } finally {
            ConnectionBD.closeConnection(conn, stmt);
        }
    }

    public List<Usuario> read() {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("select * from usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getLong(1));
                u.setNome(rs.getString(2));
                u.setSobrenome(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setSenha(rs.getString(5));
                lista.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados do banco de dados!\n" + ex);
        }
        return lista;
    }

    public void update(Usuario u) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update usuario set nome=?, sobrenome=?, login=?, senha=? where id_usu=?");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSobrenome());
            stmt.setString(3, u.getLogin());
            stmt.setString(4, u.getSenha());
            stmt.setString(5, String.valueOf(u.getId()));
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados no banco de dados!\n" + ex);
        } finally {
            ConnectionBD.closeConnection(conn, stmt);
        }
    }

    public void delete(Usuario c) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from usuario where id_usu = ?");
            stmt.setLong(1, c.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar dados no banco de dados.\n" + e);
        } finally {
            ConnectionBD.closeConnection(conn, stmt);
        }
    }

    public List<Usuario> search_by_id(String id) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from usuario where id_usu like ?");
            stmt.setString(1, "%" + id + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getLong(1));
                u.setNome(rs.getString(2));
                u.setSobrenome(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setSenha(rs.getString(5));
                lista.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Usuario> search_by_nome(String nome) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from usuario where nome like ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getLong(1));
                u.setNome(rs.getString(2));
                u.setSobrenome(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setSenha(rs.getString(5));
                lista.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Usuario> search_by_sobrenome(String sobrenome) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from usuario where sobrenome like ?");
            stmt.setString(1, "%" + sobrenome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getLong(1));
                u.setNome(rs.getString(2));
                u.setSobrenome(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setSenha(rs.getString(5));
                lista.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Usuario> search_by_login(String login) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from usuario where login like ?");
            stmt.setString(1, "%" + login + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getLong(1));
                u.setNome(rs.getString(2));
                u.setSobrenome(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setSenha(rs.getString(5));
                lista.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }
}
