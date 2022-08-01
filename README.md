# **FilmesFlix**

Projeto criado para o módulo de MVVM e Clean Architecture no Bootcamp Kotlin Everis da DIO.

Este projeto consiste em exibir uma lista de filmes, oriundas de uma API. 

**Tecnologias utilizadas:**

- [x] [Kotlin](https://kotlinlang.org/docs/getting-started.html)
- [x] [Live data](https://developer.android.com/topic/libraries/architecture/livedata?hl=pt-br)
- [x] [MVVM](https://developer.android.com/jetpack/guide?gclid=CjwKCAiAjp6BBhAIEiwAkO9Wut2W9TLNRaql75qE26vP_xRvCfTBlBY5j8RHxc_r6RhC1HFPTprbwRoC32cQAvD_BwE&gclsrc=aw.ds) 
- [x] [Coil](https://coil-kt.github.io/coil/)
- [x] [Retrofit](https://square.github.io/retrofit/)
- [x] Clean Architecture

**Screenshot**
<p float="left">
  <img src="/filmes_flix.png" width="300" />
</p>

Uma Clean Architecture consiste em:

* View - tudo que é referente a componentes visuais e a logica deles


* Domain - Modelos e regras de negócio


* Data - Abstração para acessar o datasource

* Usecases - Transmite as ações do usuário

* app - irá conter as implementações das interfaces da camada de dados


