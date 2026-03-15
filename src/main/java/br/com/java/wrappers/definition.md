# Wrapper classes

- Byte
- Short
- Integer
- Long
- Float
- Double
- Boolean
- Character

## Types

- From Primitive Type to Wrapper Class
  - Using Constructors
    - Integer firstObject = new Integer(20);
  - Using Static Method
    - Integer secondObject = Integer.valueOf(20);

- From Wrapper Class to Primitive Type
  - Integer object = new Integer(20);
    - int value = object.intValue();

# Auto-boxing and Unboxing

- Até o Java 5 a conversão era feita da forma apresentada por Wrappers e primitives
- Após o Java 5 isso é feito com Auto-boxing e Auto-unboxing
- Auto-boxing - From Primitive to Wrapper
  - Integer a = 5;
- Auto-unboxing
  - int a = new Integer(5); - From Wrapper to Primitive

  