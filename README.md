# BookStore Manager 📚

O **BookStore Manager** é uma aplicação desenvolvida em **Java Spring Boot** para gerenciar o cadastro de livros em uma loja virtual fictícia. O intuito desse repositório é apenas compartilhar minha jornada de aprendizado com o framework e a linguagem Java, utilizando conceitos mais avançados como API e afins. 

## 🚀 Tecnologias Utilizadas

- **Java Spring Boot**: Framework utilizado para a criação de APIs REST de maneira simples e rápida.
- **Project Lombok**: Biblioteca para reduzir o boilerplate do código, como getters, setters, construtores e mais.
- **API REST**: Utilizada para manipulação e comunicação com os dados dos livros.

Este projeto foi criado seguindo um curso da Udemy para Java Spring Boot.

## Instalação e Execução do Projeto

### Pré-requisitos

Antes de rodar o projeto, você precisa ter os seguintes itens instalados na sua máquina:

1. **Java 11 ou superior**
   - O projeto foi desenvolvido usando o Java 23. Caso não tenha o Java instalado, siga as instruções de instalação no [site oficial do Java](https://adoptopenjdk.net/).

2. **Apache Maven**
   - Maven é uma ferramenta de automação de build para projetos Java. Você pode instalá-lo da seguinte maneira:

   **Para instalar o Maven no seu sistema:**

   - **Windows**
     Use o arquivo de comando powershell disponível aqui: https://www.dropbox.com/scl/fi/r6awqhl7gljqtujznb15s/install_maven.ps1?rlkey=2rsdow6lgq530k6xp4tlq9h8s&st=poc77ml9&dl=0

     O código foi criado pelo incrível **https://gist.github.com/schtritoff**

   - **MacOS / Linux**
     1. Use o Homebrew (no macOS) ou o gerenciador de pacotes de sua distribuição no Linux:
        ```bash
        brew install maven
        ```
     2. Se não usar o Homebrew, siga as instruções de instalação na documentação oficial do [Maven](https://maven.apache.org/install.html).

---

### Clonando o Repositório

1. Clone este repositório na sua máquina:

   ```bash
   Crie uma nova pasta, abra seu CMD e digite o comando "cd nome-da-sua-pasta" sem as aspas
   Em seguida execute o seguinte comando: 
   git clone https://github.com/seu-usuario/seu-repositorio.git


Para executar o projeto, vá até a pasta onde o projeto foi clonado, entre na pasta criada pelo github e escolha a opção de "Abrir terminal" ao clicar com o botão direito. Após isso, execute o comando "mvn spring-boot:run"
