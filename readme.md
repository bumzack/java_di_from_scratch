# Dependency Injection from Scratch

## Rules

- no external dependencies - this will probably only work, if you find the right SO post and copy two methods. that's ok. all the rest is cheating :-)

## Assumptions / Limitations 

1) Interface names are unique
2) Class names are unique
3) convention over configuration
4) classes (which should be created via DI) have 0 or max 1 constructor


ad 1) & 2) 

e.g. not allowed is this
```
at.bumzack.foo.Vehicle
and
at.bumzack.bar.Vehicle
```

ad 3) 

e.g.  ```class Car``` maps to ```beanByName("car")```

that's why there are no duplicate classes or interfaces are allowed