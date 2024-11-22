
# Global Solution - Java Advanced

## Descrição
Esta API RESTful permite o monitoramento e registro de consumo energético de dispositivos.

## Funcionalidades
- CRUD para Dispositivos e Consumo Energético.
- Paginação para listagem de consumos.
- Validação de dados usando Bean Validation.
- Documentação com Swagger.

## Endpoints
- **/dispositivos**
  - `POST`: Criar um novo dispositivo.
  - `GET`: Listar todos os dispositivos.

- **/consumos**
  - `POST`: Registrar um consumo energético.
  - `GET`: Listar todos os consumos.
  - `GET /paginados`: Listar consumos com paginação.

## Exemplos de JSON
### Criar Dispositivo
```json
{
    "nome": "Ar Condicionado",
    "descricao": "Ar condicionado da sala."
}
```
### Registrar Consumo
```json
{
    "data": "2024-11-20",
    "consumo": 12.5,
    "dispositivoId": 1
}
```

## Como Executar
1. Clone o repositório.
2. Execute o projeto Spring Boot.
3. Acesse o Swagger em `http://localhost:8080/swagger-ui.html`.

## Postman
Incluímos uma coleção do Postman no repositório para facilitar os testes.
