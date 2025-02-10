# Sistema de Locação de Veículos

## Descrição Geral

O **Sistema de Locação de Veículos** foi desenvolvido como parte do curso de Java oferecido pela [Ada](https://ada.tech/), no módulo **Programação Orientada a Objetos I**. O objetivo principal do projeto é praticar conceitos essenciais da POO, como:

- Encapsulamento
- Herança
- Polimorfismo
- Interfaces

O sistema permite o cadastro de veículos e clientes, a realização de locações e a oferta de serviços adicionais para veículos de luxo.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **IDE**: IntelliJ IDEA
- **JDK**: Oracle OpenJDK 21.0.2

## Como Executar

### Clonando o Repositório

```bash
git clone https://github.com/leandrochs/Sistema-de-Locacao-de-Veiculos.git
cd Sistema-de-Locacao-de-Veiculos
```

### Compilando e Executando

1. Abra o projeto na **IDE IntelliJ IDEA**.
2. Certifique-se de que o **JDK 21.0.2** está configurado corretamente.
3. Execute a classe `Main.java`.
4. O seguinte menu será exibido no terminal:

```
Menu do Sistema de Locação de Veículos

 * Gerenciar Veículos
1) Cadastrar veículo
2) Listar todos veículos
3) Listar veículos disponíveis
4) Listar veículos alugados
5) Listar veículos de luxo

 * Gerenciar Clientes
6) Cadastrar cliente
7) Listar clientes

 * Locação de Veículos
8) Alugar veículo
9) Devolver veículo

 * Finalizar
0) Sair do sistema

Digite a opção desejada:
```

A partir desse menu, o usuário pode navegar pelo sistema e realizar as operações desejadas.

## Estrutura do Código

O projeto está organizado nos seguintes pacotes:

- **Clientes**: Contém as classes relacionadas aos clientes (Pessoa Física e Pessoa Jurídica).
- **Veículos**: Contém as classes que representam os diferentes tipos de veículos (CarroComum, CarroPremium, SUV, Moto, Caminhao).
- **LocacaoDeVeiculos**: Responsável pelas operações de aluguel e devolução dos veículos.
- **BancoDeDados**: Contém uma classe que simula um banco de dados utilizando listas em memória.

Na classe `Main`, há um mecanismo para popular alguns dados iniciais no "banco de dados" simulado, para fins didáticos.

## Autores

O projeto foi desenvolvido pelo seguinte grupo de alunos:

- [Aline Wornath](https://github.com/AlineWornath)
- [Andre Luis](https://github.com/andreknapik)
- [Janaina Cruz](https://github.com/JanaCruzS)
- [Leandro Chagas](https://github.com/leandrochs)
- [Stefanie Lima](https://github.com/Stefanie-Grou)
- Anderson Freitas

