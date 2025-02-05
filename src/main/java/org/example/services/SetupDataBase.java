package org.example.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDataBase {
    public static void setupDataBase() throws SQLException{
        final String DB_URL = "C:\\Users\\Matheus\\Documents\\JavaProjects\\Dio\\GerenciamentoDb\\src\\main\\resources\\atendimentos.db";

        try(Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement()) {
            String sql = """
                    -- Tabela para armazenar todos os dados do CSV
                    CREATE TABLE IF NOT EXISTS dados_completos (
                        Empresa TEXT,
                        Atendimento TEXT,
                        Canal TEXT,
                        Numero_OS TEXT,
                        Placa TEXT,
                        Chassi TEXT,
                        Marca TEXT,
                        Modelo TEXT,
                        Ano_Modelo TEXT,
                        Categoria_Veiculo TEXT,
                        Idade_Veiculo INTEGER,
                        Status_Veiculo TEXT,
                        KM_Atual INTEGER,
                        Cliente TEXT,
                        Cliente_Cidade TEXT,
                        Cliente_UF TEXT,
                        Fornecedor TEXT,
                        Fornecedor_Cidade TEXT,
                        Fornecedor_UF TEXT,
                        Regiao_Fornecedor TEXT,
                        Codigo_Fornecedor TEXT,
                        Data_Ultima_Interacao TEXT,
                        Usuario_Ultima_Interacao TEXT,
                        Motivo_OS TEXT,
                        Finalidade TEXT,
                        Status_OS TEXT,
                        Data_Hora_Abertura_Atendimento TEXT,
                        Status_Atendimento TEXT,
                        Data_Hora_Agendamento TEXT,
                        Data_Hora_Reagendamento TEXT,
                        Data_Hora_Abertura_OS TEXT,
                        Data_Hora_Entrada_Oficina TEXT,
                        Data_Hora_Envio_Orcamento TEXT,
                        Data_Hora_Envio_Aprovacao_Cliente TEXT,
                        Data_Hora_Retorno_Aprovacao_Cliente TEXT,
                        Data_Hora_Primeira_Aprovacao TEXT,
                        Data_Hora_Ultima_Aprovacao TEXT,
                        Data_Hora_Previsao_Entrega TEXT,
                        Data_Hora_Conclusao TEXT,
                        Data_Hora_Saida_Oficina TEXT,
                        Grupo_Consultor TEXT,
                        Grupo_Bolsao TEXT,
                        Aprovador_Atual TEXT,
                        Item TEXT,
                        Quantidade INTEGER,
                        Valor_Reembolsavel REAL,
                        Valor_Item REAL,
                        Valor_Total_Item REAL,
                        Valor_Total_CA REAL,
                        Numero_CA TEXT,
                        Pedido_SAP TEXT,
                        Codigo_SAP TEXT,
                        Peca_MO TEXT
                    );
                    
                    -- Tabela resumo com os campos especificados
                    CREATE TABLE IF NOT EXISTS resumo_atendimentos (
                        atendimento TEXT,
                        placa TEXT,
                        os TEXT,
                        cliente TEXT,
                        motivo_os TEXT,
                        bolsao TEXT,
                        status TEXT,
                        data_entrada TEXT,
                        data_saida TEXT,
                        UNIQUE(atendimento, os)
                    );
                    """;
        }
    }

}
