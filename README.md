# 🧩 Sudoku Terminal - Desafio DIO

Este é um projeto prático desenvolvido a partir de um desafio da **[DIO - Digital Innovation One](https://www.dio.me/)**, com o objetivo de aplicar os conceitos de **Programação Orientada a Objetos em Java** e desenvolver um jogo funcional de Sudoku executado no terminal.

---

## 💻 Funcionalidades

- ✅ Iniciar um novo jogo com posições pré-definidas via argumentos
- ✅ Inserção e remoção de números no tabuleiro
- ✅ Validação de posições fixas (não podem ser alteradas)
- ✅ Exibição formatada do tabuleiro
- ✅ Verificação do status do jogo (completo, com erro, incompleto)
- ✅ Limpeza total do jogo
- ✅ Finalização com mensagem de sucesso

---

## 📂 Estrutura do Projeto

src/
└── br/
└── com/
└── dio/
├── Main.java
├── model/
│ ├── Board.java
│ └── Space.java
└── util/
└── BoardTemplate.java

yaml
Copiar
Editar

---

## ▶️ Como Executar

### 1. Compile os arquivos Java:

```bash
javac src/br/com/dio/**/*.java
2. Execute o programa passando os argumentos de inicialização do tabuleiro:
bash
Copiar
Editar
java br.com.dio.Main "0,0;4,false" "1,0;7,false" "2,0;9,true" ...
Os argumentos devem seguir o formato:
"coluna,linha;valor,fixo"
Exemplo: "0,0;5,false" → posição (0,0), valor 5, não é fixo.

🖥️ Menu do Jogo
markdown
Copiar
Editar
===============================
       🧩 JOGO DE SUDOKU - DIO
===============================

1 - Iniciar um novo Jogo
2 - Colocar um novo número
3 - Remover um número
4 - Visualizar jogo atual
5 - Verificar status do jogo
6 - Limpar jogo
7 - Finalizar jogo
8 - Sair
🛠️ Tecnologias Utilizadas
Java 11+

Programação Orientada a Objetos (POO)

Java Stream API

Terminal (CLI)

Scanner

📎 Links úteis
Repositório original da DIO

Draw.io (para diagramação opcional)

