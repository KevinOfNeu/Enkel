Enkel (JVM based language)
=======

Enkel is a simple programming language running on the jvm


## Build & Run
- Generate parser code from ANTLR
  `./gradlew :antlr:generateGrammarSource `
  
- Compile `*.enk` to `*.class`    
  Using IDEA 
  
- Run
  `java *.class`
  
## Example

- Input(`Fields.enl`)
 ```
Fields {
 int field
 start {
    field = 5
    print field
 }
}
```

- Output(`Fields.class`)

Decompiled form:
```
public class Fields {
    public int field;

    public void start() {
        this.field = 5;
        System.out.println(this.field);
    }

    public Fields() {
    }

    public static void main(String[] var0) {
        (new Fields()).start();
    }
}
```

Other examples please see `./EnkelExamples/*.enk`

## TODO
- [ ] Other grammar feature
- [ ] IDEA highlight plugin
- [ ] Support debugger
- [ ] Port to LLVM IR