# Local Classes

- A classe local está restrita ao bloco em que foi definida.
- Não é permitido instanciar uma classe local de fora do cloco de onde ela se originou
- Até o JDK7 a classe local só podia acessar a variável local final do bloco
- Mas com o JDK 8, já é possível o acesso a variáveis locais não finais do bloco anexo na classe local (atenção a isto)
- Sendo assim, a classe local tem acesso aos membros da classe que a envolve
- Classes locais não são estáticas, elas possuem acesso aos membros de instancia da classe anexa
- Também a partir do Java 8 as classes locais em um método tem a capacidade de acessar os parametros do método