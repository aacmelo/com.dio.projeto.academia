package dio.com.projeto.escola.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.DynamicUpdate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@DynamicUpdate
@Table(name = "tab_funcionario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @NotBlank(message = "Cadastro Não Realizado Informe o Nome do Funcionário no Campo")
    @Size(min = 25, message = "Digite no Minimo 25 Caracteres no Campo")
    @Column(name = "Nome", length = 100, nullable = false)
    private String nome;

    @NotBlank(message = "Cadastro Não Realizado Informe o Telefone com DDD e Numero no Campo Telefone")
    @Size(min = 14, message = "Digite no Minimo 14 Caracteres no Campo Telefone")
    @Column(name = "Telefone", length = 50, nullable = false)
    private String telefone;

    @NotBlank(message = "Cadastro Não Realizado Informe o E-mail do Funcionário no Campo E-mail")
    @Column(name = "Email", length = 100, nullable = false)
    private String email;

    @NotBlank(message = "Cadastro Não Realizado Informe o CPF do Funcionário no Campo CPF")
    @Size(min = 14, message = "Digite no Minimo 14 Caracteres no Campo CPF")
    @Column(name = "CPF", length = 14, nullable = false)
    private String cpf;

    @NotBlank(message = "Cadastro Não Realizado Informe o RG do Funcionário no Campo RG")
    @Size(min = 12, message = "Digite no Minimo 12 Caracteres no Campo RG")
    @Column(name = "RG", length = 12, nullable = false)
    private String rg;

    @NotBlank(message = "Cadastro Não Realizado Informe a Data de Nascimento do Funcionário no Campo Data de Nascimento")
    @Size(min = 11, message = "Digite no Minimo 11 Caracteres no Campo Data de Nascimento")
    @Column(name = "Data de Nascimento", length = 11, nullable = false)
    private String dataNascimento;

    @NotBlank(message = "Cadastro Não Realizado Informe o CEP do Funcionário no Campo CEP")
    @Size(min = 9, message = "Digite no Minimo 9 Caracteres no Campo CEP")
    @Column(name = "CEP", length = 9, nullable = false)
    private String cep;

    @NotBlank(message = "Cadastro Não Realizado Informe o Endereço do Funcionário no Campo Endereço")
    @Column(name = "Endereço", length = 100, nullable = false)
    private String endereco;

    @NotBlank(message = "Cadastro Não Realizado Informe o Numero do Funcionário no Campo Numero")
    @Column(name = "Numero", length = 50, nullable = false)
    private Integer numero;

    @NotBlank(message = "Cadastrado Não Realizado Informe o Bairro do Funcionário no Campo Bairro")
    @Column(name = "Bairro", length = 100, nullable = false)
    private String bairro;

    @NotBlank(message = "Cadastro Não Realizado Informe a Cidade do Funcionário no Campo Cidade")
    @Column(name = "Cidade", length = 70, nullable = false)
    private String cidade;

    @NotBlank(message = "Cadastro Não Realizado Informe o Estado do Funcionário no Campo Estado")
    @Column(name = "Estado", length = 50, nullable = false)
    private String estado;

    private String genero;
    @NotBlank(message = "Cadastro Não Realizado Informe a Diciplina do Funcionário")
    @Column(name = "Disciplina", length = 100, nullable = false)
    private String diciplina;

    @NotBlank(message = "Cadastro Não Realizado Informe o Horário de Atendimento do Funcionário")
    @Column(name = "Horário de Atendimento", length = 100, nullable = false)
    private String horarioAtendimento;

    @NotBlank(message = "Cadastro Não Realziado Informe a Área de Expecialização do Funcionário")
    @Column(name = "Área de Especialização", length = 100, nullable = false)
    private String areaEspecializacao;

    @NotBlank(message = "Cadastro Não Realizado Informe a Experiência do Funcionário")
    @Column(name = "Experiencia Profissional", length = 100, nullable = false)
    private String experienciaProfissional;
}
