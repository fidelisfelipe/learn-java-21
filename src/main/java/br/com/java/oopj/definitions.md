# Java OOP

# Herança - Inheritance

- Todas as classes podem herdar variáveis e métodos de outras classes
- Uma classe que é derivada de outra classe é chamada de subclasse, classe derivada ou classe filha
- A Super Classe, Base Classe ou Parent Classe é a classe que as subclasses derivam
- Na ausência de qualquer superclasse explícita, toda classe é implicitamente uma subclasse de Object.
- Uma subclasse herda todos os membros public e protected do seu pai
- Uma Nested Class tem acesso a todos os membros privados da classe que a contém, tanto os campos quanto os métodos
- Uma Nested Classe public ou protected herdada por uma subclasse tem acesso indireto a todos os membros privados da superclasse
- Os campos herdados podem ser utilizados diretamente como qualquer outro campo
- Podemos declarar um campo na subclasse com o mesmo nome do campo na superclasse, ocultando-o.(embora não recomendado)
- Pode declarar um metodo na subclasse com o mesma assinatura de um metodo da superclasse, sobrescrevendo-o.

# Tipos de Herança - Type of Inheritance

 - Single Inheritance
 - Multilevel Inheritance
 - Hierarchical Inheritance
 - Multiple Inheritance (non supported in class, only interface)
 - Hybrid Inheritance (not supported in class, only interface)

# Sobrescrita de Métodos - Override Methods

- Metodos das subclasses com mesmo retorno, nome e assinatura
- A subclasse pode diminuir a restrição de acesso 
- A subclasse não pode deixar o método mais restritivo