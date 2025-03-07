# 📧 MailService - Microserviço com Spring Boot + Oracle Cloud

O **MailService** é um projeto que exemplifica a criação de um microserviço completo utilizando **Spring Boot**, integrado aos serviços gratuitos da **Oracle Cloud** para armazenamento de objetos e envio de e-mails. O objetivo é simular um sistema que gera relatórios e os envia por e-mail, utilizando **Object Storage** e **Mail Delivery**.

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.3**
- **Oracle Cloud Infrastructure (OCI)**
  - Object Storage 📦 (para armazenamento de arquivos)
  - Mail Delivery 📩 (para envio de e-mails)
- **Maven** (gerenciamento de dependências)
- **Lombok** (para reduzir código boilerplate)

## 📌 Funcionalidades

✅ Gerar relatórios no formato PDF ou CSV  
✅ Armazenar os relatórios no **Object Storage** da Oracle Cloud  
✅ Enviar os relatórios por e-mail via **Mail Delivery**  
✅ Expor endpoints REST para gerenciamento dos relatórios  

## 📦 Como Executar o Projeto

### 1️⃣ Pré-requisitos
Antes de começar, certifique-se de ter instalado:
- **JDK 21**
- **Maven**
- Uma conta na **Oracle Cloud** com os serviços **Object Storage** e **Mail Delivery** configurados

### 2️⃣ Clonando o Repositório
```sh
git clone https://github.com/JoaoLacerda27/mailservice.git
cd mailservice
