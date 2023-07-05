/*  clinica.cpp
    João Pedro de Melo Murta, 23/06/2023
    Programa que simula o sistema de registros de uma clínica veterinária e permite criar, ler, editar e deletar arquivos.
*/

// Importação de arquivos de cabeçalho
#include <iostream>
using std::cout; 
using std::cin;
using std::endl;

#include <fstream>
using std::ofstream;
using std::ifstream;
using std::ios;

#include <cstdlib>
using std::exit;

#include <cstdio>
using std::remove;

#include <cctype> 

#include "pets.h" // Define o arquivo pets.h que possui a implementação da classe

int main() {
  bool execucao = true; // Variável para encerrar o loop while
  int opcao, quantPets; // Variável para receber uma opcão do usuário / quantidade de pets a serem registrados
  string nomeArquivo, linha; // Variável para ler o nome do arquivo na tela / ler linhas do arquivo
  char simOuNao;
  // Variáveis para ler dados da tela 
  string nome, especie, raca, cor, motivoVisita, dono;
  char genero;
  int idade, dia, mes, codigo;
  float altura, peso;

  cout << "Boas-vindas ao Happy Pet Register!" << endl << "O que deseja fazer?" << endl << endl << "1) Criar Registro." << endl << "2) Editar Registro." << endl << "3) Ler Registro." << endl << "4) Deletar Registro." << endl << "5) Sair do programa." << endl;
  while(execucao){
    cout << "? ";
    cin >> opcao;
    switch(opcao){
      case 1: {
        cout << endl;
        cout << "--- Criando Registro ---" << endl;
        cout << "Insira o nome do arquivo (.dat): ";
        cin >> nomeArquivo;
        ofstream criaRegistro(nomeArquivo, ios::out);
        if( !criaRegistro ){
          cout << "Erro ao abrir o arquivo para escrita." << endl;
          exit(1);
        }
        cout << "Quantos pets serão registrados? ";
        cin >> quantPets;
        cin.ignore();
        
        Pet *pets[quantPets];
        criaRegistro << "--- Registro ---" << endl;
        for(int i = 0; i < quantPets; i++){
          pets[i] = new Pet();
          cout << endl;
          cout << "Nome: ";
          getline(cin, nome);
          pets[i]->setNome(nome);
          cout << "Espécie: ";
          getline(cin, especie);
          pets[i]->setEspecie(especie);
          cout << "Raça: ";
          getline(cin, raca);
          pets[i]->setRaca(raca);
          cout << "Idade: ";
          cin >> idade;
          cin.ignore();
          pets[i]->setIdade(idade);
          cout << "Gênero: ";
          cin >> genero;
          cin.ignore();
          pets[i]->setGenero(genero);
          cout << "Altura: ";
          cin >> altura;
          pets[i]->setAltura(altura);
          cin.ignore();
          cout << "Peso: ";
          cin >> peso;
          pets[i]->setPeso(peso);
          cin.ignore();
          cout << "Cor: ";
          getline(cin, cor);
          pets[i]->setCor(cor);
          cout << "Dono: ";
          getline(cin, dono);
          pets[i]->setDono(dono);
          cout << "Código: ";
          cin >> codigo;
          cin.ignore();
          pets[i]->setCodigo(codigo);
          cout << "Motivo da consulta: ";
          getline(cin, motivoVisita);
          pets[i]->setMotivo(motivoVisita);
          cout << "Data (DD MM): ";
          cin >> dia >> mes;
          cin.ignore();
          pets[i]->setDia(dia);
          pets[i]->setMes(mes);
          
          criaRegistro << endl;
          criaRegistro << "Nome: " << pets[i]->getNome() << "." << endl;
          criaRegistro << "Codigo: " << pets[i]->getCodigo() << "." << endl;
          criaRegistro << "Espécie: " << pets[i]->getEspecie() << "." << endl;
          criaRegistro << "Raça: " << pets[i]->getRaca() << "." << endl;
          criaRegistro << "Idade: " << pets[i]->getIdade() << "." << endl;
          criaRegistro << "Gênero: " << pets[i]->getGenero() << "." << endl;
          criaRegistro << "Altura: " << pets[i]->getAltura() << " cm." << endl;
          criaRegistro << "Peso: " << pets[i]->getPeso() << " kg." << endl;
          criaRegistro << "Cor: " << pets[i]->getCor() << "." << endl;
          criaRegistro << "Dono: " << pets[i]->getDono() << "." << endl;
          criaRegistro << "Motivo da consulta: " << pets[i]->getMotivo() << "." << endl;
          criaRegistro << "Data: " << pets[i]->getDia() <<"/" << pets[i]->getMes() << "." << endl;
        }

        for(int i = 0; i < quantPets; i++){
          delete pets[i];
        }

        criaRegistro.close();
        cout << "Registro criado com sucesso!" << endl;
        break;
      }
      case 2: {
        cout << endl;
        cout << "--- Editando Registro ---" << endl;
        cout << "Insira o nome do arquivo (.dat): ";
        cin >> nomeArquivo;
        ofstream editaRegistro(nomeArquivo, ios::app);
        if( !editaRegistro ){
          cout << "Erro ao abrir o arquivo para edição." << endl;
          exit(1);
        }  

        cout << "Quantos pets serão adicionados ao registro? ";
        cin >> quantPets;
        cin.ignore();
        
        Pet *pets[quantPets];
                for(int i = 0; i < quantPets; i++){
          pets[i] = new Pet();
          cout << endl;
          cout << "Nome: ";
          getline(cin, nome);
          pets[i]->setNome(nome);
          cout << "Espécie: ";
          getline(cin, especie);
          pets[i]->setEspecie(especie);
          cout << "Raça: ";
          getline(cin, raca);
          pets[i]->setRaca(raca);
          cout << "Idade: ";
          cin >> idade;
          cin.ignore();
          pets[i]->setIdade(idade);
          cout << "Gênero: ";
          cin >> genero;
          cin.ignore();
          pets[i]->setGenero(genero);
          cout << "Altura: ";
          cin >> altura;
          pets[i]->setAltura(altura);
          cin.ignore();
          cout << "Peso: ";
          cin >> peso;
          pets[i]->setPeso(peso);
          cin.ignore();
          cout << "Cor: ";
          getline(cin, cor);
          pets[i]->setCor(cor);
          cout << "Dono: ";
          getline(cin, dono);
          pets[i]->setDono(dono);
          cout << "Código: ";
          cin >> codigo;
          cin.ignore();
          pets[i]->setCodigo(codigo);
          cout << "Motivo da consulta: ";
          getline(cin, motivoVisita);
          pets[i]->setMotivo(motivoVisita);
          cout << "Data (DD MM): ";
          cin >> dia >> mes;
          cin.ignore();
          pets[i]->setDia(dia);
          pets[i]->setMes(mes);
                  editaRegistro << endl;
          editaRegistro << "Nome: " << pets[i]->getNome() << "." << endl;
          editaRegistro << "Codigo: " << pets[i]->getCodigo() << "." << endl;
          editaRegistro << "Espécie: " << pets[i]->getEspecie() << "." << endl;
          editaRegistro << "Raça: " << pets[i]->getRaca() << "." << endl;
          editaRegistro << "Idade: " << pets[i]->getIdade() << "." << endl;
          editaRegistro << "Gênero: " << pets[i]->getGenero() << "." << endl;
          editaRegistro << "Altura: " << pets[i]->getAltura() << " cm." << endl;
          editaRegistro << "Peso: " << pets[i]->getPeso() << " kg." << endl;
          editaRegistro << "Cor: " << pets[i]->getCor() << "." << endl;
          editaRegistro << "Dono: " << pets[i]->getDono() << "." << endl;
          editaRegistro << "Motivo da consulta: " << pets[i]->getMotivo() << "." << endl;
          editaRegistro << "Data: " << pets[i]->getDia() <<"/" << pets[i]->getMes() << "." << endl;
        }

        for(int i = 0; i < quantPets; i++){
          delete pets[i];
        }
        editaRegistro.close();
        cout << "Registro editado com sucesso!" << endl;
        break;
      }
      case 3: {
        cout << endl;
        cout << "--- Lendo Registro ---" << endl;
        cout << "Insira o nome do arquivo (.dat): ";
        cin >> nomeArquivo;
        ifstream leRegistro(nomeArquivo, ios::in);
        if( !leRegistro ){
          cout << "Erro ao abrir o arquivo para leitura." << endl;
          exit(1);
        }

        cout << endl;
        while(getline(leRegistro, linha)){
          cout << linha << endl;
        }

        leRegistro.close();
        cout << "Registro editado com sucesso!" << endl;
        break;
      }
      case 4: {
        cout << "--- Deletando Registro ---" << endl;
        cout << "Qual arquivo deseja apagar? ";
        cin.ignore();
        getline(cin, nomeArquivo);
        cout << "Tem certeza? (S para sim, N para não) ";
        cin >> simOuNao;
        if(simOuNao == 'S'){
          if (remove(nomeArquivo.c_str()) == 0) {
            cout << "Arquivo deletado!" << endl;
          } else {
            cout << "Erro ao deletar o arquivo." << std::endl;
          }
        } else if (simOuNao == 'N'){
          cout << "Operação cancelada." << endl;
        }
        break;
      }
      case 5: {
        cout << "Encerrando o programa..." << endl;
        execucao = false;
        break;
      }
      default:
        cout << "Opção inválida" << endl;
        break;
    }
  }
}