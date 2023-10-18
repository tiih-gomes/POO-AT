import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
            public static void main(String[] args) throws InterruptedException {
                //Funcionário
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFunc(1);
                funcionario.setNome("Luana");
                funcionario.setEmail("luana.ribeiro@gmail.com");
                funcionario.setDocumento("25469856");

                //Gerente
                Gerente gerente = new Gerente();
                gerente.setIdFunc(1);
                gerente.setNome("Gerente: Lucas Araujo");
                gerente.setEmail("lucas.araujo@gmail.com");
                gerente.setDocumento("63895741");
                gerente.setLogin("lucas.araujo");
                gerente.setSenha("lucas@345!");

                //Secretária
                Secretaria secretaria = new Secretaria();
                secretaria.setIdFunc(2);
                secretaria.setNome("Secretaria: Tifanny Gomes");
                secretaria.setEmail("tifanny.gomes@gmail.com");
                secretaria.setDocumento("24785963");
                secretaria.setTelefone("38142145");
                secretaria.setRamal("2245");

                //Operador
                Operador operador = new Operador();
                operador.setIdFunc(3);
                operador.setNome("Operador: Sergio Francisco");
                operador.setEmail("sergio.francisco@gmail.com");
                operador.setDocumento("2569635");
                operador.setValorHora(1);

                RegistroPonto reg1 = new RegistroPonto();
                RegistroPonto reg2 = new RegistroPonto();
                RegistroPonto reg3 = new RegistroPonto();

                Espera();
                reg1.setFunc(gerente);
                reg1.setDataRegistro(LocalDate.now());
                reg1.setHoraEntrada(LocalDateTime.now());
                reg1.apresentarRegistroPonto();

                reg2.setFunc(secretaria);
                reg2.setDataRegistro(LocalDate.now());
                reg2.setHoraEntrada(LocalDateTime.now());
                reg2.apresentarRegistroPonto();

                reg3.setFunc(operador);
                reg3.setDataRegistro(LocalDate.now());
                reg3.setHoraEntrada(LocalDateTime.now());
                reg3.apresentarRegistroPonto();

                reg1.setHoraSaida(LocalDateTime.now());
                reg1.apresentarRegistroPonto();

                reg2.setHoraSaida(LocalDateTime.now());
                reg2.apresentarRegistroPonto();

                reg3.setHoraSaida(LocalDateTime.now());
                reg3.apresentarRegistroPonto();

            }

            public static void Espera(){
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

        }
