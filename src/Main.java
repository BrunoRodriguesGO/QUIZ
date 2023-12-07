import java.util.Scanner;

public class Main { // chamando a outra classe do poo
    Pergunta[] perguntas;
    int pontuacao;

    public Main(Pergunta[] perguntas) { // aqui começa os comandos de execuçao e calculo do codigo
        this.perguntas = perguntas;
        this.pontuacao = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < perguntas.length; i++) { // aqui e para passar para proxima pergunta
            Pergunta pergunta = perguntas[i];
            System.out.println(pergunta.getPergunta());
            String[] opcoes = pergunta.getOpcoes();

            for (int j = 0; j < opcoes.length; j++) {
                System.out.println(opcoes[j]);
            }
            // aqui e para fazer o calculo do resultado das perguntas
            System.out.print("Digite sua resposta (A, B, C ou D): ");
            char resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);

            if (resposta == pergunta.getRespostaCorreta()) {
                System.out.println("Resposta correta!");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }
        }

        scanner.close();
        System.out.println("Muito Obrigado por Responder este QUIZ sua pontuacao total foi Deb: " + pontuacao + " de " + perguntas.length);
    }

    public static void main(String[] args) { // chamando as perguntas resposta  do tipo array
        System.out.println("===================================================================== ");
        System.out.println("Faculdade: Unifan Alfredo Nascer");
        System.out.println("Aluno: Bruno Almeida de Oliveira Rodrigues ");
        System.out.println("Porfessor: Brenno Pimenta");
        System.out.println("Quiz Tecnologia");
        System.out.println("===================================================================== ");
        Pergunta[] perguntas = {
                new Pergunta("1)O que é uma Unidade lógica?",
                        new String[]{"A) é um disco velho", "B) é um disco vazio", "C) é um disco rígido", "D) nda."}, 'C'),

                new Pergunta("2) HD É simplesmente UM?",
                        new String[]{"A) Winchester", "B) Hardcore", "C) Disco Fabulous", "D) Hard Disk."}, 'D'),

                new Pergunta("3) O que significa DTI?:",
                        new String[]{"A)Departamento de tecnologia de inteligência", "B)bDepartamento de tráfego de informação", "C) Departamento de tecnologia da informação", "D)Nda."}, 'C'),

                new Pergunta("4) Um Sistema binário, compreende á?",
                        new String[]{"A)1-0", "B) 1-1", "C) 0-1", "D)0-2."}, 'C'),

                new Pergunta("5) MySQL refere-se á?",
                        new String[]{"A)tipo de linguagem", "B)tipo de invasão cibernético", "C)tipo de banco de dados", "D)sistema de engrenagem."}, 'C'),

                new Pergunta("6) SATA é um tipo de?",
                        new String[]{"A)conexão de internet", "B)cabo coaxial de dados", "C)cabo de tráfego de dados", "D)cabo usb de dados."}, 'C'),

                new Pergunta("7) O que são Dados?",
                        new String[]{"A)são as partes de programas", "B)são resquícios de arquivos corrompidos", "C)são informações desencontradas", "D)são pentesters invasores."}, 'A'),

                new Pergunta("8) É o principal componente de um computador?",
                        new String[]{"A)memória", "B)processador", "C)monitor", "D)usuário."}, 'B'),

                new Pergunta("9) Na falta de qual destes componentes, você não consegue utilizar um computador?",
                        new String[]{"A)teclado", "B)placa-mãe", "C)mouse", "D)cabo de força."}, 'D'),

                new Pergunta("10) Por que algumas imagens em um site às vezes aparecem tão rápido?",
                        new String[]{"A)Porque o servidor que você está acessando está na sua cidade", "B)Porque tem pouca gente usando o site", "C)Porque o seu computador costuma guardar, num lugar chamado cache, as imagens que você busca costumeiramente", "D)Porque você utiliza o Avira para acelerar sua internet."}, 'C'),

                new Pergunta("11) Quаl о соnсеіtо quе еnvоlvе реѕѕоаѕ е рrосеdіmеntоѕ quе аuхіlіаm uѕuárіоѕ quаndо еѕtеѕ роѕѕuеm аlgumа dіfісuldаdе nо аmbіеntе dе trаbаlhо quаndо uѕаm а іnfоrmátіса?",
                        new String[]{"A)help desk", "B)treinamento", "C)assistência técnica", "D)F1."}, 'A'),

                new Pergunta("12) São exemplos de hardware?",
                        new String[]{"A)placa de vídeo, word e paint", "B)Memória, Leitor de código de barras e placa de rede", "C)MSDos, Thinclient, Word", "D)Pinterest, Moo, PaintBoll."}, 'B'),

                new Pergunta("13) É um tipo de computador que tem como função controlar as demais estações de trabalho quando ligados em uma rede de computadores?",
                        new String[]{"A)servidor", "B)cliente", "C)nobreak", "D)cloud computing."}, 'A'),

                new Pergunta("14) Nа tеrmіnоlоgіа uѕuаl dе mісrоіnfоrmátіса, оѕ dаdоѕ Реntіum ІV, 3.0 Ghz, 256 Мb RАМ, НD 40 Gb, tесlаdо раdrãо АВNТ, рlаса dе vídео 128 mb АGР, соnѕtіtuеm um mоdеlо dе?",
                        new String[]{"A)layout", "B)organização", "C)configuração", "D)cloud computingplanta baixa."}, 'C'),

                new Pergunta("15) Аѕ раrtеѕ fíѕісаѕ dо mісrосоmрutаdоr ѕó funсіоnаm dе mаnеіrа lógіса quаndо ехесutаm оrdеnѕ соntіdаѕ еm um рrоgrаmа оu еm um соnјuntо dе рrоgrаmаѕ. А раrtе соmроѕtа реlоѕ рrоgrаmаѕ – quе trаnѕfоrmа аѕ раrtеѕ fíѕісаѕ dо mісrосоmрutаdоr еm umа unіdаdе lógіса dе рrосеѕѕаmеntо – é сhаmаdа dе?",
                        new String[]{"A)firmware", "B)firewall", "C)selfware", "D)software."}, 'D'),

        };

        Main quiz = new Main(perguntas); // executaveis do codigo
        quiz.jogar();
    }
}
