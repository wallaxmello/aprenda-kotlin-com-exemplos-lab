// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

eenum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String, val matricula: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 10)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.addAll(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val usuarioUm = Usuario("user1", 123)
    val usuarioDois = Usuario("user2", 456)
    val usuarioTres = Usuario("user3", 789)
    
    var conteudosEducacionais = mutableListOf<ConteudoEducacional>()
    conteudosEducacionais.add(ConteudoEducacional("Kotlin Introducao", duracao = 5))
    conteudosEducacionais.add(ConteudoEducacional("Kotlin Variaveis"))
    conteudosEducacionais.add(ConteudoEducacional("Kotlin Funcoes", duracao = 15))
    
    val formacao = Formacao("Kotlin", Nivel.BASICO, conteudosEducacionais)
    
    formacao.matricular(usuarioUm, usuarioDois, usuarioTres)
    println("Formação: " + formacao.nome + ", Nivel: " + formacao.nivel)
    formacao.conteudos.forEach{println("Conteudo: " + it.nome + ", Duracao: " + it.duracao + " min")}
    formacao.inscritos.forEach{println("Usuario: " + it.nome + ", Matricula: " + it.matricula)}
}
