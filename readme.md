# Seleção Unimed (Código)

## SQLs

Baixar o PDF dentro da Pasta SQL e seguir as instruções.

## Bom saber

O teste de código se baseia no conceito de TDD, onde desenvolvemos primeiro os testes, e depois a implementação. No caso destes testes, você precisará implementar o código para que ele passe nos testes que desenvolvemos.  

Serão 2 testes de lógica (letras repetidas e palíndromo), desenvolvidos em C# e Java. A escolha da linguagem é de sua preferência.

### C#
Os testes foram desenvolvidos utilizando XUnit, as classes ```PalindromoTests```e ```PalavrasRepetidasTest``` contém os cenários para que os testes sejam realizados.

O código para passar nos testes deve ser implementado nas classes **VerificadorPalavrasRepetidas** e **Palindromo**. 

### Java
Os testes foram desenvolvidos utilizando JUnit4, são 2 projetos, um para Palindromo e outro para PalavrasRepetidas.

No caso do palíndromo, diferente do C#, existem duas classes de teste **PalindromoTests** e **NaoEhPalindromotests**.

O código para passar nos testes deve ser implementado nas classes **VerificadorPalavrasRepetidas** e **Palindromo**. 

## Requisitos obrigatórios

- Escrever o código que passe em todos os testes desenvolvidos

## Requisitos Desejáveis

- Utilizar Git

## Letras repetidas

Crie um app que dada uma string, serão retornadas as letras repetidas que existem na mesma.  

**Entrada**

String com a palavra

```
abacate
bola
ovo
paralelepipedo
```

  

**Saída**

String com as letras repetidas separadas por vírgula

  

**Restrições**

  

- Nenhuma string virá nula

  

**Resultado esperado**

  

- Retornar a string com a palavra:letras repetidas separadas por vírgula

- quando não houver nenhuma letra repetida, deve retornar a string none

  

```
abacate: a
bola: none
ovo: o
paralelepipedo: p,a,l,e
```

  
  

## Palíndromo

  

Você deve identificar quando uma string é um palíndromo.

  

*Palíndromo* é uma palavra que pode ser lida de trás para frente, da mesma forma.

  

**Entrada**

  

Uma string

  

```
ovo
aba
radar
azul
Ame o poema
```

  

**Saída**

  

Valor boleano 'true' se a palavra é um palíndromo.

  

```
ovo : true
Ame o poema: false
```


