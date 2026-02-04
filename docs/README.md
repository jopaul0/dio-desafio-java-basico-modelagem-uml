# Desafio de Modelagem e Diagramação: iPhone 2007

Este projeto consiste na modelagem e implementação em Java das funcionalidades icônicas do lançamento do primeiro iPhone (2007), conforme o desafio proposto pela DIO (Digital Innovation One). O objetivo é demonstrar habilidades em **Programação Orientada a Objetos (POO)**, especificamente **Interfaces** e **Herança Múltipla** de tipos.

## 📱 Contexto do Desafio
Baseado na apresentação histórica de Steve Jobs, o dispositivo foi modelado para atuar em três frentes principais:
1. **Reprodutor Musical**: Um iPod com controles touch.
2. **Aparelho Telefônico**: Um celular revolucionário.
3. **Navegador na Internet**: Um comunicador de internet real (Safari).

---

## 📐 Diagrama UML
Abaixo está a representação visual da estrutura de classes e interfaces do projeto.

![Diagrama UML do iPhone](./caminho-para-sua-imagem.png)
> *Substitua o caminho acima pelo local onde você salvou o print do seu diagrama.*

---

## 🚀 Estrutura do Código

O projeto foi organizado em pacotes para seguir as boas práticas de desenvolvimento:

### 1. Interfaces (`org.jopaul0.modelagem.interfaces`)
Define os contratos que o dispositivo deve seguir:
- `ReprodutorMusical`: métodos `tocar()`, `pausar()` e `selecionarMusica(String musica)`.
- `AparelhoTelefonico`: métodos `ligar(String numero)`, `atender()` e `iniciarCorreioVoz()`.
- `NavegadorInternet`: métodos `exibirPagina(String url)`, `adicionarNovaAba()` e `atualizarPagina()`.

### 2. Modelo (`org.jopaul0.modelagem.models`)
- **Classe Iphone**: A classe principal que implementa todas as interfaces acima, utilizando `ArrayList` para gerenciar dinamicamente contatos, músicas e abas do navegador.
