# DDD e Arquitetura Hexagonal - Operações de crédito tribuário

[![NPM Version][npm-image]][npm-url]
[![Build Status][travis-image]][travis-url]
[![Downloads Stats][npm-downloads]][npm-url]

Este é um exemplo de como estruturar uma aplicação de modo a atender aos padrões de arquitetura hexagonal fazendo valer a abordagem de Domain-Driven Design.

O estudo de caso é dirigido sobre o grande domínio de Legislação Tributária, no que diz respeito ao Crédito Tributário: constituição/lançamento do crédito e extinção do crédito por meio de pagamento, seja à vista ou por meio de parcelamento.

A forma com que foi construído compreende a organização dos domínios de pagamento e de parcelamento, subdividindo quando possível, em DPOs - Domain Payload Objects, que serão os objetos que irão compor a "carga útil" direcionada a uma determinada regra de negócio da aplicação. 

Até o momento a forma de execução é bem simples, apenas executando as classes que contém os métodos "main" pra conferência de chamadas e retornos das regras de negócio e dos objetos de domínio. Nas próximas versões a aplicação será disponibilizada como uma API RESTFul documentada e um CLI para acesso aos endpoints.

## Exemplo de uso

Alguns exemplos interessantes e úteis sobre como seu projeto pode ser utilizado. Adicione blocos de códigos e, se necessário, screenshots.


## Info

Sandro Mendes – [@sandromendes](https://twitter.com/zehmendess)

Distribuído sob a licença GNU. Veja `LICENSE` para mais informações.

[https://github.com/sandromendes/dddhexagonal](https://github.com/sandromendes/)

## Contributing

1. Faça o _fork_ do projeto (<https://github.com/sandromendes/dddhexagonal/fork>)
2. Crie uma _branch_ para sua modificação (`git checkout -b feature/novaFuncionalidade`)
3. Faça o _commit_ (`git commit -am 'Criando nova função'`)
4. _Push_ (`git push origin feature/novaFuncionalidade`)
5. Crie um novo _Pull Request_
