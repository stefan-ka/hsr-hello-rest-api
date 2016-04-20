# This is a simple 'Hello World' RESTFul Service

The API specification: (Swagger 2.0)

YAML:

```yaml
swagger: '2.0'
host: 'localhost:8080'
basePath: '/'

info:
  version: "1.0.0"
  title: "HSR 'Hello World' RESTFul API"

paths:
  /greeting/{name}:
    get:
      parameters:
        -
          name: name
          in: path
          description: Your Name
          required: true
          type: string
          format: string
      responses:
        200:
          description: Successful response
          schema:
            title: Text with Message
            type: array
            items:
              title: Greeting
              type: object
              properties:
                text:
                  type: string
  /greeting:
    get:
      responses:
        200:
          description: Successful response
          schema:
            title: Text with Message
            type: array
            items:
              title: Greeting
              type: object
              properties:
                text:
                  type: string
```

JSON:

```json
{
    "swagger": "2.0",
    "host": "localhost:8080",
    "basePath": "/",
    "info": {
        "version": "1.0.0",
        "title": "HSR 'Hello World' RESTFul API"
    },
    "paths": {
        "/greeting/{name}": {
            "get": {
                "parameters": [
                    {
                        "name": "name",
                        "in": "path",
                        "description": "Your Name",
                        "required": true,
                        "type": "string",
                        "format": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "Successful response",
                        "schema": {
                            "title": "Text with Message",
                            "type": "array",
                            "items": {
                                "title": "Greeting",
                                "type": "object",
                                "properties": {
                                    "text": {
                                        "type": "string"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        "/greeting": {
            "get": {
                "responses": {
                    "200": {
                        "description": "Successful response",
                        "schema": {
                            "title": "Text with Message",
                            "type": "array",
                            "items": {
                                "title": "Greeting",
                                "type": "object",
                                "properties": {
                                    "text": {
                                        "type": "string"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
```

