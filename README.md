# Projeto Concessionária

## Descrição
Este projeto simula um sistema de vendas de veículos, onde é possível cadastrar clientes, funcionários, fabricantes, veículos, pagamentos e vendas. Ele utiliza classes e enums para organizar os dados e exibir informações sobre as vendas realizadas.

## Tecnologias Utilizadas
- Java
- API de Datas (LocalDate)
- Enumerações para tipos de pagamento, status da venda, estado e tipo de veículo
- Estruturas de dados (List)

## Estrutura do Projeto
- `Main.java`: Ponto de entrada da aplicação, onde os objetos são instanciados e os dados das vendas são impressos.
- `Enums/`: Pacote contendo enumerações para classificação de veículos, status de pagamento e outros.
- `Models/`: Pacote contendo as classes principais do projeto, como `Cliente`, `Funcionario`, `Veiculo`, `Pagamento`, `Venda` e `ItemVenda`.

## Funcionalidades
- Cadastro de clientes e funcionários.
- Registro de fabricantes e veículos.
- Simulação de pagamentos com diferentes tipos e status.
- Criação de vendas com itens e cálculo de descontos.
- Impressão de detalhes das vendas realizadas.

## Como Executar
1. Certifique-se de ter o Java instalado na sua máquina.
2. Compile o código-fonte:
   ```sh
   javac Main.java
   ```
3. Execute o programa:
   ```sh
   java Main
   ```

## Exemplo de Saída
```
-------------------- Dados das Vendas --------------------
Venda{id=1, cliente=João, ...}
Venda{id=2, cliente=Maria, ...}
```

## Melhorias Futuras
- Implementação de uma interface gráfica.
- Persistência de dados usando banco de dados.
- Opção de relatórios detalhados das vendas.

## Autor
- Nicolas Moreira Lima do Nascimento
  

