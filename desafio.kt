// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome: String, var idade: Int, var matricula: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        
    }
}


fun main() {
    val conteudo1 = ConteudoEducacional("Programacao 1, Calculo 1, Algebra Linear, Matemática discreta, Algoritmos", 300)
    val conteudo2 = ConteudoEducacional("Programacao 2, Calculo 2, Análise e Projetos de Algoritmos, Sistemas distribuídos", 300)
    val conteudo3 = ConteudoEducacional("Compiladores, Física 3, Inteligência Artificial, Projeto e desenvolvimento de software, Paradigmas da programação", 300)
    val conteudo4 = ConteudoEducacional("Matemática discreta 2, Biologia computacional, Metodologia científica, Teoria da computação, Circuitos digitais", 300)
    val conteudo5 = ConteudoEducacional("Matemática discreta 3, Estatística, Arquitetura de computadores, Redes, Governança de TI ", 300)
    
    val primeiroSemestre = listOf(conteudo1, conteudo2, conteudo3, conteudo4, conteudo5)
    val cienciasDaComputacao = Formacao("Ciencia da Computacao", primeiroSemestre)
    val aluno1 = Usuario("Paulo", 23, 550020)
    val aluno2 = Usuario("Ricardo", 23, 550020)
    val aluno3 = Usuario("Laura", 22, 550020)
    val aluno4 = Usuario("Gabrielle", 22, 550020)
    val aluno5 = Usuario("Arthur", 18, 550020)
    
    cienciasDaComputacao.matricular(aluno1)
    cienciasDaComputacao.matricular(aluno2)
    cienciasDaComputacao.matricular(aluno3)
    cienciasDaComputacao.matricular(aluno4)
    cienciasDaComputacao.matricular(aluno5)
    
    println(cienciasDaComputacao)
    println(cienciasDaComputacao.inscritos)
}
