vaadin-fluent-ui
================

vaadin addon to support fluent creation of UI components. 

See this addon in the vaadin directory: https://vaadin.com/directory#addon/fluent-ui:vaadin

add this addon to your projects pom.xml

```xml
<dependency>
   <groupId>org.vaadin.addons</groupId>
   <artifactId>fluent-ui</artifactId>
   <version>0.1.0</version>
</dependency>

<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>
```

### Rules for fluent API

First: these are not Builders. The Builder pattern assumes that calling "build()" creates a new instance every time. 
The Fluent-helpers do not create new instances, they just wrap a concrete final component and allow fluent access to 
its setters.

#### How it is done

- a fluent wrapper is created for every Vaadin Component
- every constructor of Component "Bar" can be accessed via static method FluentBar.bar(....)
- every "setFoo()" method can be accessed via "foo()" (no "with...")
- every "addFoo(Foo foo)" method can be accessed via vararg "addFoo(Foo... foos)", so many items can be added at once
- methods concerning lifecycle and composition (setParent, setCompositionRoot) must not be exposed.
- boolean setters (setEnabled()) become enabled(boolean) but might be flanked by enable() and disable() when applicable.




### Vaadin Addon rules

This project follows the rules and guidelines described here: https://vaadin.com/directory/help/creating-vaadin-add-ons
