# String

- String literal
  - String s = "Java";
  - String s = "Programming";

- String Object
  - String s = new String("Java")

# String Buffer

- usada para criar cadeias de caracteres mutáveis ou modificáveis
- sequencias podem ser alteradas por meio de determinadas chamadas de métodos
- semelhante à classe string, exceto pelo fato de ser mutável
- append
- insert
- reverse
- delete
- sincronizado e seguro para uso multthreads

# String Builder

- possui os mesmos métodos do buffer
- a diferença é que este não é sincronizado como o buffer
- isso impacta diretamente na performance
- logo, ele é mais rapido que o buffer

# String X Buffer X Builder


String | Buffer | Builder

  Fast | Slow | Slow
  






