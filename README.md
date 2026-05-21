# Collections Parte 2

Aplicação de console em Java criada para praticar o uso de `HashMap` no armazenamento de pares chave-valor.

## Objetivo

O programa recebe nomes e sexos informados pelo usuário, armazena os dados em um mapa e exibe os registros cadastrados de forma organizada.

## Funcionalidades

- Cadastro de pessoas pelo terminal.
- Armazenamento em `Map<String, String>`.
- Validação básica do formato de entrada.
- Exibição dos dados cadastrados.

## Tecnologias

- Java
- Java Collections Framework

## Como Executar

Compile o arquivo informando o diretório de saída:

```bash
javac -d out HashMap.java
```

Execute a classe principal:

```bash
java -cp out Aula_01.HashMap
```

## Exemplo de Uso

```text
Cadastre pessoas no formato nome,sexo. Digite F para encerrar.
Entrada: Ana,Feminino
Entrada: Carlos,Masculino
Entrada: F

Pessoas cadastradas por sexo:
Feminino: Ana
Masculino: Carlos
```

## Conceitos Praticados

- Uso de mapas.
- Entrada de dados com `Scanner`.
- Validação simples de texto.
- Iteração com `forEach`.
