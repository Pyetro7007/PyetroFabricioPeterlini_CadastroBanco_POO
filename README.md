# Sistema de Cadastro Bancário em Java

Este repositório apresenta um sistema de cadastro bancário com interface gráfica, desenvolvido em **Java** utilizando a biblioteca *Swing*. O projeto simula operações básicas de gerenciamento de clientes e contas bancárias, seguindo o padrão de arquitetura **MVC** (Model-View-Controller).

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Interface Gráfica**: Swing
- **Arquitetura**: MVC

## Funcionalidades

### Cadastro de Cliente
Permite o preenchimento dos seguintes campos:
- Nome
- Endereço
- Telefone
- CPF
- Agência
- Número da Conta
- Tipo de Conta (Corrente ou Poupança)

### Consulta de Cliente
- Simula a busca de um cliente com base na agência e número da conta.
- Preenche automaticamente os campos da interface com os dados encontrados.

### Atualização de Dados
- Permite editar os dados do cliente após consulta.
- Exibe uma mensagem de confirmação com os dados atualizados.

## Interface Gráfica

A interface foi construída manualmente com layout absoluto, utilizando componentes como:
- `JLabel`, `JTextField`, `JRadioButton`, `JButton`, `JSeparator`
- `JOptionPane` para exibição de mensagens

## Autor

**Pyetro Fabrício Peterlini**  
2°DS MTEC Manhã
