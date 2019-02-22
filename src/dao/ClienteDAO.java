package dao;

import bean.Cliente;
import connection.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    public void create(Cliente c) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into cliente(nome, sobrenome, cpf, data_nasc, endereco, bairro, regiao, telefone, celular, email, descricao)values(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getData_nasc());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getBairro());
            stmt.setString(7, c.getRegiao());
            stmt.setString(8, c.getTelefone());
            stmt.setString(9, c.getCelular());
            stmt.setString(10, c.getEmail());
            stmt.setString(11, c.getDescricao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no banco de dados.\n" + e);
        } finally {
            ConnectionBD.closeConnection(conn, stmt);
        }
    }

    public List<Cliente> read() {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("select * from cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados do banco de dados!\n" + ex);
        }
        return lista;
    }

    public void update(Cliente c) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update cliente set nome=?, sobrenome=?, cpf=?, data_nasc=?, endereco=?, bairro=?, regiao=?, telefone=?, celular=?, email=?, descricao=? where id_cli=?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getData_nasc());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getBairro());
            stmt.setString(7, c.getRegiao());
            stmt.setString(8, c.getTelefone());
            stmt.setString(9, c.getCelular());
            stmt.setString(10, c.getEmail());
            stmt.setString(11, c.getDescricao());
            stmt.setString(12, String.valueOf(c.getId()));
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados no banco de dados!\n" + ex);
        } finally {
            ConnectionBD.closeConnection(conn, stmt);
        }
    }

    public void delete(Cliente c) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from cliente where id_cli = ?");
            stmt.setLong(1, c.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar dados no banco de dados.\n" + e);
        } finally {
            ConnectionBD.closeConnection(conn, stmt);
        }
    }

    public List<Cliente> search_by_id(String id) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from cliente where id_cli like ?");
            stmt.setString(1, "%" + id + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Cliente> search_by_nome(String nome) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from cliente where nome like ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Cliente> search_by_sobrenome(String sobrenome) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from cliente where sobrenome like ?");
            stmt.setString(1, "%" + sobrenome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Cliente> search_by_celular(String celular) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from cliente where celular like ?");
            stmt.setString(1, "%" + celular + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Cliente> search_by_email(String email) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from cliente where email like ?");
            stmt.setString(1, "%" + email + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }

    public List<Cliente> search_by_regiao(String regiao) {
        Connection conn = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("select * from cliente where regiao like ?");
            stmt.setString(1, "%" + regiao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong(1));
                c.setNome(rs.getString(2));
                c.setSobrenome(rs.getString(3));
                c.setCpf(rs.getString(4));
                c.setData_nasc(rs.getString(5));
                c.setEndereco(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setRegiao(rs.getString(8));
                c.setTelefone(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setEmail(rs.getString(11));
                c.setDescricao(rs.getString(12));
                lista.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar dados no banco de dados.\n" + ex);
        }
        return lista;
    }
}
