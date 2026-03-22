# Local Classes (Classes Locais)

> Subtype de Inner Class. Definida dentro de um metodo ou bloco.
> Ver detalhes completos em: [`../nestedsClasses/definition.md`](../nestedsClasses/definition.md)

---

## Resumo rapido

- Escopo **restrito ao bloco** onde foi definida.
- **Nao pode** ser instanciada de fora do bloco de origem.
- Tem acesso a membros da classe externa.
- Acessa variaveis locais do bloco apenas se forem **effectively final** (Java 8+).
- Pode acessar **parametros do metodo** que a envolve (Java 8+).
- **Nao e estatica**: tem acesso a membros de instancia da classe externa.
- **Nao pode** ter modificadores de acesso (`public`, `private`, etc.) — e local.
- **Nao pode** declarar membros estaticos (exceto constantes `static final`).

```java
class Processador {
    private String prefixo = "INFO";

    void processar(String msg) {
        String separador = " -> "; // effectively final

        class Formatador {
            String formatar() {
                return prefixo + separador + msg; // acessa tudo
            }
        }

        System.out.println(new Formatador().formatar()); // INFO -> msg
    }
}
```

---

## Pontos criticos para a prova

- Local class **nao e uma inner class de membro**: nao aparece como membro da classe externa.
- Se tentar reatribuir a variavel local apos a declaracao da local class, **erro de compilacao**.
- Nao confundir com **Anonymous Class**: local class tem nome e pode ter varios metodos.
