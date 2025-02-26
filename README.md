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
   git clone https://github.com/Eduardo-Junior/bookstore_manager.git


Para executar o projeto, vá até a pasta onde o projeto foi clonado, entre na pasta criada pelo github e escolha a opção de "Abrir terminal" ao clicar com o botão direito. Após isso, execute o comando "mvn spring-boot:run"


### Inserção de Dados (Usando Postman)

Agora que o servidor está rodando, você pode inserir dados usando o **Postman** ou outro método.

#### Passo a Passo no Postman

1. **Abrindo o Postman**
   
   Se você ainda não tem o **Postman** instalado, baixe e instale o aplicativo [aqui](https://www.postman.com/downloads/).

2. **Criando uma Requisição POST**

   - Abra o Postman e crie uma nova requisição.
   - Selecione o método `POST`.
   - No campo de URL, digite o endereço da API que você deseja interagir. Para este projeto, a URL é:
     ```
     http://localhost:8080/api/V1/livros
     ```

3. **Configurando o Corpo da Requisição**

   - Vá até a aba `Body` do Postman.
   - Selecione `raw` e no dropdown ao lado, selecione `JSON`.
   - No campo de texto, cole o seguinte JSON para criar um novo livro:

   ```json
   {
       "name": "Inteligentes e Burros",
       "pages": 180,
       "isbn": "978-92-95055-02-5",
       "publisherName": "Livraria Brasil",
       "author": {
           "name": "Tereza da Silva",
           "age": 48
       }
   }
   
4. **Enviando a requisição**

   - Clique no botão Send para enviar a requisição.
   - Se tudo correr bem, você receberá uma resposta de sucesso e o livro será inserido no banco de dados.

