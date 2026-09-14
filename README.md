# ✈️ Laboratório de Práticas: Polimorfismo em Java

Este repositório contém a resolução da atividade sobre **Polimorfismo**, abordando conceitos de **Sobrescrita de Métodos** (`@Override`) e **Sobrecarga de Métodos**.

## 🎯 Conceitos Praticados
- **Polimorfismo de Inclusão (Sobrescrita)**: Subclasses redefinindo o comportamento de um método da superclasse.
- **Anotação `@Override`**: Validação em tempo de compilação para redefinição de métodos.
- **Sobrecarga de Métodos**: Métodos com mesmo nome e assinaturas de parâmetros distintas.
- **Coerção e Coleções Polimórficas**: Armazenamento de subclasses em vetores do tipo superclasse.

---

## 📁 Estrutura do Projeto

| Arquivo | Descrição |
| :--- | :--- |
| `Transporte.java` | Superclasse base com comportamentos genéricos `mover()` e `exibirInformacoes()`. |
| `Carro.java` | Subclasse que estende `Transporte` e sobrescreve seus métodos. |
| `Bicicleta.java` | Subclasse que estende `Transporte` com implementações para pedalada. |
| `Aviao.java` | Subclasse que estende `Transporte` para voo e transporte aéreo. |
| `CalculadoraViagem.java` | Classe que demonstra a sobrecarga do método `calcularCusto()`. |
| `Main.java` | Execução dos cenários de testes, verificação de sobrecarga e desafio com vetor polimórfico. |

---

## ❓ Respostas das Questões Principais

### Questão 1
> **Por que, mesmo as quatro variáveis sendo do tipo `Transporte`, são executados métodos diferentes?**
>
> O Java utiliza **ligação dinâmica (polimorfismo em tempo de execução)**. O tipo da variável de referência determina os membros acessíveis em tempo de compilação, mas a execução chama a implementação específica pertencente ao tipo real do objeto instanciado na memória com a palavra-chave `new`.

### Questão 2
> **Qual é a função da anotação `@Override`?**
>
> A anotação `@Override` informa ao compilador que a intenção explícita do desenvolvedor é redefinir um método herdado da superclasse. Caso o nome, o tipo de retorno ou a lista de parâmetros estejam incorretos, o compilador gera um erro evitando falhas de digitação.

### Questão 3
> **Como o Java identifica qual versão do método `calcularCusto()` deve executar?**
>
> Pela **assinatura do método (sobrecarga em tempo de compilação)**. O compilador analisa a quantidade, a ordem e os tipos de argumentos passados na chamada do método para selecionar a versão correspondente.

---

## 🚀 Desafio Final

### Saída Prevista e Executada
```text
O carro está andando pela estrada.
A bicicleta está sendo pedalada.
O avião está voando.
